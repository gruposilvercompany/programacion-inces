package combox.Controller;

import combox.Modelo.Datos.CDItem;
import combox.Modelo.Entidad.CEItem;
import combox.View.FramePrincipal;
import java.util.List;

public class CCItem {

    FramePrincipal framePrincipal;
    CDItem cDItem;

    public CCItem(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    public void cargarItemsComboBox() {
        List<CEItem> oListaItem = cDItem.listaItem();
        if (oListaItem != null) {
            int size = oListaItem.size();
            for (int i = 0; i < size; i++) {
                framePrincipal.CbxItem.addItem(oListaItem.get(i));
                System.out.println(oListaItem.get(i));
            }
        }
    }
}
