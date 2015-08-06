package Vista;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IniciarSesion extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
    private JLabel lblNombres = null;
    private JLabel lblApellidos = null;
    private JLabel lblCedula = null;
    private JLabel lblTlfMovil = null;
    private JLabel lblTlfFijo = null;
    private JLabel lblCorreo = null;
    private JLabel lblSexo = null;
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
    private JComboBox CbxSexo = null;
    private JTextField txtPin = null;
    private JTextField txtWhatsApp = null;
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
    private JButton btnCanselar = null;
    private JButton btnLimpiar = null;
    private JButton btnAceptar = null;    
        

	/**
	 * This is the xxx default constructor
	 */
	public IniciarSesion() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
	}
        
	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
        private JTextField getTxtNombres() {
        if (txtNombres == null) {
            txtNombres = new JTextField();
            txtNombres.setBounds(new Rectangle(80, 20, 300, 25));
        }
        return txtNombres;
    }
        private JLabel getlblNombres() {
        if (lblNombres == null) {
            lblNombres = new JLabel();
            lblNombres.setText("Nombres");
            lblNombres.setBounds(new Rectangle(20, 20, 300, 25));
        }
        return lblNombres;
    }
        
        private JTextField getTxtApellidos() {
        if (txtApellidos == null) {
            txtApellidos = new JTextField();
            txtApellidos.setBounds(new Rectangle(460, 20, 300, 25));
        }
        return txtApellidos;
    }
        private JLabel getlblApellidos() {
        if (lblApellidos == null) {
            lblApellidos = new JLabel();
            lblApellidos.setText("Apellidos");
            lblApellidos.setBounds(new Rectangle(400, 20, 300, 25));
        }
        return lblApellidos;
    }
    /**
     * This method initializes txtCedula
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtCedula() {
        if (txtCedula == null) {
            txtCedula = new JTextField();
            txtCedula.setBounds(new Rectangle(80, 70, 300, 25));
        }
        return txtCedula;
    }
        private JLabel getlbCedula() {
        if (lblCedula == null) {
            lblCedula = new JLabel();
            lblCedula.setText("Cedula");
            lblCedula.setBounds(new Rectangle(20, 70, 300, 25));
        }
        return lblCedula;
    }
    private JComboBox getCbxRegion() {
        if (cbxRegion == null) {
            cbxRegion = new JComboBox();
            cbxRegion.setBounds(new Rectangle(80, 320, 300, 25));
        }
        return cbxRegion;
    }
            private JLabel getlbRegion() {
        if (lblRegion == null) {
            lblRegion = new JLabel();
            lblRegion.setText("Region");
            lblRegion.setBounds(new Rectangle(20, 320, 300, 25));
        }
        return lblRegion;
    }

    /**
     * This method initializes cbxEstado
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxEstado() {
        if (cbxEstado == null) {
            cbxEstado = new JComboBox();
            cbxEstado.setBounds(new Rectangle(460, 320, 300, 25));
        }
        return cbxEstado;
    }
           private JLabel getlbEstado() {
        if (lblEstado == null) {
            lblEstado = new JLabel();
            lblEstado.setText("Estado");
            lblEstado.setBounds(new Rectangle(400, 320, 300, 25));
        }
        return lblEstado;
    }

    /**
     * This method initializes cbxMunicipio
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxMunicipio() {
        if (cbxMunicipio == null) {
            cbxMunicipio = new JComboBox();
            cbxMunicipio.setBounds(new Rectangle(80, 370, 300, 25));
        }
        return cbxMunicipio;
    }
     private JLabel getlbMunicipio() {
        if (lblMunicipio == null) {
            lblMunicipio = new JLabel();
            lblMunicipio.setText("Municipio");
            lblMunicipio.setBounds(new Rectangle(20, 370, 300, 25));
        }
        return lblMunicipio;
    }

    /**
     * This method initializes cbxParroquia
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxParroquia() {
        if (cbxParroquia == null) {
            cbxParroquia = new JComboBox();
            cbxParroquia.setBounds(new Rectangle(460, 370, 300, 25));
        }
        return cbxParroquia;
    }
         private JLabel getlbParroquia() {
        if (lblParroquia == null) {
            lblParroquia = new JLabel();
            lblParroquia.setText("Parroquia");
            lblParroquia.setBounds(new Rectangle(400, 370, 300, 25));
        }
        return lblParroquia;
    }
         

    /**
     * This method initializes cbxSector
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxSector() {
        if (cbxSector == null) {
            cbxSector = new JComboBox();
            cbxSector.setBounds(new Rectangle(80, 420, 300, 25));
        }
        return cbxSector;
    }
             private JLabel getlbSector() {
        if (lblSector == null) {
            lblSector = new JLabel();
            lblSector.setText("Sector");
            lblSector.setBounds(new Rectangle(20, 420, 300, 25));
        }
        return lblSector;
    }

    /**
     * This method initializes txtDireccion
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtDireccion() {
        if (txtDireccion == null) {
            txtDireccion = new JTextField();
            txtDireccion.setBounds(new Rectangle(460, 420, 300, 25));
        }
        return txtDireccion;
    }
    private JLabel getlbDireccion() {
        if (lblDireccion == null) {
            lblDireccion = new JLabel();
            lblDireccion.setText("Direccion");
            lblDireccion.setBounds(new Rectangle(400, 420, 300, 25));
        }
        return lblDireccion;
    }

    /**
     * This method initializes txtCorreo
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtCorreo() {
        if (txtCorreo == null) {
            txtCorreo = new JTextField();
            txtCorreo.setBounds(new Rectangle(80, 120, 300, 25));
        }
        return txtCorreo;
    }
    private JLabel getlbCorreo() {
        if (lblCorreo == null) {
            lblCorreo = new JLabel();
            lblCorreo.setText("Correo");
            lblCorreo.setBounds(new Rectangle(20, 120, 300, 25));
        }
        return lblCorreo;
    }

    /**
     * This method initializes cbxEstadoCivil
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxEstadoCivil() {
        if (cbxEstadoCivil == null) {
            cbxEstadoCivil = new JComboBox();
            cbxEstadoCivil.setBounds(new Rectangle(110, 220, 270, 25));
        }
        return cbxEstadoCivil;
    }
    private JLabel getlbEstadoCivil() {
        if (lblEstadoCivil == null) {
            lblEstadoCivil = new JLabel();
            lblEstadoCivil.setText("Estado Civil");
            lblEstadoCivil.setBounds(new Rectangle(20, 220, 300, 25));
        }
        return lblEstadoCivil;
    }

    /**
     * This method initializes cbxNacionalidad
     *
     * @return javax.swing.JComboBox
     */
    private JComboBox getCbxNacionalidad() {
        if (cbxNacionalidad == null) {
            cbxNacionalidad = new JComboBox();
            cbxNacionalidad.setBounds(new Rectangle(490, 70, 270, 25));
            
//            cbxNacionalidad.addItem(new ClaseObjetoParaComboBox(1,"ItemEjemploNº1"));
//cbxNacionalidad.addItem(new ClaseObjetoParaComboBox(2,"ItemEjemploNº2"));
        }
        return cbxNacionalidad;
    }
    private JLabel getlblNacionalidad() {
        if (lblNacionalidad == null) {
            lblNacionalidad = new JLabel();
            lblNacionalidad.setText("Nacionalidad");
            lblNacionalidad.setBounds(new Rectangle(400, 70, 300, 25));
        }
        return lblNacionalidad;
    }

    /**
     * This method initializes txtTlfMovil
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtTlfMovil() {
        if (txtTlfMovil == null) {
            txtTlfMovil = new JTextField();
            txtTlfMovil.setBounds(new Rectangle(460, 170, 300, 25));
        }
        return txtTlfMovil;
    }
    private JLabel getlblTlfMovil() {
        if (lblTlfMovil == null) {
            lblTlfMovil = new JLabel();
            lblTlfMovil.setText("Tlf Movil");
            lblTlfMovil.setBounds(new Rectangle(400, 170, 300, 25));
        }
        return lblTlfMovil;
    }

    /**
     * This method initializes txtTlfFijo
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtTlfFijo() {
        if (txtTlfFijo == null) {
            txtTlfFijo = new JTextField();
            txtTlfFijo.setBounds(new Rectangle(80, 170, 300, 25));
        }
        return txtTlfFijo;
    }
    private JLabel getlblTlfFijo() {
        if (lblTlfFijo == null) {
            lblTlfFijo = new JLabel();
            lblTlfFijo.setText("Tlf Fijo");
            lblTlfFijo.setBounds(new Rectangle(20, 170, 300, 25));
        }
        return lblTlfFijo;
    }

    /**
     * This method initializes txtFechaNacimiento
     *
     * @return javax.swing.JTextField
     */
    private JComboBox getCbxSexo() {
        if (CbxSexo == null) {
            CbxSexo = new JComboBox();
            CbxSexo.setBounds(new Rectangle(460, 120, 300, 25));
        }
        return CbxSexo;
    }
    private JLabel getlblSexo() {
        if (lblSexo == null) {
            lblSexo = new JLabel();
            lblSexo.setText("Sexo");
            lblSexo.setBounds(new Rectangle(400, 120, 300, 25));
        }
        return lblSexo;
    }

    /**
     * This method initializes txtPin
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtPin() {
        if (txtPin == null) {
            txtPin = new JTextField();
            txtPin.setBounds(new Rectangle(460, 220, 300, 25));
        }
        return txtPin;
    }
        private JLabel getlblPin() {
        if (lblPin == null) {
            lblPin = new JLabel();
            lblPin.setText("Pin");
            lblPin.setBounds(new Rectangle(400, 220, 300, 25));
        }
        return lblPin;
    }

    /**
     * This method initializes txtWhatsApp
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtWhatsApp() {
        if (txtWhatsApp == null) {
            txtWhatsApp = new JTextField();
            txtWhatsApp.setBounds(new Rectangle(80, 270, 300, 25));
        }
        return txtWhatsApp;
    }
    private JLabel getlblWhatsApp() {
        if (lblWhatsApp == null) {
            lblWhatsApp = new JLabel();
            lblWhatsApp.setText("WhatsApp");
            lblWhatsApp.setBounds(new Rectangle(20, 270, 300, 25));
        }
        return lblWhatsApp;
    }
    private JButton getBtnCanselar() {
		if (btnCanselar == null) {
			btnCanselar = new JButton();
			btnCanselar.setBounds(new Rectangle(301, 470, 95, 26));
			btnCanselar.setText("Cancelar");
			
		}
		return btnCanselar;
	}

	/**
	 * This method initializes btnLimpiar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnLimpiar() {
		if (btnLimpiar == null) {
			btnLimpiar = new JButton();
			btnLimpiar.setBounds(new Rectangle(163, 470, 114, 29));
			btnLimpiar.setText("Limpiar");
		}
		return btnLimpiar;
	}

	/**
	 * This method initializes btnCancelar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCancelar() {
		if (btnAceptar == null) {
			btnAceptar = new JButton();
			btnAceptar.setBounds(new Rectangle(26, 470, 111, 25));
			btnAceptar.setText("Aceptar");
			
		}
		return btnAceptar;
	}
        
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
                        jContentPane.add(getTxtNombres());
                        jContentPane.add(getlblNombres());
                        jContentPane.add(getTxtApellidos());
                        jContentPane.add(getlblApellidos());
                        jContentPane.add(getTxtCedula());
                        jContentPane.add(getlbCedula());
                        jContentPane.add(getTxtCorreo());
                        jContentPane.add(getlbCorreo());
                        jContentPane.add(getTxtDireccion());
                        jContentPane.add(getlbDireccion());
                        jContentPane.add(getCbxSexo());
                        jContentPane.add(getlblSexo());
                        jContentPane.add(getTxtPin());
                        jContentPane.add(getlblPin());
                        jContentPane.add(getTxtTlfFijo());
                        jContentPane.add(getlblTlfFijo());
                        jContentPane.add(getTxtTlfMovil());
                        jContentPane.add(getlblTlfMovil());
                        jContentPane.add(getTxtWhatsApp());
                        jContentPane.add(getlblWhatsApp());
                        jContentPane.add(getCbxNacionalidad());
                        jContentPane.add(getlblNacionalidad());
                        jContentPane.add(getCbxEstadoCivil());
                        jContentPane.add(getlbEstadoCivil());
                        jContentPane.add(getCbxRegion());
                        jContentPane.add(getlbRegion());
                        jContentPane.add(getCbxEstado());
                        jContentPane.add(getlbEstado());
                        jContentPane.add(getCbxMunicipio());
                        jContentPane.add(getlbMunicipio());
                        jContentPane.add(getCbxParroquia());
                        jContentPane.add(getlbParroquia());
                        jContentPane.add(getCbxSector());
                        jContentPane.add(getlbSector());
                        jContentPane.add(getBtnCanselar());
			jContentPane.add(getBtnLimpiar());
			jContentPane.add(getBtnCancelar());
                        
		}
		return jContentPane;
	}

}