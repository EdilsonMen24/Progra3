
package com.mycompany.compendio6;

import com.mycompany.compendio6.Controlador.ImpleMatriz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class FormDiagonalPrincipal extends javax.swing.JFrame implements ActionListener{
    int matriz[][];
    ImpleMatriz impl;
    
    public FormDiagonalPrincipal() {
        initComponents();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,400);
        btnLlenar.addActionListener(this);
        btnSumar.addActionListener(this);
        impl = new ImpleMatriz();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLlenar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnLlenar.setText("LLenar Matriz");

        btnSumar.setText("Sumar Diagonal Principal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnLlenar)
                .addGap(18, 18, 18)
                .addComponent(btnSumar)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLlenar)
                    .addComponent(btnSumar))
                .addGap(166, 166, 166))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 370, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLlenar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnLlenar){
            matriz = new int[3][3];
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz.length; j++){
                matriz[i][j] = (int) (Math.random()*100);
            }
        }
         for(int i = 0; i<matriz.length; i++){
             System.out.println();
            for(int j = 0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
                
            }
            
        }
        }
        if(e.getSource() == btnSumar){
            JOptionPane.showMessageDialog(null,impl.sumaDiagonalPrincipal(matriz));
        }
    }
}
