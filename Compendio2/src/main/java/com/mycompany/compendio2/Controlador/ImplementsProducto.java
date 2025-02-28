
package com.mycompany.compendio2.Controlador;

import com.mycompany.compendio2.Modelo.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ImplementsProducto implements IProducto {

    @Override
    public String agregarProducto(DefaultTableModel modelo, Producto producto) {
        modelo.addRow(new Object[]{producto.getNombre(), producto.getPrecio(), producto.getCantidad()});
        return "Producto agregado a la tabla";
    }

    @Override
    public void mostrarListaProductos(DefaultTableModel modelo) {
        for(int i = 0; i<modelo.getRowCount(); i++){
            
            //JOptionPane.showMessageDialog(null, modelo.getValueAt(i, ) );
        }
    }

    @Override
    public double calcularTotal(DefaultTableModel modelo) {
        double suma = 0;
        double valorTotal = 0.0;
        double total = 0;
        for(int i = 0; i< modelo.getRowCount(); i++){
            suma += (int) modelo.getValueAt(i, 1);
            total += suma *(int) modelo.getValueAt(i, 2);
        }
        return valorTotal = total;
    }
    
}
