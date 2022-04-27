package controllers;

import entities.Patient;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolTest {
    public static void main(String[] args) {
        DroolTest mydrool_test = new DroolTest();
        mydrool_test.executeBusinessRule();
    }
    public void executeBusinessRule(){
        try{
            KieServices kieServices = KieServices.Factory.get();
            KieContainer kc = kieServices.getKieClasspathContainer();

            KieSession ksession = kc.newKieSession("exampleKS");
            if(ksession==null){
                System.out.println("La sesión es nula.");
            }else {
                System.out.println("La sesión no es nula.");


            //cambiar esto por coger el paciente de la tabla hash y actualizar su propio diagnostico y todo eso
                Patient p1= new Patient();
                p1.setTemperatura(39);
                p1.setT(Patient.Tos.no_productiva);
                p1.setCansancio(true);
                p1.setContacto_con_positivo(true);
                p1.setDisnea(true);
                p1.setDolor_cabeza(true);
                p1.setDolor_garganta(true);



                ksession.insert(p1);
                ksession.fireAllRules();
                ksession.dispose(); // Stateful rule session must always be disposed when finished
                //System.out.println("The cashback for this payment channel VIA KIE"+my_payment_offer.getChannel());

                System.out.println("la probabilidad de covid es: " + p1.getDiagnostico().getProbabilidad());

            }

        } catch (Exception e){
            e.printStackTrace ();}

    }
}
