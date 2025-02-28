
package com.mycompany.compendioejericios.Modelo.Ejercicio2;

import com.mycompany.compendioejericios.Controlador.Ejercicio2.ImplementsNumeroIngreso;
import javax.swing.JOptionPane;


public class NumeroIngreso {
   private int [] numeros;
   ImplementsNumeroIngreso numIngreso = new ImplementsNumeroIngreso();
   private int menor = 0;
   private int mayor = 0;
   private double promedio = 0;
   

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    public void ingresoNumeros(){
        int cantidad;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros"));
        numeros = new int[cantidad];
        for(int i= 0; i<cantidad; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion " + (i+1)));
        }
        JOptionPane.showMessageDialog(null,"El mayor es " + numIngreso.numeroMayor(numeros, mayor));
        JOptionPane.showMessageDialog(null,"El menor es "+ numIngreso.numeroMenor(numeros, menor));
        JOptionPane.showMessageDialog(null, "El promedio es " + numIngreso.promedio(numeros, promedio));
    }
    
   
}
