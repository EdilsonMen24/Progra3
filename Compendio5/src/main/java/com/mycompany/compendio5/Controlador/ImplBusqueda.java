
package com.mycompany.compendio5.Controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ImplBusqueda implements IBusqueda{

    @Override
    public void buscarNumero(int[] arreglo) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero a buscar"));
        List<Integer> listaPosiciones = new ArrayList<>();
        for(int i = 1; i< arreglo.length; i++){
            if(numero == arreglo[i]){
                listaPosiciones.add(i);
              
        }
      
    }
        if(listaPosiciones.isEmpty()){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " no se encuentra en el arreglo.");
        }else{
            JOptionPane.showMessageDialog(null, "El numero " + numero + " se encuentra en las posiciones " + listaPosiciones);
        }
  }   
}
