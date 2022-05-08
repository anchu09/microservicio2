package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Diagnosis;
import entities.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.libs.Json;
import play.mvc.*;
import services.PatientService;
import utils.ApplicationUtil;

import java.util.Set;

public class PatientsController extends Controller {

    private static final Logger logger = LoggerFactory.getLogger("controller");

    public Result create(Http.Request request) {
        JsonNode json = request.body().asJson();
        if (json == null) {
            return badRequest(ApplicationUtil.createResponse("Expecting JSON data", false));
        }
        logger.debug("In PatientsController.create(), input is: {}", json.toString());
        Patient patient = PatientService.getInstance().addPatient(Json.fromJson(json, Patient.class));
        JsonNode jsonObject = Json.toJson(patient);
        return created(ApplicationUtil.createResponse(jsonObject, true));
    }

    /*public Result update(Http.Request request) {
        logger.debug("In PatientController.update()");
        JsonNode json = request.body().asJson();
        if (json == null) {
            return badRequest(ApplicationUtil.createResponse("Expecting Json data", false));
        }
        Patient patient = PatientService.getInstance().updatePatient(Json.fromJson(json, Patient.class));
        logger.debug("In PatientController.update(), Patient is: {}",patient);
        if (patient == null) {
            return notFound(ApplicationUtil.createResponse("Patient not found", false));
        }

        JsonNode jsonObject = Json.toJson(patient);
        return ok(ApplicationUtil.createResponse(jsonObject, true));
    }*/

    public Result update(int id) {
        logger.debug("In PatientController.update(), update patient with id: {}",id);
        JsonNode json = Json.toJson(PatientService.getInstance().getPatient(id));

        if (PatientService.getInstance().getPatient(id) == null) {
            return notFound(ApplicationUtil.createResponse("Patient with id:" + id + " not found", false));
        }
        Patient patient = PatientService.getInstance().updatePatient(Json.fromJson(json, Patient.class));
        logger.debug("In PatientController.update(), Patient is: {}",patient);
        if (patient == null) {
            return notFound(ApplicationUtil.createResponse("Patient not found", false));
        }

        JsonNode jsonObject = Json.toJson(patient);
        return ok(ApplicationUtil.createResponse(jsonObject, true));
    }

    public Result retrieve(int id) {
        logger.debug("In PatientController.retrieve(), retrieve patient with id: {}",id);
        if (PatientService.getInstance().getPatient(id) == null) {
            return notFound(ApplicationUtil.createResponse("Patient with id:" + id + " not found", false));
        }
        JsonNode jsonObjects = Json.toJson(PatientService.getInstance().getPatient(id));
        logger.debug("In PatientController.retrieve(), result is: {}",jsonObjects.toString());
        return ok(ApplicationUtil.createResponse(jsonObjects, true));
    }
    public Result retrieveDiagnose(int id) {
        logger.debug("In PatientController.retrieve(), retrieve patient diagnosis with id: {}",id);
        if (PatientService.getInstance().getPatient(id) == null) {
            return notFound(ApplicationUtil.createResponse("Patient with id:" + id + " not found", false));
        }

        DroolsController mydrool_test = new DroolsController();
        Diagnosis diagnosis =  mydrool_test.executeBusinessRule(id);



        JsonNode jsonObjects = Json.toJson(diagnosis);
        logger.debug("In PatientController.retrieve(), result is: {}",jsonObjects.toString());


        return ok(ApplicationUtil.createResponse(jsonObjects, true));
    }

    public Result listPatients() {
        Set<Patient> result = PatientService.getInstance().getAllPatients();
        logger.debug("In PatientController.listPatients(), result is: {}",result.toString());
        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonData = mapper.convertValue(result, JsonNode.class);
        return ok(ApplicationUtil.createResponse(jsonData, true));

    }

    public Result delete(int id) {
        logger.debug("In PatientController.retrieve(), delete patient with id: {}",id);
        if (!PatientService.getInstance().deletePatient(id)) {
            return notFound(ApplicationUtil.createResponse("Patient with id:" + id + " not found", false));
        }
        return ok(ApplicationUtil.createResponse("Patient with id:" + id + " deleted", true));
    }
}