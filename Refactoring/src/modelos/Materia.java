package modelos;
import java.util.ArrayList;
public class Materia {
    private String codigo;
    private String nombre;
    private String facultad;
    private double notaInicial;
    private double notaFinal;
    private double notaTotal;
    private double nexamen;
    private double ndeberes;
    private double nlecciones;
    private double ntalleres;
    public double getNexamen() {
        return nexamen;
    }
    public void setNexamen(double nexamen) {
        this.nexamen = nexamen;
    }
    public double getNdeberes() {
        return ndeberes;
    }
    public void setNdeberes(double ndeberes) {
        this.ndeberes = ndeberes;
    }
    public double getNlecciones() {
        return nlecciones;
    }
    public void setNlecciones(double nlecciones) {
        this.nlecciones = nlecciones;
    }
    public double getNtalleres() {
        return ntalleres;
    }
    public void setNtalleres(double ntalleres) {
        this.ntalleres = ntalleres;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public double getNotaInicial() {
        return notaInicial;
    }
    public void setNotaInicial(double notaInicial) {
        this.notaInicial = notaInicial;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    public double getNotaTotal() {
        return notaTotal;
    }
    public void setNotaTotal(double notaTotal) {
        this.notaTotal = notaTotal;
    }

    public double CalcularNotaTotal(Paralelo p,ArrayList<Paralelo> paralelos){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(notaInicial+notaFinal)/2;
                
            }
        }
        return notaTotal;
    }
    public double CalcularNota(Estudiante e, Paralelo p){
        double notaInicial=0;
        for(Paralelo par:e.paralelos){
            if(p.equals(par)){
                double notaTeorico=(this.nexamen+this.ndeberes+this.nlecciones)*0.80;
                double notaPractico=(this.ntalleres)*0.20;
                notaInicial=notaTeorico+notaPractico;
            }
        }
        return notaInicial;
    }
    
}