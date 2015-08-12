package viewsll;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class RegitroUsuario extends JInternalFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contenedorRegistoUsuario = null;
    private JPanel contenedorDatosPersonales = null;
    private JLabel lblNombres = null;
    private JLabel lblApellidos = null;
    private JLabel lblCedula = null;
    private JLabel lblTlfMovil = null;
    private JLabel lblTlfFijo = null;
    private JLabel lblCorreo = null;
    private JLabel lblFechaNacimiento = null;
    private JLabel lblEstadoCivil = null;
    private JLabel lblPin = null;
    private JLabel lblWhatsApp = null;
    private JTextField txtNombres = null;
    private JTextField txtApellidos = null;
    private JTextField txtCedula = null;
    private JTextField txtCorreo = null;
    private JComboBox cbxEstadoCivil = null;
    private JLabel lblNacionalidad = null;
    private JComboBox cbxNacionalidad = null;
    private JTextField txtTlfMovil = null;
    private JTextField txtTlfFijo = null;
    private JTextField txtFechaNacimiento = null;
    private JTextField txtPin = null;
    private JTextField txtWhatsApp = null;
    private JPanel contenedorDatosGeograficos = null;
    private JLabel lblRegion = null;
    private JLabel lblEstado = null;
    private JLabel lblMunicipio = null;
    private JLabel lblParroquia = null;
    private JLabel lblSector = null;
    private JLabel lblDireccion = null;
    private JComboBox cbxRegion = null;
    private JComboBox cbxEstado = null;
    private JComboBox cbxMunicipio = null;
    private JComboBox cbxParroquia = null;
    private JComboBox cbxSector = null;
    private JTextField txtDireccion = null;
    private JPanel contenedorDatosCuenta = null;
    private JLabel lblUsuario = null;
    private JLabel lblContrasena = null;
    private JTextField txtNombreUsuario = null;
    private JPasswordField txtPassword = null;
    private JLabel lblRepitaContrasena = null;
    private JLabel lblRol = null;
    private JComboBox cbxRol = null;
    private JPasswordField pswRepita = null;
    private JScrollPane contenedorScrol = null;
    private JButton btnCancelar = null;
    private JButton btnLimpiar = null;
    private JButton btnAceptar = null;

    /**
     * This is the xxx default constructor
     */
    public RegitroUsuario() {
        super("Area de Nuevos Registros de Usuarios");
        initialize();
    }

    private void initialize() {
        this.setSize(830, 600);
        //this.add(getContenedorScrol(), BorderLayout.CENTER);
        this.setIconifiable(true);
        this.setFrameIcon(new ImageIcon(getClass().getResource(
                "/imagenes/Backup.png")));
        this.setContentPane(getContenedorScrol());
    }

    /**
     * This method initializes contenedorRegistoUsuario
     *
     * @return javax.swing.JPanel
     */
    private JPanel getContenedorRegistoUsuario() {
        if (contenedorRegistoUsuario == null) {
            contenedorRegistoUsuario = new JPanel();
            contenedorRegistoUsuario.setLayout(null);
            contenedorRegistoUsuario.add(getContenedorDatosPersonales(), null);
            contenedorRegistoUsuario.add(getContenedorDatosGeograficos(), null);
            contenedorRegistoUsuario.add(getContenedorDatosCuenta(), null);
            contenedorRegistoUsuario.setPreferredSize(new Dimension(700, 725));
            contenedorRegistoUsuario.add(getBtnCancelar(), null);
            contenedorRegistoUsuario.add(getBtnLimpiar(), null);
            contenedorRegistoUsuario.add(getBtnAceptar(), null);
        }
        return contenedorRegistoUsuario;
    }

    /**
     * This method initializes contenedorDatosPersonales
     *
     * @return javax.swing.JPanel
     */
    private JPanel getContenedorDatosPersonales() {
        if (contenedorDatosPersonales == null) {
            lblNacionalidad = new JLabel();
            lblNacionalidad.setBounds(new Rectangle(402, 142, 94, 25));
            lblNacionalidad.setFont(new Font("Times New Roman", Font.BOLD
                    | Font.ITALIC, 16));
            lblNacionalidad.setText("Nacionalidad");
            lblWhatsApp = new JLabel();
            lblWhatsApp.setBounds(new Rectangle(292, 252, 69, 25));
            lblWhatsApp.setFont(new Font("Times New Roman", Font.BOLD
                    | Font.ITALIC, 16));
            lblWhatsApp.setText("WhatsApp");
            lblPin = new JLabel();
            lblPin.setBounds(new Rectangle(15, 252, 50, 25));
            lblPin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC,
                    16));
            lblPin.setText("BB Pin");
            lblEstadoCivil = new JLabel();
            lblEstadoCivil.setBounds(new Rectangle(12, 142, 97, 25));
            lblEstadoCivil.setFont(new Font("Times New Roman", Font.BOLD
                    | Font.ITALIC, 16));
            lblEstadoCivil.setText("Estado Civil");
            lblFechaNacimiento = new JLabel();
            lblFechaNacimiento.setBounds(new Rectangle(12, 202, 124, 25));
            lblFechaNacimiento.setFont(new Font("Times New Roman", Font.BOLD
                    | Font.ITALIC, 16));
            lblFechaNacimiento.setText("Fecha Nacimiento");
            lblCorreo = new JLabel();
            lblCorreo.setBounds(new Rectangle(402, 90, 46, 25));
            lblCorreo.setFont(new Font("Times New Roman", Font.BOLD
                    | Font.ITALIC, 16));
            lblCorreo.setText("Correo");
            lblTlfFijo = new JLabel();
            lblTlfFijo.setBounds(new Rectangle(542, 202, 91, 25));
            lblTlfFijo.setText("Telefono Fijo");
            lblTlfFijo.setFont(new Font("Times New Roman", Font.BOLD
                    | Font.ITALIC, 16));
            lblTlfMovil = new JLabel();
            lblTlfMovil.setBounds(new Rectangle(279, 202, 109, 25));
            lblTlfMovil.setFont(new Font("Times New Roman", Font.BOLD
                    | Font.ITALIC, 16));
            lblTlfMovil.setText("Telefono Movil");
            lblCedula = new JLabel();
            lblCedula.setBounds(new Rectangle(17, 90, 52, 25));
            lblCedula.setFont(new Font("Times New Roman", Font.BOLD
                    | Font.ITALIC, 16));
            lblCedula.setText("Cedula ");
            lblApellidos = new JLabel();
            lblApellidos.setBounds(new Rectangle(402, 35, 63, 25));
            lblApellidos.setFont(new Font("Times New Roman", Font.BOLD
                    | Font.ITALIC, 16));
            lblApellidos.setText("Apellidos");
            lblNombres = new JLabel();
            lblNombres.setBounds(new Rectangle(15, 35, 59, 25));
            lblNombres.setFont(new Font("Times New Roman", Font.BOLD
                    | Font.ITALIC, 16));
            lblNombres.setText("Nombres");
            contenedorDatosPersonales = new JPanel();
            contenedorDatosPersonales.setLayout(null);
            contenedorDatosPersonales.setBounds(new Rectangle(2, 4, 792, 298));
            contenedorDatosPersonales
                    .setToolTipText("Datos Personales del Usuario");
            contenedorDatosPersonales.setBorder(BorderFactory
                    .createTitledBorder(BorderFactory.createLineBorder(
                                    Color.red, 1), "Datos Personales",
                            TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
                            new Font("Dialog", Font.PLAIN, 12), Color.blue));

            contenedorDatosPersonales.add(lblNombres, null);
            contenedorDatosPersonales.add(lblApellidos, null);
            contenedorDatosPersonales.add(lblCedula, null);
            contenedorDatosPersonales.add(lblTlfMovil, null);
            contenedorDatosPersonales.add(lblTlfFijo, null);
            contenedorDatosPersonales.add(lblCorreo, null);
            contenedorDatosPersonales.add(lblFechaNacimiento, null);
            contenedorDatosPersonales.add(lblEstadoCivil, null);
            contenedorDatosPersonales.add(lblPin, null);
            contenedorDatosPersonales.add(lblWhatsApp, null);
            contenedorDatosPersonales.add(getTxtNombres(), null);
            contenedorDatosPersonales.add(getTxtApellidos(), null);
            contenedorDatosPersonales.add(getTxtCedula(), null);
            contenedorDatosPersonales.add(getTxtCorreo(), null);

            contenedorDatosPersonales.add(getCbxEstadoCivil(), null);
            contenedorDatosPersonales.add(lblNacionalidad, null);
            contenedorDatosPersonales.add(getCbxNacionalidad(), null);
            contenedorDatosPersonales.add(getTxtTlfMovil(), null);
            contenedorDatosPersonales.add(getTxtTlfFijo(), null);
            contenedorDatosPersonales.add(getTxtFechaNacimiento(), null);
            contenedorDatosPersonales.add(getTxtPin(), null);
            contenedorDatosPersonales.add(getTxtWhatsApp(), null);

        }
        return contenedorDatosPersonales;
    }

    /**
     * This method initializes txtNombres
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtNombres() {
        if (txtNombres == null) {
            txtNombres = new JTextField();
            txtNombres.setBounds(new Rectangle(88, 35, 300, 25));
        }
        return txtNombres;
    }

    /**
     * This method initializes txtApellidos
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtApellidos() {
        if (txtApellidos == null) {
            txtApellidos = new JTextField();
            txtApellidos.setBounds(new Rectangle(479, 35, 300, 25));
        }
        return txtApellidos;
    }

    /**
     * This method initializes txtCedula
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtCedula() {
        if (txtCedula == null) {
            txtCedula = new JTextField();
            txtCedula.setBounds(new Rectangle(86, 90, 300, 25));
        }
        return txtCedula;
    }

    /**
     * This method initializes txtCorreo
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtCorreo() {
        if (txtCorreo == null) {
            txtCorreo = new JTextField();
            txtCorreo.setBounds(new Rectangle(479, 90, 300, 25));
        }
        return txtCorreo;
    }

    /**
     * This method initializes cbxEstadoCivil
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxEstadoCivil() {
        if (cbxEstadoCivil == null) {
            cbxEstadoCivil = new JComboBox();
            cbxEstadoCivil.setBounds(new Rectangle(121, 142, 249, 25));
        }
        return cbxEstadoCivil;
    }

    /**
     * This method initializes cbxNacionalidad
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxNacionalidad() {
        if (cbxNacionalidad == null) {
            cbxNacionalidad = new JComboBox();
            cbxNacionalidad.setBounds(new Rectangle(503, 142, 272, 25));
            
//            cbxNacionalidad.addItem(new ClaseObjetoParaComboBox(1,"ItemEjemploNº1"));
//cbxNacionalidad.addItem(new ClaseObjetoParaComboBox(2,"ItemEjemploNº2"));
        }
        return cbxNacionalidad;
    }

    /**
     * This method initializes txtTlfMovil
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtTlfMovil() {
        if (txtTlfMovil == null) {
            txtTlfMovil = new JTextField();
            txtTlfMovil.setBounds(new Rectangle(400, 202, 130, 25));
        }
        return txtTlfMovil;
    }

    /**
     * This method initializes txtTlfFijo
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtTlfFijo() {
        if (txtTlfFijo == null) {
            txtTlfFijo = new JTextField();
            txtTlfFijo.setBounds(new Rectangle(645, 202, 130, 25));
        }
        return txtTlfFijo;
    }

    /**
     * This method initializes txtFechaNacimiento
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtFechaNacimiento() {
        if (txtFechaNacimiento == null) {
            txtFechaNacimiento = new JTextField();
            txtFechaNacimiento.setBounds(new Rectangle(148, 202, 119, 26));
        }
        return txtFechaNacimiento;
    }

    /**
     * This method initializes txtPin
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtPin() {
        if (txtPin == null) {
            txtPin = new JTextField();
            txtPin.setBounds(new Rectangle(102, 252, 164, 25));
        }
        return txtPin;
    }

    /**
     * This method initializes txtWhatsApp
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtWhatsApp() {
        if (txtWhatsApp == null) {
            txtWhatsApp = new JTextField();
            txtWhatsApp.setBounds(new Rectangle(407, 252, 180, 27));
        }
        return txtWhatsApp;
    }

    /**
     * This method initializes contenedorDatosGeograficos
     *
     * @return javax.swing.JPanel
     */
    private JPanel getContenedorDatosGeograficos() {
        if (contenedorDatosGeograficos == null) {
            lblDireccion = new JLabel();
            lblDireccion.setBounds(new Rectangle(10, 183, 78, 25));
            lblDireccion.setText("Direccion");
            lblSector = new JLabel();
            lblSector.setBounds(new Rectangle(14, 132, 59, 25));
            lblSector.setText("Sector");
            lblParroquia = new JLabel();
            lblParroquia.setBounds(new Rectangle(404, 80, 64, 25));
            lblParroquia.setText("Parroquia");
            lblMunicipio = new JLabel();
            lblMunicipio.setBounds(new Rectangle(11, 80, 71, 25));
            lblMunicipio.setText("Municipio");
            lblEstado = new JLabel();
            lblEstado.setBounds(new Rectangle(400, 29, 63, 25));
            lblEstado.setText("Estado");
            lblRegion = new JLabel();
            lblRegion.setBounds(new Rectangle(13, 29, 61, 25));
            lblRegion.setText("Region");
            contenedorDatosGeograficos = new JPanel();
            contenedorDatosGeograficos.setLayout(null);
            contenedorDatosGeograficos.setBounds(new Rectangle(2, 305, 792, 231));
            contenedorDatosGeograficos
                    .setToolTipText("Datos Geograficos del Usuario");
            contenedorDatosGeograficos.setBorder(BorderFactory
                    .createTitledBorder(BorderFactory.createLineBorder(
                                    Color.BLUE, 1), "Datos Gograficos del Usuario",
                            TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
                            new Font("Dialog", Font.PLAIN, 12), Color.blue));

            contenedorDatosGeograficos.add(lblRegion, null);
            contenedorDatosGeograficos.add(lblEstado, null);
            contenedorDatosGeograficos.add(lblMunicipio, null);
            contenedorDatosGeograficos.add(lblParroquia, null);
            contenedorDatosGeograficos.add(lblSector, null);
            contenedorDatosGeograficos.add(lblDireccion, null);
            contenedorDatosGeograficos.add(getCbxRegion(), null);
            contenedorDatosGeograficos.add(getCbxEstado(), null);
            contenedorDatosGeograficos.add(getCbxMunicipio(), null);
            contenedorDatosGeograficos.add(getCbxParroquia(), null);
            contenedorDatosGeograficos.add(getCbxSector(), null);
            contenedorDatosGeograficos.add(getTxtDireccion(), null);
        }
        return contenedorDatosGeograficos;
    }

    /**
     * This method initializes cbxRegion
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxRegion() {
        if (cbxRegion == null) {
            cbxRegion = new JComboBox();
            cbxRegion.setBounds(new Rectangle(87, 29, 300, 25));
        }
        return cbxRegion;
    }

    /**
     * This method initializes cbxEstado
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxEstado() {
        if (cbxEstado == null) {
            cbxEstado = new JComboBox();
            cbxEstado.setBounds(new Rectangle(476, 29, 300, 25));
        }
        return cbxEstado;
    }

    /**
     * This method initializes cbxMunicipio
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxMunicipio() {
        if (cbxMunicipio == null) {
            cbxMunicipio = new JComboBox();
            cbxMunicipio.setBounds(new Rectangle(93, 80, 300, 25));
        }
        return cbxMunicipio;
    }

    /**
     * This method initializes cbxParroquia
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxParroquia() {
        if (cbxParroquia == null) {
            cbxParroquia = new JComboBox();
            cbxParroquia.setBounds(new Rectangle(479, 80, 300, 25));
        }
        return cbxParroquia;
    }

    /**
     * This method initializes cbxSector
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxSector() {
        if (cbxSector == null) {
            cbxSector = new JComboBox();
            cbxSector.setBounds(new Rectangle(88, 132, 472, 27));
        }
        return cbxSector;
    }

    /**
     * This method initializes txtDireccion
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtDireccion() {
        if (txtDireccion == null) {
            txtDireccion = new JTextField();
            txtDireccion.setBounds(new Rectangle(100, 183, 678, 25));
        }
        return txtDireccion;
    }

    /**
     * This method initializes contenedorDatosCuenta
     *
     * @return javax.swing.JPanel
     */
    private JPanel getContenedorDatosCuenta() {
        if (contenedorDatosCuenta == null) {
            lblRol = new JLabel();
            lblRol.setBounds(new Rectangle(419, 87, 27, 25));
            lblRol.setText("Rol");
            lblRepitaContrasena = new JLabel();
            lblRepitaContrasena.setBounds(new Rectangle(16, 87, 125, 25));
            lblRepitaContrasena.setText("Repita la Conrase&#241;a");
            lblContrasena = new JLabel();
            lblContrasena.setBounds(new Rectangle(408, 37, 71, 25));
            lblContrasena.setText("Contrase&#241;a");
            lblUsuario = new JLabel();
            lblUsuario.setBounds(new Rectangle(13, 37, 95, 25));
            lblUsuario.setText("Nombre Usuario");
            contenedorDatosCuenta = new JPanel();
            contenedorDatosCuenta.setLayout(null);
            contenedorDatosCuenta.setBounds(new Rectangle(2, 537, 792, 134));
            contenedorDatosCuenta
                    .setToolTipText("Datos Geograficos del Usuario");
            contenedorDatosCuenta.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.green, 1), "Datos de Acceso del Usuario", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.PLAIN, 12), Color.orange));
            contenedorDatosCuenta.add(lblUsuario, null);
            contenedorDatosCuenta.add(lblContrasena, null);
            contenedorDatosCuenta.add(getTxtNombreUsuario(), null);
            contenedorDatosCuenta.add(getTxtPassword(), null);
            contenedorDatosCuenta.add(lblRepitaContrasena, null);
            contenedorDatosCuenta.add(lblRol, null);
            contenedorDatosCuenta.add(getCbxRol(), null);
            contenedorDatosCuenta.add(getPswRepita(), null);
        }
        return contenedorDatosCuenta;
    }

    /**
     * This method initializes txtNombreUsuario
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtNombreUsuario() {
        if (txtNombreUsuario == null) {
            txtNombreUsuario = new JTextField();
            txtNombreUsuario.setBounds(new Rectangle(119, 37, 278, 25));
        }
        return txtNombreUsuario;
    }

    /**
     * This method initializes txtPassword
     *
     * @return javax.swing.JTextField
     */
    private JPasswordField getTxtPassword() {
        if (txtPassword == null) {
            txtPassword = new JPasswordField();
            txtPassword.setBounds(new Rectangle(490, 37, 282, 25));
        }
        return txtPassword;
    }

    /**
     * This method initializes cbxRol
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxRol() {
        if (cbxRol == null) {
            cbxRol = new JComboBox();
            cbxRol.setBounds(new Rectangle(465, 87, 300, 25));
        }
        return cbxRol;
    }

    /**
     * This method initializes pswRepita
     *
     * @return javax.swing.JPasswordField
     */
    private JPasswordField getPswRepita() {
        if (pswRepita == null) {
            pswRepita = new JPasswordField();
            pswRepita.setBounds(new Rectangle(168, 87, 232, 25));
        }
        return pswRepita;
    }

    /**
     * This method initializes contenedorScrol
     *
     * @return javax.swing.JScrollPane
     */
    private JScrollPane getContenedorScrol() {
        if (contenedorScrol == null) {
            contenedorScrol = new JScrollPane();
            contenedorScrol.setFont(new Font("DialogInput", Font.BOLD | Font.ITALIC, 18));
            contenedorScrol.setForeground(new Color(181, 47, 34));
            contenedorScrol.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLoweredBevelBorder(), BorderFactory.createEmptyBorder(0, 0, 0, 0)));
            contenedorScrol.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            //contenedorScrol.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            contenedorScrol.setViewportView(getContenedorRegistoUsuario());
            contenedorScrol.getViewport().setView(getContenedorRegistoUsuario());
        }
        return contenedorScrol;
    }

    /**
     * Creacion del Boton Calcelar el Registro
     */
    private JButton getBtnCancelar() {
        if (btnCancelar == null) {
            btnCancelar = new JButton();
            btnCancelar.setBounds(new Rectangle(650, 685, 100, 30));
            btnCancelar.setText("Cancelar");
            btnCancelar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas Cancelar el Registro?", null, JOptionPane.YES_NO_OPTION);
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            dispose();
                            break;
                        case JOptionPane.NO_OPTION:
                            JOptionPane.showMessageDialog(null, "Operacion Cancela", null, 1);
                            break;
                    }
                }
            });
        }
        return btnCancelar;
    }

    /**
     * This method initializes btnLimpiar
     *
     * @return javax.swing.JButton
     */
    private JButton getBtnLimpiar() {
        if (btnLimpiar == null) {
            btnLimpiar = new JButton();
            btnLimpiar.setBounds(new Rectangle(500, 685, 100, 30));
            btnLimpiar.setText("Limpiar");
            btnCancelar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    System.out.println("Lismpiar Formulario");
                }
            });
        }
        return btnLimpiar;
    }

    /**
     * This method initializes btnAceptar
     *
     * @return javax.swing.JButton
     */
    private JButton getBtnAceptar() {
        if (btnAceptar == null) {
            btnAceptar = new JButton();
            btnAceptar.setBounds(new Rectangle(350, 685, 100, 30));
            btnAceptar.setText("Aceptar");
            btnAceptar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    int respuesta=2;
                            int p=1;
                    switch (respuesta) {
                        case 1:
                            if (p==1) {
                                 System.out.println("1");
                                
                            break;
                            }
                        else
                            {
                               
                            }
                            
                           
                        case 2:
                            if (p==2) {
                                 System.out.println("2");
                                
                            break;
                            }
                    }
                }
            });
        }
        return btnAceptar;
    }

    /**
     * This method initializes jPanel
     *
     * @return javax.swing.JPanel
     */
    /**
     * This method initializes jRadioButton
     *
     * @return javax.swing.JRadioButton
     */
} // @jve:decl-index=0:visual-constraint="10,10"
