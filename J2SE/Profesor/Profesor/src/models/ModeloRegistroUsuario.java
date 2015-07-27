package models;

public class ModeloRegistroUsuario extends ModeloBD {
    
    private int id;
    private String nombres;
    private String apellidos;
    private int cedula;
    private String correo;
    private int estadocivil;
    private int nacionalidad;
    private String fechanacimieno;
    private int tflmovil;
    private int tlffijo;
    private String bbpin;
    private String whatsapp;
    private int idparroquia;
    private int idsector;
    private String direccion;
    private String usario;
    private String password;
    private int rol;
    private String fecharegistro;
    private String fechamodificacion;
    
    public ModeloRegistroUsuario(
            int Id,
            String Nombres,
            String Apellidos,
            int Cedula,
            String Correo,
            int Estadocivil,
            int Nacionalidad,
            String Fechanacimieno,
            int Tflmovil,
            int Tlffijo,
            String Bbpin,
            String Whatsapp,
            int Idparroquia,
            int Idsector,
            String Direccion,
            String Usario,
            String Password,
            int Rol,
            String Fecharegistro,
            String Fechamodificacion
    ) {
        super();
        setId(Id);
        setNombres(Nombres);
        setApellidos(Apellidos);
        setCedula(Cedula);
        setCorreo(Correo);
        setEstadocivil(Estadocivil);
        setNacionalidad(Nacionalidad);
        setFechanacimieno(Fechanacimieno);
        setTflmovil(Tflmovil);
        setTlffijo(Tlffijo);
        setBbpin(Bbpin);
        setWhatsapp(Whatsapp);
        setIdparroquia(Idparroquia);
        setIdsector(Idsector);
        setDireccion(Direccion);
        setUsario(Usario);
        setPassword(Password);
        setRol(Rol);
        setFecharegistro(Fecharegistro);
        setFechamodificacion(Fechamodificacion);
        
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombres() {
        return nombres;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public int getCedula() {
        return cedula;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int getEstadocivil() {
        return estadocivil;
    }
    
    public void setEstadocivil(int estadocivil) {
        this.estadocivil = estadocivil;
    }
    
    public int getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNacionalidad(int nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public String getFechanacimieno() {
        return fechanacimieno;
    }
    
    public void setFechanacimieno(String fechanacimieno) {
        this.fechanacimieno = fechanacimieno;
    }
    
    public int getTflmovil() {
        return tflmovil;
    }
    
    public void setTflmovil(int tflmovil) {
        this.tflmovil = tflmovil;
    }
    
    public int getTlffijo() {
        return tlffijo;
    }
    
    public void setTlffijo(int tlffijo) {
        this.tlffijo = tlffijo;
    }
    
    public String getBbpin() {
        return bbpin;
    }
    
    public void setBbpin(String bbpin) {
        this.bbpin = bbpin;
    }
    
    public String getWhatsapp() {
        return whatsapp;
    }
    
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    
    public int getIdparroquia() {
        return idparroquia;
    }
    
    public void setIdparroquia(int idparroquia) {
        this.idparroquia = idparroquia;
    }
    
    public int getIdsector() {
        return idsector;
    }
    
    public void setIdsector(int idsector) {
        this.idsector = idsector;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getUsario() {
        return usario;
    }
    
    public void setUsario(String usario) {
        this.usario = usario;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getRol() {
        return rol;
    }
    
    public void setRol(int rol) {
        this.rol = rol;
    }
    
    public String getFecharegistro() {
        return fecharegistro;
    }
    
    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    
    public String getFechamodificacion() {
        return fechamodificacion;
    }
    
    public void setFechamodificacion(String fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
}
