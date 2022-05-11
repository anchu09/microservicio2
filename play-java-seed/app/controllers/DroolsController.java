

package controllers;

import entities.Diagnosis;
import entities.Patient;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import services.PatientService;

import java.util.ArrayList;
import java.util.Hashtable;

public class DroolsController {
    public static void main(String[] args) {
        DroolsController mydrool_test = new DroolsController();
       // mydrool_test.executeBusinessRule();
    }
    public Diagnosis executeBusinessRule(int id){
        Diagnosis diagnosis = new Diagnosis(1,0, Diagnosis.Riesgo.bajo);
        try{
            KieServices kieServices = KieServices.Factory.get();
            KieContainer kc = kieServices.getKieClasspathContainer();

            KieSession ksession = kc.newKieSession("exampleKS");
            if(ksession==null){
                System.out.println("La sesión es nula.");
            }else {
                System.out.println("La sesión no es nula.");

                ksession.insert(PatientService.getInstance().getPatient(id));
                ksession.fireAllRules();
                ksession.dispose();
                diagnosis=PatientService.getInstance().getPatient(id).getDiagnosis();








                //test de drools
/*
                for (int i=1; i<=100;i++) {

                    System.out.println("tengo un paciente y es el "+ PatientService.getInstance().getPatient(i).getId());
                    ksession.insert(PatientService.getInstance().getPatient(i));



                }
                ksession.fireAllRules();
                ksession.dispose();


                for (int i=1; i<=100;i++) {

                    System.out.println("las probs son: " + PatientService.getInstance().getPatient(i).getDiagnosis().getProbabilidad());


                }*/
            }

        } catch (Exception e){
            e.printStackTrace ();}
        return diagnosis;
    }
}
