
package Controlador;


import Modelo.Estudiantes;



public class EstudiantesImpl implements IEstudiantes {

    @Override
    public String guardarEstudiante(Estudiantes estudiante) {
       Estudiantes estu = new Estudiantes();
       estu.setNombre(estudiante.getNombre());
       estu.setNota(estudiante.getNota());
       
       
       return "Estudiante guardado correctamente";
    }

    @Override
    public void eliminarEstudiante(String nombre) {
       boolean resultado = false;
       Estudiantes estudiante = new Estudiantes();
       if(estudiante.getNombre().equals(nombre)){
           System.out.println(estudiante);
       }
       
    }

    @Override
    public boolean verEstudiante(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
