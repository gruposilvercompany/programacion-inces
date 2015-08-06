//MODELO:  MODELOBD
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModeloBD {
    private final String driver = "com.mysql.jdbc.Driver";
    private final String bd = "cursoinces";
    private final String url = "jdbc:mysql://localhost/" + bd;
    private final String usr = "root";
    private final String clave = "";
    public Connection conn = null;

    public Connection abrirConexion() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usr, clave);
            conn.setAutoCommit(false);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    protected final ResultSet consultarSQL(Connection conn, String sql) {
        // TODO Auto-generated method stub
        ResultSet rs = null;
        Statement stm = null;
        try {
            //creamos la sentencia 
            stm = conn.createStatement();
            //ejecutamos la sentencia y la guardamos en un resultset
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    protected final void cerrarConexion() {
        if (conn != null) {
            try {
                conn.setAutoCommit(true);//guarda los cambios pendientes
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        conn = null;
    }

    protected final ResultSet cargarSGenerico(String sql) {
        Statement stm = null;
        ResultSet rs = null;
        if (conn != null) {
            try {
                stm = conn.createStatement();
                rs = stm.executeQuery(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rs;
    }

    protected final boolean cargarIUDGenerico(String sql) {
        boolean sw = false;
        Statement stm = null;
        if (conn != null) {
            try {
                stm = conn.createStatement();
                if (stm.executeUpdate(sql) > 0) {
                    sw = true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sw;
    }

}
