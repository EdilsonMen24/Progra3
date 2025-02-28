
package com.mycompany.compendio3.Controlador;

import com.mycompany.compendio3.Modelo.Circulo;
import static java.lang.Math.PI;


public class ImplementsCirculo implements ICirculo{

    @Override
    public double calcularArea(Circulo circulo) {
        double area = 0.0;
        area = (circulo.getRadio()*circulo.getRadio()) * PI;
        return area;
    }

    @Override
    public double calcularCircunferencia(Circulo circulo) {
        double circunferencia = 0.0;
        circunferencia = (2*PI)*circulo.getRadio();
        return circunferencia;
    }
    
}
