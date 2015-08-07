package Vista;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registro extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel = null;
	
        private JLabel inicio, nombre, apellido, cedula, tlfm, tlff, pin, what,
			correo, fecha = null;
	private JTextField txtnom, txtape, txtced, txttlfm, txttlff, txtpin, txtwhat,
			txtcorreo, txtfecha = null;

	private JLabel inicio1, sector, direccion = null;
	private JTextField txtsector, txtdir = null;
        
        private JLabel inicio2, usuario, clave, confirmarclave = null;
        private JTextField txtusuario = null;
        private JPasswordField txtclave, txtconfirmar = null;
	
	private JComboBox estadoc, regioncombo, estadocombo, municipiocombo,
                parroquiacombo = null;
	private JRadioButton radioF, radioM = null;

	private JButton btnAceptar, btnCancelar, btnLimpiar = null;
	
	private JMenuBar menu = null;
	private JMenu menuA, menuE = null;
	private JMenuItem menunuevo = null;

	public Registro() {
                super("Registro",true,true,true,true);
		Inicializar();
	}

	public void Inicializar() {
		this.setVisible(true);
		this.setSize(400, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(contenedor());
		this.setJMenuBar(ContMenu());
	}

	private JPanel contenedor() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			//agregar componentes
			panel.add(getInicio(), null);
			panel.add(getNombre(), null);
			panel.add(getTxtnom(), null);
			panel.add(getApellido(), null);
			panel.add(getTxtape(), null);
			panel.add(getCedula(), null);
			panel.add(getTxtced(), null);
                        panel.add(getFecha(), null);
                        panel.add(getTxtFecha(), null);
			panel.add(getTelefonoM(), null);
			panel.add(getTxttlfm(), null);
			panel.add(getTelefonoF(), null);
			panel.add(getTxttlff(), null);
			panel.add(getComboE(), null);
			panel.add(getMasculino(), null);
			panel.add(getFemenino(), null);
			panel.add(getPin(), null);
			panel.add(getTxtPin(), null);
			panel.add(getWhat(), null);
			panel.add(getTxtWhat(), null);
			panel.add(getCorreo(), null);
			panel.add(getTxtCorreo(), null);
			panel.add(getInicio1(), null);
			panel.add(ComboRegion(), null);
			panel.add(ComboEstado(), null);
			panel.add(ComboMunicipio(), null);
			panel.add(ComboParroquia(), null);
			panel.add(getSector(), null);
			panel.add(getTxtSector(), null);
			panel.add(getDireccion(), null);
			panel.add(getTxtDireccion(), null);
                        panel.add(getInicio2(), null);
                        panel.add(getUsuario(), null);
                        panel.add(getTxtUsuario(), null);
                        panel.add(getClave(), null);
                        panel.add(getTxtClave(), null);
                        panel.add(getClaveConfirmada(), null);
                        panel.add(getTxtClaveConfirmada(), null);
			panel.add(getbtnAceptar(), null);
			panel.add(getbtnLimpiar(), null);
			panel.add(getbtnCancelar(), null);
		}
		return panel;
	}

	//Aqui son las etiquetas unicas de JLabel
	private JLabel getInicio() {
		if (inicio == null) {
			inicio = new JLabel();
			inicio.setText("DATOS PERSONALES");
			inicio.setBounds(new Rectangle(130, 10, 150, 20));
		}
		return inicio;
	}

	private JLabel getInicio1() {
		if (inicio1 == null) {
			inicio1 = new JLabel();
			inicio1.setText("DATOS GEOGRAFICOS");
			inicio1.setBounds(new Rectangle(130, 200, 150, 20));
		}
		return inicio1;
	}
	
	//Aqui estan las etiquetas de JMenu
	private JMenuBar ContMenu(){
		if (menu == null){
			menu = new JMenuBar();
			menu.add(getMenuA());
			menu.add(getMenuE());
		}
		return menu;
	}
	
	private JMenu getMenuA(){
		if (menuA == null){
			menuA = new JMenu();
			menuA.setText("Archivo");
			menuA.add(getMenuItemN());
		}
		return menuA;
	}
	private JMenu getMenuE(){
		if (menuE == null){
			menuE = new JMenu();
			menuE.setText("Edicion");
		}
		return menuE;
	}
	
	private JMenuItem getMenuItemN(){
		if (menunuevo == null){
			menunuevo = new JMenuItem();
			menunuevo.setText("Nuevo");
		}
		return menunuevo;
	}

	//Aqui estan las etiquetas de JLabel y JTextField
	private JLabel getNombre() {
		if (nombre == null) {
			nombre = new JLabel();
			nombre.setText("Nombres");
			nombre.setBounds(new Rectangle(10, 40, 100, 20));
		}
		return nombre;
	}

	private JTextField getTxtnom() {
		if (txtnom == null) {
			txtnom = new JTextField();
			txtnom.setBounds(new Rectangle(80, 40, 100, 20));
		}
		return txtnom;
	}

	private JLabel getApellido() {
		if (apellido == null) {
			apellido = new JLabel();
			apellido.setText("Apellidos");
			apellido.setBounds(new Rectangle(190, 40, 100, 20));
		}
		return apellido;
	}

	private JTextField getTxtape() {
		if (txtape == null) {
			txtape = new JTextField();
			txtape.setBounds(new Rectangle(260, 40, 100, 20));
		}
		return txtape;
	}

	private JLabel getCedula() {
		if (cedula == null) {
			cedula = new JLabel();
			cedula.setText("Cedula");
			cedula.setBounds(new Rectangle(10, 60, 100, 20));
		}
		return cedula;
	}

	private JTextField getTxtced() {
		if (txtced == null) {
			txtced = new JTextField();
			txtced.setBounds(new Rectangle(80, 60, 100, 20));
		}
		return txtced;
	}
        
        	private JLabel getFecha() {
		if (fecha == null) {
			fecha = new JLabel();
			fecha.setText("Fecha");
			fecha.setBounds(new Rectangle(190, 60, 100, 20));
		}
		return fecha;
	}

	private JTextField getTxtFecha() {
		if (txtfecha == null) {
			txtfecha = new JTextField();
			txtfecha.setBounds(new Rectangle(260, 60, 100, 20));
		}
		return txtfecha;
	}

	private JLabel getTelefonoM() {
		if (tlfm == null) {
			tlfm = new JLabel();
			tlfm.setText("Tlf Movil");
			tlfm.setBounds(new Rectangle(10, 80, 100, 20));
		}
		return tlfm;
	}

	private JTextField getTxttlfm() {
		if (txttlfm == null) {
			txttlfm = new JTextField();
			txttlfm.setBounds(new Rectangle(80, 80, 100, 20));
		}
		return txttlfm;
	}

	private JLabel getTelefonoF() {
		if (tlff == null) {
			tlff = new JLabel();
			tlff.setText("Tlf Fijo");
			tlff.setBounds(new Rectangle(190, 80, 100, 20));
		}
		return tlff;
	}

	private JTextField getTxttlff() {
		if (txttlff == null) {
			txttlff = new JTextField();
			txttlff.setBounds(new Rectangle(260, 80, 100, 20));
		}
		return txttlff;
	}

	private JComboBox getComboE() {
		if (estadoc == null) {
			estadoc = new JComboBox();
			estadoc.setBounds(new Rectangle(150, 110, 110, 20));
			estadoc.addItem("Estado Civil");
			estadoc.addItem("Soltero(a)");
			estadoc.addItem("Casado(a)");
			estadoc.addItem("Divorciado(a)");
			estadoc.addItem("Viudo(a)");
		}
		return estadoc;
	}

	private JRadioButton getMasculino() {
		if (radioM == null) {
			radioM = new JRadioButton();
			radioM.setText("M");
			radioM.setBounds(new Rectangle(160, 130, 40, 20));
		}
		return radioM;
	}

	private JRadioButton getFemenino() {
		if (radioF == null) {
			radioF = new JRadioButton();
			radioF.setText("F");
			radioF.setBounds(new Rectangle(210, 130, 40, 20));
			//Validacion para el RadioButton
			ButtonGroup genero = new ButtonGroup();
			genero.add(radioF);
			genero.add(radioM);
		}
		return radioF;
	}

	private JLabel getPin() {
		if (pin == null) {
			pin = new JLabel();
			pin.setText("PIN");
			pin.setBounds(new Rectangle(10, 150, 100, 20));
		}
		return pin;
	}

	private JTextField getTxtPin() {
		if (txtpin == null) {
			txtpin = new JTextField();
			txtpin.setBounds(new Rectangle(80, 150, 100, 20));
		}
		return txtpin;
	}

	private JLabel getWhat() {
		if (what == null) {
			what = new JLabel();
			what.setText("WhatsApp");
			what.setBounds(new Rectangle(185, 150, 100, 20));
		}
		return what;
	}

	private JTextField getTxtWhat() {
		if (txtwhat == null) {
			txtwhat = new JTextField();
			txtwhat.setBounds(new Rectangle(260, 150, 100, 20));
		}
		return txtwhat;
	}

	private JLabel getCorreo() {
		if (correo == null) {
			correo = new JLabel();
			correo.setText("Correo");
			correo.setBounds(new Rectangle(10, 170, 100, 20));
		}
		return correo;
	}

	private JTextField getTxtCorreo() {
		if (txtcorreo == null) {
			txtcorreo = new JTextField();
			txtcorreo.setBounds(new Rectangle(80, 170, 280, 20));
		}
		return txtcorreo;
	}

	
        private JComboBox ComboRegion(){
            if (regioncombo == null){
                regioncombo = new JComboBox();
                regioncombo.setBounds(new Rectangle(30,240,120,20));
                regioncombo.addItem("Region");
                regioncombo.addItem("Oriental");
                regioncombo.addItem("Llanera");
                regioncombo.addItem("Occidente");
                regioncombo.addItem("Insular");
                regioncombo.addItem("Andina");
                regioncombo.addItem("Guayana");
                regioncombo.addItem("Centro");
            }
            return regioncombo;
        }

        private JComboBox ComboEstado(){
            if (estadocombo == null){
                estadocombo = new JComboBox();
                estadocombo.setBounds(new Rectangle(220,240,120,20));
                estadocombo.addItem("Estado");
                estadocombo.addItem("Amazonas");
                estadocombo.addItem("Anzoategui");
                estadocombo.addItem("Apure");
                estadocombo.addItem("Barinas");
                estadocombo.addItem("Bolivar");
                estadocombo.addItem("Carabobo");
                estadocombo.addItem("Guarico");
                estadocombo.addItem("Aragua");
            }
            return estadocombo;
        }
        
        private JComboBox ComboMunicipio(){
            if (municipiocombo == null) {
                municipiocombo = new JComboBox();
                municipiocombo.setBounds(new Rectangle(30,265,120,20));
                municipiocombo.addItem("Municipio");
            }
            return municipiocombo;
        }
        
                private JComboBox ComboParroquia(){
            if (parroquiacombo == null){
                parroquiacombo = new JComboBox();
                parroquiacombo.setBounds(new Rectangle(220,265,120,20));
                parroquiacombo.addItem("Parroquia");
            }
            return parroquiacombo;
        }

	private JLabel getSector() {
		if (sector == null) {
			sector = new JLabel();
			sector.setText("Sector");
			sector.setBounds(new Rectangle(10, 290, 100, 20));
		}
		return sector;
	}

	private JTextField getTxtSector() {
		if (txtsector == null) {
			txtsector = new JTextField();
			txtsector.setBounds(new Rectangle(80, 290, 100, 20));
		}
		return txtsector;
	}

	private JLabel getDireccion() {
		if (direccion == null) {
			direccion = new JLabel();
			direccion.setText("Direccion");
			direccion.setBounds(new Rectangle(190, 290, 100, 20));
		}
		return direccion;
	}

	private JTextField getTxtDireccion() {
		if (txtdir == null) {
			txtdir = new JTextField();
			txtdir.setBounds(new Rectangle(260, 290, 100, 20));
		}
		return txtdir;
	}
        
        private JLabel getInicio2(){
            if (inicio2 == null){
                inicio2 = new JLabel();
                inicio2.setText("DATOS DE CUENTA");
                inicio2.setBounds(new Rectangle(140,320,150,20));
            }
            return inicio2;
        }
        
        private JLabel getUsuario(){
            if (usuario == null){
                usuario = new JLabel();
                usuario.setText("Usuario");
                usuario.setBounds(new Rectangle(10,350,100,20));
            }
            return usuario;
        }
        
        private JTextField getTxtUsuario(){
            if (txtusuario == null){
                txtusuario = new JTextField();
                txtusuario.setBounds(new Rectangle(80,350,100,20));
            }
            return txtusuario;
        }
        
        private JLabel getClave(){
            if (clave == null){
                clave = new JLabel();
                clave.setText("Clave");
                clave.setBounds(new Rectangle(10,370,100,20));
            }
            return clave;
        }
        
        private JPasswordField getTxtClave(){
            if (txtclave == null){
                txtclave = new JPasswordField();
                txtclave.setBounds(new Rectangle(80,370,100,20));
            }
            return txtclave;
        }
        
         private JLabel getClaveConfirmada(){
            if (confirmarclave == null){
                confirmarclave = new JLabel();
                confirmarclave.setText("Confirmar");
                confirmarclave.setBounds(new Rectangle(190,370,100,20));
            }
            return confirmarclave;
        }
        
        private JPasswordField getTxtClaveConfirmada(){
            if (txtconfirmar == null){
                txtconfirmar = new JPasswordField();
                txtconfirmar.setBounds(new Rectangle(270,370,100,20));
            }
            return txtconfirmar;
        }

	//Aqui estan las etiquetas JButton
	private JButton getbtnAceptar() {
		if (btnAceptar == null) {
			btnAceptar = new JButton();
			btnAceptar.setText("Aceptar");
			btnAceptar.setBounds(new Rectangle(30, 410, 100, 20));

			btnAceptar.addMouseListener(new MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					String nombre = txtnom.getText();
					String apellido = txtape.getText();
                                        String cedula = txtced.getText();
                                        String fecha = txtfecha.getText();
                                        String tlfm = txttlfm.getText();
                                        String tlff = txttlff.getText();
					String pin = txtpin.getText();
                                        String what = txtwhat.getText();
					String correo = txtcorreo.getText();
					String sector = txtsector.getText();
					String direccion = txtdir.getText();
                                        String cuenta = txtusuario.getText();
                                        String clave = txtclave.getText();
                                        String confirmado = txtconfirmar.getText();



					if (nombre.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un nombre", "Mensaje del Sistema", 0);
					}
                                        else if (apellido.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un Apellido", "Mensaje del Sistema", 0);
					}
                                        else if (cedula.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese la Cedula", "Mensaje del Sistema", 0);
					}
                                        else if (fecha.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese su Fecha de Nacimiento", "Mensaje del Sistema", 0);
					}
                                        else if (tlfm.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un Telefono Movil", "Mensaje del Sistema", 0);
					}
                                        else if (tlff.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un Telefono Fijo", "Mensaje del Sistema", 0);
					}
                                        else if (pin.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un PIN", "Mensaje del Sistema", 0);
					}
                                        else if (what.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un WhatsApp", "Mensaje del Sistema", 0);
					}
                                        else if (correo.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un E-Mail", "Mensaje del Sistema", 0);
					}
                                        else if (sector.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese el Sector", "Mensaje del Sistema", 0);
					}
                                        else if (direccion.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese su Direccion", "Mensaje del Sistema", 0);
					}
                                        else if (cuenta.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese su nomber de Usuario", "Mensaje del Sistema", 0);
					}
                                        else if (clave.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese su Clave", "Mensaje del Sistema", 0);
					}
                                        else if (confirmado.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Repita la clave", "Mensaje del Sistema", 0);
					}

				}

			});

		}
		return btnAceptar;
	}
	
	private JButton getbtnLimpiar(){
		if(btnLimpiar == null){
			btnLimpiar = new JButton();
			btnLimpiar.setText("Limpiar");
			btnLimpiar.setBounds(new Rectangle(145,410,100,20));
			
			btnLimpiar.addMouseListener(new MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					txtnom.setText(null);
					txtape.setText(null);
					txtced.setText(null);
                                        txtfecha.setText(null);
					txttlff.setText(null);
					txttlfm.setText(null);
					txtpin.setText(null);
					txtwhat.setText(null);
					txtcorreo.setText(null);
					txtsector.setText(null);
					txtdir.setText(null);
                                        txtusuario.setText(null);
                                        txtclave.setText(null);
                                        txtconfirmar.setText(null);
				}

			});
			
		}
		return btnLimpiar;
	}

	private JButton getbtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton();
			btnCancelar.setText("Cancelar");
			btnCancelar.setBounds(new Rectangle(260, 410, 100, 20));

			btnCancelar.addMouseListener(new MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					System.exit(0);
				}

			});

		}
		return btnCancelar;
	}
	


	public static void main(String[] args) {
		Registro obj = new Registro();
		obj.setVisible(true);

	}

}