package entities;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Diagnosis {
   public int estadio;
    public float probabilidad;
    public float riesgoNumerico;

    public enum Riesgo
    {
        bajo, medio, alto, critico;
    }
    public Diagnosis.Riesgo riesgo;

    Dictionary<Integer, ArrayList<String>> sintomasEstadio = new Hashtable<Integer, ArrayList<String>>();
    public Diagnosis(int estadio, float probabilidad, Riesgo riesgo) {
        this.estadio = estadio;
        this.probabilidad = probabilidad;
        this.riesgo = riesgo;
        this.sintomasEstadio = sintomasEstadio;
       this.sintomasEstadio.put(1,new ArrayList<String>());
       this.sintomasEstadio.put(2,new ArrayList<String>());
       this.sintomasEstadio.put(3,new ArrayList<String>());


    }

    public void setRiesgo(Riesgo riesgo) {
        this.riesgo = riesgo;
    }


    public Riesgo getRiesgo() {
        return riesgo;
    }


    public Dictionary<Integer, ArrayList<String>> getSintomasEstadio() {
        return sintomasEstadio;
    }

    public ArrayList<String> getListadeSintomasSegunEstadio(Integer estadio) {
        return sintomasEstadio.get(estadio);
    }


    public void setSintomasEstadio(Dictionary<Integer, ArrayList<String>> sintomasEstadio) {
        this.sintomasEstadio = sintomasEstadio;
    }


    public void setEstadio(int estadio) {
        this.estadio = estadio;
    }


    public void setProbabilidad(float probabilidad) {
        this.probabilidad = probabilidad;
    }

    public int getEstadio() {
        return estadio;
    }

    public float getProbabilidad() {
        return probabilidad;
    }

    public void actualizadiccionario(int posiciondiccionario,String sintoma){
        sintomasEstadio.get(posiciondiccionario).add(sintoma);

    }
    public float getRiesgoNumerico() {
        return riesgoNumerico;
    }

    public void setRiesgoNumerico(float riesgoNumerico) {
        this.riesgoNumerico = riesgoNumerico;
    }
public float returnRiesgoEdad(int edad){
        return (float)Math.pow(Math.E,0.051*edad-0.5);
}

public float returnRiesgoEnfermedades(int gravedad_otras_enfermedades){
    return (float)Math.pow(gravedad_otras_enfermedades,2.8);
}


    @Override
    public String toString() {
        return "Diagnosis{" +
                "estadio=" + estadio +
                ", probabilidad=" + probabilidad +
                ", riesgo=" + riesgo +
                ", sintomasEstadio=" + getListadeSintomasSegunEstadio(estadio)+

                '}';
    }
}
