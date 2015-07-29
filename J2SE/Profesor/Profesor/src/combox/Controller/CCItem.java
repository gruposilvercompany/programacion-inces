package combox.Controller;


import combox.Modelo.Datos.CDItem;
import combox.Modelo.Entidad.CEItem;
import java.util.List;


public class CCItem
{
    public static List<CEItem> listarItem()
    {
         return CDItem.listaItem();
    }
}
