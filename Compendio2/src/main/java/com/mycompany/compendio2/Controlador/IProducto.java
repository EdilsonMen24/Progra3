
package com.mycompany.compendio2.Controlador;

import com.mycompany.compendio2.Modelo.Producto;
import javax.swing.table.DefaultTableModel;


public interface IProducto {
    public String agregarProducto(DefaultTableModel modelo, Producto producto);
    public void mostrarListaProductos(DefaultTableModel modelo);
    public double calcularTotal(DefaultTableModel modelo);
}
