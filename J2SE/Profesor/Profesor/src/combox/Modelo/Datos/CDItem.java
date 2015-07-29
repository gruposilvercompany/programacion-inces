package combox.Modelo.Datos;
import combox.Modelo.Entidad.CEItem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CDItem
{
   public static List<CEItem> listaItem()
   {
       Connection conexion=null;
       try
       {
        conexion=Conexion_BD.obtenerConexion();
        String sql="Select * from tbl_maestro where clvpadre  = 13";
        Statement st=conexion.createStatement();
        ResultSet rs=st.executeQuery(sql);
        List<CEItem> oListItem=new ArrayList<CEItem>();
       while(rs.next())
            {
               CEItem oItem=new CEItem();
               oItem.setId_Item(rs.getInt("clvcodigo"));
               oItem.setDescripcion(rs.getString("stritem_a"));
             //  oItem.setPrecio(rs.getDouble("precio"));
               oListItem.add(oItem);
            }
        return oListItem;
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
           return null;
       }
       finally
       {
            try
            {
            conexion.close();
            }
            catch (SQLException ex)
            {
              ex.printStackTrace();
            }
       }
   }
}
