package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {
    public ArrayList<Paralelo> paralelos;
    public String getMatricula() {
        return this.getMatricula();
    }

    public void setMatricula(String matricula) {
        this.setMatricula(matricula);
    }

    //Getters y setters se delegan en objeto estudiante para no duplicar código
    public String getNombre() {
        return this.getNombre();
    }

    public String getApellido() {
        return this.getApellido();
    }

    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos


    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
