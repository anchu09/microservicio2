package entities;

public class Diagnosis {
   public int estadio;
    public float probabilidad;

    public Diagnosis(int estadio, float probabilidad ) {
        this.estadio = estadio;
        this.probabilidad = probabilidad;
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
}
