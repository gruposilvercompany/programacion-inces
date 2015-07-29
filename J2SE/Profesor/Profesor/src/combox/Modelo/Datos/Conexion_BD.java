package combox.Modelo.Datos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion_BD
{
  private static String driver = "com.mysql.jdbc.Driver";
  private static String url = "jdbc:mysql://localhost:3306/safe_cgev";
  public static String user = "safe_cgev";
  public static String psw = "$afe_#gev.1234.";

  public static Connection obtenerConexion()
    {
        Connection connection=null;
        try
        {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,psw);
        }
        catch (Exception e)
        {
          return null;
        }
         return connection;
    }
}
