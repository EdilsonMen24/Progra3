/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compendioejericios.Controlador;



/**
 *
 * @author HP
 */
public class ImplementsLibro implements ILibro {

    @Override
    public double descuentoLibro(int fecha, double precio){
        int fechaLimiteInferior = 2000;
        int fechaLimiteSuperior = 2001;
        double resultado;
        double descuento;
        if(fecha < fechaLimiteInferior){
            descuento = 0.1;
            resultado= precio*=descuento;
        }else{
            descuento = 0.05;
            resultado= precio*=descuento;   
        }
        return resultado;
    }
    
}
