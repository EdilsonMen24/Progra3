/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compendio5;

import com.mycompany.compendio5.Controlador.ImplBusqueda;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Compendio5 {

    public static void main(String[] args) {
        ImplBusqueda impl = new ImplBusqueda();
        int arreglo[] = new int[10];
        
        for(int i = 0; i< arreglo.length; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero " + (i+1)));
        }
        
        impl.buscarNumero(arreglo);
        
    }
}
