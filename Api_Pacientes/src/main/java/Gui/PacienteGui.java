package Gui;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.net.HttpURLConnection;
import java.net.URL;

public class PacienteGui extends JFrame {
    private JFrame frame;
    private JTextField txtId, txtnombre, txtEdad, txtDiagnostico;
    private JPanel panel;
    public void Ventana(){
        setTitle("Formulario de Pacientes");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel();
        add(panel);

        JLabel lNombre = new JLabel("Nombre: ");
        JLabel lEdad = new JLabel("Edad: ");
        JLabel lDiagnostico = new JLabel("Diagnostico: ");

        panel.add(lNombre);
        panel.add(lEdad);
        panel.add(lDiagnostico);

        JTextField txtId = new JTextField();
        JTextField txtNombre = new JTextField();
        JTextField txtEdad = new JTextField();
        JTextField txtDiagnostico = new JTextField();
        panel.add(txtId);
        panel.add(txtNombre);
        panel.add(txtEdad);
        panel.add(txtDiagnostico);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> guardar());
        panel.add(btnGuardar);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(e -> limpiar());
        panel.add(btnLimpiar);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(e -> eliminar());
        panel.add(btnEliminar);
        
        }

    private void eliminar() {
        try{
            int id = Integer.parseInt(txtId.getText());
            if(id == 0){
                JOptionPane.showMessageDialog(frame, "El id del paciente no existe");
            }
            URL url = new URL("http;//localhost:8080/api/pacientes/" + id);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("DELETE");
            if(conexion.getResponseCode() == 200){
                JOptionPane.showMessageDialog(frame, "Paciente eliminado correctamente");
            }else{
                JOptionPane.showMessageDialog(frame, "Error al eliminar el paciente");
            }
            limpiar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Error al eliminar el paciente");
        }
    }

    private void limpiar() {
        txtnombre.setText("");
        txtEdad.setText("");
        txtDiagnostico.setText("");
    }

    private void guardar() {
        try{
            String nombre = txtnombre.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String diagnostico = txtDiagnostico.getText();
            if(nombre.isEmpty() || edad == 0 || diagnostico.isEmpty()){
                JOptionPane.showMessageDialog(panel, "Debes llenar los campos");
                return;
            }
//Falta importar EL JSONObject
            JSONObject objeto = new JSONObject();
            objeto.put("nombre", nombre);
            objeto.put("edad", edad);
            objeto.put("diagnostico", diagnostico);
//Configuramos la conexion
            URL url = new URL("http://localhost:8080/api/pacientes/crear");
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("POST");
            conexion.setRequestProperty("Content-Type", "application/json");
            conexion.setDoOutput(true);

//Enviamos los datos
            conexion.getOutputStream().write(objeto.toString().getBytes());
            conexion.getOutputStream().flush();
            conexion.getOutputStream().close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(frame, "Error al guardar al paciente");
        }

    }


}

