package entities;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Objects;

public class Patient {
    public float temperatura;
    public enum Tos
    {
        no_productiva, productiva, seca_falsa,crónica;
    }
    public Tos tos;

    public Tos getT() {
        return tos;
    }

    public void setT(Tos tos) {
        this.tos = tos;
    }

    public Patient() {
        this.Diagnosis= new Diagnosis(0,0, entities.Diagnosis.Riesgo.bajo);
    }
    public int id;

    public boolean reduccion_viremia;
    public boolean dano_tisular;
    public boolean inflamacion_pulmon;
    public boolean neumonia_viral;
    public boolean insuficiencia_respiratoria_aguda;
    public boolean transaminasas_altas;

    public boolean insuficiencia_multiorganica;
    public boolean compromiso_pulmonar_critico;
    public boolean sindrome_tormenta_citoquinas;
    public boolean hiperinflamacion_sistemica;
    public boolean shock;
    public boolean colapso_cardiopulmonar;
    public boolean fallo_otros_organos;
public int edad;
public boolean fuma;
public float imc;
public int gravedad_otras_enfermedades;





    public Tos getTos() {
        return tos;
    }

    public void setTos(Tos tos) {
        this.tos = tos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDiagnosis(entities.Diagnosis diagnosis) {
        Diagnosis = diagnosis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return Float.compare(patient.temperatura, temperatura) == 0 && id == patient.id && cansancio == patient.cansancio && perdida_gusto_olfato == patient.perdida_gusto_olfato && disnea == patient.disnea && hipoxia == patient.hipoxia && dolor_garganta == patient.dolor_garganta && dolor_cabeza == patient.dolor_cabeza && diarrea == patient.diarrea && erupcion_cutanea == patient.erupcion_cutanea && ojos_rojos == patient.ojos_rojos && perdida_movilidad == patient.perdida_movilidad && dolor_pecho == patient.dolor_pecho && viaje_zona_afectada == patient.viaje_zona_afectada && contacto_con_positivo == patient.contacto_con_positivo && infiltraciones_pulmonares == patient.infiltraciones_pulmonares && pcr_positiva == patient.pcr_positiva && tos == patient.tos && Diagnosis.equals(patient.Diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperatura, tos, id, cansancio, perdida_gusto_olfato, disnea, hipoxia, dolor_garganta, dolor_cabeza, diarrea, erupcion_cutanea, ojos_rojos, perdida_movilidad, dolor_pecho, viaje_zona_afectada, contacto_con_positivo, infiltraciones_pulmonares, pcr_positiva, Diagnosis);
    }

    private boolean cansancio;
    private boolean perdida_gusto_olfato;
    private boolean disnea;
    private boolean hipoxia; //no llega suficiente 02 al cerebro pero no encuentro cuánto es "poco" para poderlo poner como un numero
    private boolean dolor_garganta;
    private boolean dolor_cabeza;
    private boolean diarrea;
    private boolean erupcion_cutanea;
    private boolean ojos_rojos;
    private boolean perdida_movilidad;
    private boolean dolor_pecho;
    private boolean viaje_zona_afectada;
    private boolean contacto_con_positivo;
    private boolean infiltraciones_pulmonares;
    private boolean pcr_positiva;
    private Diagnosis Diagnosis;

    public Patient(float temperatura, boolean cansancio, boolean perdida_gusto_olfato, boolean disnea, boolean hipoxia, boolean dolor_garganta, boolean dolor_cabeza, boolean diarrea, boolean erupcion_cutanea, boolean ojos_rojos, boolean perdida_movilidad, boolean dolor_pecho, boolean viaje_zona_afectada, boolean contacto_con_positivo, boolean infiltraciones_pulmonares, boolean pcr_positiva, Diagnosis Diagnosis) {
        this.temperatura = temperatura;
        this.cansancio = cansancio;
        this.perdida_gusto_olfato = perdida_gusto_olfato;
        this.disnea = disnea;
        this.hipoxia = hipoxia;
        this.dolor_garganta = dolor_garganta;
        this.dolor_cabeza = dolor_cabeza;
        this.diarrea = diarrea;
        this.erupcion_cutanea = erupcion_cutanea;
        this.ojos_rojos = ojos_rojos;
        this.perdida_movilidad = perdida_movilidad;
        this.dolor_pecho = dolor_pecho;
        this.viaje_zona_afectada = viaje_zona_afectada;
        this.contacto_con_positivo = contacto_con_positivo;
        this.infiltraciones_pulmonares = infiltraciones_pulmonares;
        this.pcr_positiva = pcr_positiva;
        this.Diagnosis = Diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "temperatura=" + temperatura +
                ", tos=" + tos +
                ", id=" + id +
                ", reduccion_viremia=" + reduccion_viremia +
                ", dano_tisular=" + dano_tisular +
                ", inflamacion_pulmon=" + inflamacion_pulmon +
                ", neumonia_viral=" + neumonia_viral +
                ", insuficiencia_respiratoria_aguda=" + insuficiencia_respiratoria_aguda +
                ", transaminasas_altas=" + transaminasas_altas +
                ", insuficiencia_multiorganica=" + insuficiencia_multiorganica +
                ", compromiso_pulmonar_critico=" + compromiso_pulmonar_critico +
                ", sindrome_tormenta_citoquinas=" + sindrome_tormenta_citoquinas +
                ", hiperinflamacion_sistemica=" + hiperinflamacion_sistemica +
                ", shock=" + shock +
                ", colapso_cardiopulmonar=" + colapso_cardiopulmonar +
                ", fallo_otros_organos=" + fallo_otros_organos +
                ", edad=" + edad +
                ", fuma=" + fuma +
                ", imc=" + imc +
                ", gravedad_otras_enfermedades=" + gravedad_otras_enfermedades +
                ", cansancio=" + cansancio +
                ", perdida_gusto_olfato=" + perdida_gusto_olfato +
                ", disnea=" + disnea +
                ", hipoxia=" + hipoxia +
                ", dolor_garganta=" + dolor_garganta +
                ", dolor_cabeza=" + dolor_cabeza +
                ", diarrea=" + diarrea +
                ", erupcion_cutanea=" + erupcion_cutanea +
                ", ojos_rojos=" + ojos_rojos +
                ", perdida_movilidad=" + perdida_movilidad +
                ", dolor_pecho=" + dolor_pecho +
                ", viaje_zona_afectada=" + viaje_zona_afectada +
                ", contacto_con_positivo=" + contacto_con_positivo +
                ", infiltraciones_pulmonares=" + infiltraciones_pulmonares +
                ", pcr_positiva=" + pcr_positiva +
                '}';
    }

    public void setInfiltraciones_pulmonares(boolean infiltraciones_pulmonares) {
        this.infiltraciones_pulmonares = infiltraciones_pulmonares;
    }

    public boolean isInfiltraciones_pulmonares() {
        return infiltraciones_pulmonares;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setCansancio(boolean cansancio) {
        this.cansancio = cansancio;
    }

    public void setPerdida_gusto_olfato(boolean perdida_gusto_olfato) {
        this.perdida_gusto_olfato = perdida_gusto_olfato;
    }

    public void setDisnea(boolean disnea) {
        this.disnea = disnea;
    }

    public void setHipoxia(boolean hipoxia) {
        this.hipoxia = hipoxia;
    }

    public void setDolor_garganta(boolean dolor_garganta) {
        this.dolor_garganta = dolor_garganta;
    }

    public void setDolor_cabeza(boolean dolor_cabeza) {
        this.dolor_cabeza = dolor_cabeza;
    }

    public void setDiarrea(boolean diarrea) {
        this.diarrea = diarrea;
    }

    public void setErupcion_cutanea(boolean erupcion_cutanea) {
        this.erupcion_cutanea = erupcion_cutanea;
    }

    public void setOjos_rojos(boolean ojos_rojos) {
        this.ojos_rojos = ojos_rojos;
    }

    public void setPerdida_movilidad(boolean perdida_movilidad) {
        this.perdida_movilidad = perdida_movilidad;
    }

    public void setDolor_pecho(boolean dolor_pecho) {
        this.dolor_pecho = dolor_pecho;
    }

    public void setViaje_zona_afectada(boolean viaje_zona_afectada) {
        this.viaje_zona_afectada = viaje_zona_afectada;
    }

    public void setContacto_con_positivo(boolean contacto_con_positivo) {
        this.contacto_con_positivo = contacto_con_positivo;
    }

    public void setInfiltrados_pulmonares(boolean infiltraciones_pulmonares) {
        this.infiltraciones_pulmonares = infiltraciones_pulmonares;
    }

    public void setPcr_positiva(boolean pcr_positiva) {
        this.pcr_positiva = pcr_positiva;
    }

    public void setDiagnostico(Diagnosis Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public boolean isCansancio() {
        return cansancio;
    }

    public boolean isPerdida_gusto_olfato() {
        return perdida_gusto_olfato;
    }

    public boolean isDisnea() {
        return disnea;
    }

    public boolean isHipoxia() {
        return hipoxia;
    }

    public boolean isDolor_garganta() {
        return dolor_garganta;
    }

    public boolean isDolor_cabeza() {
        return dolor_cabeza;
    }

    public boolean isDiarrea() {
        return diarrea;
    }

    public boolean isErupcion_cutanea() {
        return erupcion_cutanea;
    }

    public boolean isOjos_rojos() {
        return ojos_rojos;
    }

    public boolean isPerdida_movilidad() {
        return perdida_movilidad;
    }

    public boolean isDolor_pecho() {
        return dolor_pecho;
    }

    public boolean isViaje_zona_afectada() {
        return viaje_zona_afectada;
    }

    public boolean isContacto_con_positivo() {
        return contacto_con_positivo;
    }

    public boolean isInfiltrados_pulmonares() {
        return infiltraciones_pulmonares;
    }

    public boolean isPcr_positiva() {
        return pcr_positiva;
    }

    public boolean isReduccion_viremia() {
        return reduccion_viremia;
    }

    public void setReduccion_viremia(boolean reduccion_viremia) {
        this.reduccion_viremia = reduccion_viremia;
    }

    public boolean isDano_tisular() {
        return dano_tisular;
    }

    public void setDano_tisular(boolean dano_tisular) {
        this.dano_tisular = dano_tisular;
    }

    public boolean isInflamacion_pulmon() {
        return inflamacion_pulmon;
    }

    public void setInflamacion_pulmon(boolean inflamacion_pulmon) {
        this.inflamacion_pulmon = inflamacion_pulmon;
    }

    public boolean isNeumonia_viral() {
        return neumonia_viral;
    }

    public void setNeumonia_viral(boolean neumonia_viral) {
        this.neumonia_viral = neumonia_viral;
    }

    public boolean isInsuficiencia_respiratoria_aguda() {
        return insuficiencia_respiratoria_aguda;
    }

    public void setInsuficiencia_respiratoria_aguda(boolean insuficiencia_respiratoria_aguda) {
        this.insuficiencia_respiratoria_aguda = insuficiencia_respiratoria_aguda;
    }

    public boolean isTransaminasas_altas() {
        return transaminasas_altas;
    }

    public void setTransaminasas_altas(boolean transaminasas_altas) {
        this.transaminasas_altas = transaminasas_altas;
    }

    public boolean isInsuficiencia_multiorganica() {
        return insuficiencia_multiorganica;
    }

    public void setInsuficiencia_multiorganica(boolean insuficiencia_multiorganica) {
        this.insuficiencia_multiorganica = insuficiencia_multiorganica;
    }

    public boolean isCompromiso_pulmonar_critico() {
        return compromiso_pulmonar_critico;
    }

    public void setCompromiso_pulmonar_critico(boolean compromiso_pulmonar_critico) {
        this.compromiso_pulmonar_critico = compromiso_pulmonar_critico;
    }

    public boolean isSindrome_tormenta_citoquinas() {
        return sindrome_tormenta_citoquinas;
    }

    public void setSindrome_tormenta_citoquinas(boolean sindrome_tormenta_citoquinas) {
        this.sindrome_tormenta_citoquinas = sindrome_tormenta_citoquinas;
    }

    public boolean isHiperinflamacion_sistemica() {
        return hiperinflamacion_sistemica;
    }

    public void setHiperinflamacion_sistemica(boolean hiperinflamacion_sistemica) {
        this.hiperinflamacion_sistemica = hiperinflamacion_sistemica;
    }

    public boolean isShock() {
        return shock;
    }

    public void setShock(boolean shock) {
        this.shock = shock;
    }

    public boolean isColapso_cardiopulmonar() {
        return colapso_cardiopulmonar;
    }

    public void setColapso_cardiopulmonar(boolean colapso_cardiopulmonar) {
        this.colapso_cardiopulmonar = colapso_cardiopulmonar;
    }

    public boolean isFallo_otros_organos() {
        return fallo_otros_organos;
    }

    public void setFallo_otros_organos(boolean fallo_otros_organos) {
        this.fallo_otros_organos = fallo_otros_organos;
    }

    public Diagnosis getDiagnosis() {
        return this.Diagnosis;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isFuma() {
        return fuma;
    }

    public void setFuma(boolean fuma) {
        this.fuma = fuma;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public int getGravedad_otras_enfermedades() {
        return gravedad_otras_enfermedades;
    }

    public void setGravedad_otras_enfermedades(int gravedad_otras_enfermedades) {
        this.gravedad_otras_enfermedades = gravedad_otras_enfermedades;
    }
}
