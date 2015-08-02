//MODELO: MODELO USUARIO
package models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ModeloAcceso extends ModeloBD {

    private String nbUsuario;
    private String clave;

    public boolean validarUsuario(String lcUsuario, String lcClave) {
        boolean sw = false;
        nbUsuario = lcUsuario;
        clave = lcClave;
        String sql = "SELECT * FROM tbl_usuario WHERE usario = '" + nbUsuario + "' AND password ='" + clave + "' AND estatus_usuario='Activo'";
        abrirConexion();
        ResultSet rs = cargarSGenerico(sql);
        try {
            if (rs.next()) {
                sw = true;
                //tipo=rs.getString("tipo");
                //estatus=rs.getString("estatus");
            } else {
                nbUsuario = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        cerrarConexion();
        return sw;
    }

    /**
     * @return the nbUsuario
     * @uml.property name="nbUsuario"
     */
}
