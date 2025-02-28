
package Modelo;

import javax.swing.JOptionPane;


public class Estudiantes {
    private String nombre;
    private int cantidad;
    private String nombres[] = {};
    private int nota;
    private int notas[] = {};
    public Estudiantes(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    
    
    
    
    
    
    public void crearListaEstudiates(){
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
        for(int i = 0; i< cantidad; i++){
           nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
           nombres[i] = nombre;
           for(int j = 0; j<cantidad; j++){
            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del estudiante " + i+1));
            notas[j] = nota;
        }
        }
        
    }
    
   
    
}
