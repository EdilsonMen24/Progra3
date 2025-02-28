
package com.mycompany.compendio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class FormListaOrdenada extends javax.swing.JFrame implements ActionListener {
    int arreglo[];
    int cantidad;
    
    public FormListaOrdenada() {
        initComponents();
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la cantidad de numeros"));
        arreglo = new int[cantidad];
        for(int i = 0; i< cantidad; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingresa el numero en la posicion " + (i+1)));
            
        }
        setVisible(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
        btnOrdenar.addActionListener(this);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOrdenar.setText("Ordenar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(btnOrdenar)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnOrdenar)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnOrdenar){
            for(int j = 0; j<cantidad-1; j++){
                
                for(int i = 0; i< cantidad-1; i++){
                    if(arreglo[i] > arreglo[i+1]){
                        int auxiliar = arreglo[i];
                        arreglo[i] = arreglo[i+1];
                        arreglo[i+1] = auxiliar;
                    }
                }
            }
            for(int i = 0; i< cantidad; i++){
                JOptionPane.showMessageDialog(this, arreglo[i]);
            }
        }
    }
}
