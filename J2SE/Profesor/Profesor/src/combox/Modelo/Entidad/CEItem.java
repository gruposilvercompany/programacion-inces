package combox.Modelo.Entidad;
public class CEItem
{
    private int id_Item;
    private String descripcion;
    private double precio;

    public int getId_Item()
    {
        return id_Item;
    }
    public void setId_Item(int id_Item)
    {
        this.id_Item = id_Item;
    }
    public String getDescripcion()
    {
        return descripcion;
    }
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    public double getPrecio()
    {
        return precio;
    }
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public String toString()
    {
        return this.descripcion;
    }
}
