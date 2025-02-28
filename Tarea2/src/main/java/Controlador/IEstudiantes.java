
package Controlador;

import Modelo.Estudiantes;


public interface IEstudiantes {
    public String guardarEstudiante(Estudiantes estudiante);
    public void eliminarEstudiante(String nombre);
    public boolean verEstudiante(int id);
}
