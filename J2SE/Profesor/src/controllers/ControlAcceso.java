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

        if (usuario.validarUsuario(vista.getUsuario(), vista.getClave())) {
           JOptionPane.showMessageDialog(null, "<html><h3 color='#336633'>Bienvenido(a) al Curso de programacion del Inces","Acceso Consedido",JOptionPane.QUESTION_MESSAGE);
	
            vista.jInternalFrame.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "<html>"
                    + "<h2 color='RED'>El Usuario y La Clave Son Incorrectos", null, JOptionPane.ERROR_MESSAGE);

        }
    }

}//FIN METODO


