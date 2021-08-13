package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {
    public ArrayList<Paralelo> paralelos;
    protected Estudiante est;

    public Ayudante(String matricula, String nombre, String apellido) {
        super (matricula, nombre, apellido);
    }

    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos


    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
