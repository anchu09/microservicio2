package services;
 
import entities.Patient;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
 
public class PatientService {
    private static PatientService instance;
    private Map<Integer, Patient> patients = new HashMap<>();
 public static void PatientsToList(){
     for (int i=1; i<=100;i++){
         Patient p1 = new Patient();
         p1.setTemperatura((float) (Math.random()*5 + 35));
         p1.setEdad((int) (Math.random()*100));
        p1.setFuma(RandomBoolean());
        p1.setImc((float) (Math.random()*26 +19));
        p1.setGravedad_otras_enfermedades((int)Math.random()*5);
         int randomTos= (int) (Math.random()*3);
         switch (randomTos)
         {
             case 0:  p1.setTos(Patient.Tos.no_productiva);
                 break;
             case 1:  p1.setTos(Patient.Tos.productiva);
                 break;
             case 2: p1.setTos(Patient.Tos.seca_falsa);
                 break;
             case 3:  p1.setTos(Patient.Tos.crónica);
                 break;

             default: p1.setTos(Patient.Tos.no_productiva);
                 break;
         }
         p1.setCansancio(RandomBoolean());
         p1.setPerdida_gusto_olfato(RandomBoolean());

         p1.setDisnea(RandomBoolean());
         p1.setHipoxia(RandomBoolean());
         p1.setDolor_garganta(RandomBoolean());
         p1.setDolor_cabeza(RandomBoolean());
         p1.setDiarrea(RandomBoolean());

         p1.setErupcion_cutanea(RandomBoolean());
         p1.setOjos_rojos(RandomBoolean());
         p1.setPerdida_movilidad(RandomBoolean());
         p1.setDolor_pecho(RandomBoolean());
         p1.setViaje_zona_afectada(RandomBoolean());
         p1.setContacto_con_positivo(RandomBoolean());
         p1.setInfiltraciones_pulmonares(RandomBoolean());
         p1.setPcr_positiva(RandomBoolean());
         p1.setReduccion_viremia(RandomBoolean());
         p1.setDano_tisular(RandomBoolean());
         p1.setInflamacion_pulmon(RandomBoolean());
         p1.setNeumonia_viral(RandomBoolean());

         p1.setInsuficiencia_respiratoria_aguda(RandomBoolean());
         p1.setTransaminasas_altas(RandomBoolean());
         p1.setInsuficiencia_multiorganica(RandomBoolean());
         p1.setColapso_cardiopulmonar(RandomBoolean());
         p1.setSindrome_tormenta_citoquinas(RandomBoolean());
         p1.setHiperinflamacion_sistemica(RandomBoolean());
         p1.setShock(RandomBoolean());
         p1.setColapso_cardiopulmonar(RandomBoolean());
         p1.setFallo_otros_organos(RandomBoolean());

         getInstance().addPatient(p1);
     }



     }
    public static boolean RandomBoolean() {
        int random = (int) (Math.random() * 2);
        boolean bool=false;
        if (random==1){
            bool=true;
        }else{
            bool=false;
        }
        return bool;
    }
    public static PatientService getInstance() {
        if (instance == null) {

            instance = new PatientService();
            PatientsToList();

        }
        return instance;
    }
 
    public Patient addPatient(Patient patient) {
        int id = patients.size()+1;
        patient.setId(id);
        patients.put(id, patient);
        return patient;
    }
 
    public Patient getPatient(int id) {
        return patients.get(id);
    }
 
    public Set<Patient> getAllPatients() {
        return new HashSet<>(patients.values());
    }
 
    public Patient updatePatient(Patient patient) {
        int id = patient.getId();
        if (patients.containsKey(id)) {
            patients.put(id, patient);
            return patient;
        }
        return null;
    }
 
    public boolean deletePatient(int id) {
        return patients.remove(id) != null;
    }
}