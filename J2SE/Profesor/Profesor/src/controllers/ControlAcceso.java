//CONTROLADOR : CONTROL ACCESO
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import javax.swing.JOptionPane;
import models.ModeloAcceso;
import views.Principal;

/**
 * @author JUAN AJOSE
 */
public class ControlAcceso extends WindowAdapter implements ActionListener {

    private Principal vista;
    private ModeloAcceso usuario;

    public ControlAcceso(Principal acceso_Sistema) {

        this.vista = acceso_Sistema;
        this.usuario = new ModeloAcceso();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand() == "Aceptar") {
            //System.out.println("Se Ejecuta la Accion");

            verificaEntrada();
        } else if (e.getActionCommand() == "Cancelar") {
            vista.dispose();
        }

    }

    private void verificaEntrada() {//INICIO METODO

        // System.out.println(vista.getUsuario());
       /* if ("1".equals(vista.getUsuario())) {
         System.out.println("Se Ejecuta la Accion en el Boton");
            
         } */
        if (usuario.validarUsuario(vista.getUsuario(), vista.getClave())) {
            System.out.println("Se Ejecuta la Accion en el Boton");
        } else {
            JOptionPane.showMessageDialog(null, "<html>"
                    + "<h2 color='RED'>El Usuario y La Clave Son Incorrectos", null, JOptionPane.ERROR_MESSAGE);

        }
    }

}//FIN METODO


