
package com.mycompany.compendio6.Controlador;


public class ImpleMatriz implements IMatriz{

    @Override
    public int sumaDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for(int i = 0; i<matriz.length; i++){
            suma+= matriz[i][i];
        }
        return suma;
    }
    
}
