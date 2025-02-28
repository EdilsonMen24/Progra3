
package com.mycompany.compendioejericios.ModeloEjer4;

import javax.swing.JOptionPane;


public class Estudiante {
    private String nombre;
    private int edad;
    int calificaciones[] = new int[5];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    public int calcularPromedio(int calificaciones[]){
        calificaciones = new int[5];
        int suma = 0;
        int promedio = 0;
        for(int i = 0; i< calificaciones.length; i++){
            suma+= calificaciones[i];
        }
        return promedio = suma/calificaciones.length;
    }
    
    public void IngresoDatosEstudiantes(){
        Estudiante estudiantes[] = new Estudiante[3];
        estudiantes[0] = new Estudiante();
        estudiantes[1] = new Estudiante();
        estudiantes[2] = new Estudiante();
        int suma = 0;
        int promedio = 0;
        
        int califiaciones[] = new int[5];
        
        for(int i = 0; i< estudiantes.length; i++){
            estudiantes[i].setNombre(JOptionPane.showInputDialog(null, "Ingresa el nombre del estudiante " + (i+1)));
            for(int j = 0; j< calificaciones.length; j++){
                calificaciones[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la nota " + (j+1)
                        + " del estudiante " + estudiantes[i].getNombre()));
                estudiantes[i].setCalificaciones(calificaciones);
                suma += calificaciones[i];
            }
            promedio = suma/calificaciones.length;
            JOptionPane.showMessageDialog(null, "El promedio del estudiante " + estudiantes[i].getNombre()
            + " es " + promedio);
            suma = 0;
            promedio = 0;
        }  
    }
    
  
}
