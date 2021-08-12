package modelos;
import java.util.ArrayList;
public class Materia {
    private String codigo;
    private String nombre;
    private String facultad;
    private double notaInicial;
    private double notaFinal;
    private double notaTotal;

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
    
}
