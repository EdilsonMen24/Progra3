
package com.mycompany.compendioejericios.Controlador.Ejercicio2;


public class ImplementsNumeroIngreso implements INumeroIngreso {

    @Override
    public int numeroMayor(int[] numeros, int mayor) {
        mayor = 0;
        
        for(int i= 0; i< numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    @Override
    public int numeroMenor(int[] numeros, int menor) {
        
        for(int i= 0; i< numeros.length; i++){
            menor = numeros[0];
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        return menor;
    }

    @Override
    public double promedio(int[] numeros, double promedio) {
        promedio = 0.0;
        int suma = 0;
        for(int i= 0; i< numeros.length; i++){
            suma += numeros[i];
        }
        promedio = suma/numeros.length;
        
        return promedio;
}
    
}
