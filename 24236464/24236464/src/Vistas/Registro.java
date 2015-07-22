package Vistas;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	JPanel panel = null;
	JLabel inicio, nombre, apellido, cedula, tlfm, tlff, pin, what,
			correo = null;
	JTextField txtnom, txtape, txtced, txttlfm, txttlff, txtpin, txtwhat,
			txtcorreo = null;

	JLabel inicio1, region, estado, municipio, parroquia, sector,
			direccion = null;
	JTextField txtreg, txtestad, txtmunic, txtparr, txtsector, txtdir = null;
	
	JComboBox estadoc = null;
	JRadioButton radioF, radioM = null;

	JButton btnAceptar, btnCancelar, btnLimpiar = null;
	
	JMenuBar menu = null;
	JMenu menuA, menuE = null;
	JMenuItem menunuevo = null;

	public Registro() {
		Inicializar();
	}

	public void Inicializar() {
		this.setVisible(true);
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("Registro");
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
			panel.add(getRegion(), null);
			panel.add(getTxtRegion(), null);
			panel.add(getEstado(), null);
			panel.add(getTxtEstado(), null);
			panel.add(getMunicipio(), null);
			panel.add(getTxtMunic(), null);
			panel.add(getParroquia(), null);
			panel.add(getTxtParroquia(), null);
			panel.add(getSector(), null);
			panel.add(getTxtSector(), null);
			panel.add(getDireccion(), null);
			panel.add(getTxtDireccion(), null);
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
			txtnom.setBounds(new Rectangle(70, 40, 100, 20));
		}
		return txtnom;
	}

	private JLabel getApellido() {
		if (apellido == null) {
			apellido = new JLabel();
			apellido.setText("Apellidos");
			apellido.setBounds(new Rectangle(180, 40, 100, 20));
		}
		return apellido;
	}

	private JTextField getTxtape() {
		if (txtape == null) {
			txtape = new JTextField();
			txtape.setBounds(new Rectangle(240, 40, 100, 20));
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
			txtced.setBounds(new Rectangle(70, 60, 100, 20));
		}
		return txtced;
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
			txttlfm.setBounds(new Rectangle(70, 80, 100, 20));
		}
		return txttlfm;
	}

	private JLabel getTelefonoF() {
		if (tlff == null) {
			tlff = new JLabel();
			tlff.setText("Tlf Fijo");
			tlff.setBounds(new Rectangle(180, 80, 100, 20));
		}
		return tlff;
	}

	private JTextField getTxttlff() {
		if (txttlff == null) {
			txttlff = new JTextField();
			txttlff.setBounds(new Rectangle(240, 80, 100, 20));
		}
		return txttlff;
	}

	private JComboBox getComboE() {
		if (estadoc == null) {
			estadoc = new JComboBox();
			estadoc.setBounds(new Rectangle(150, 110, 100, 20));
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
			txtpin.setBounds(new Rectangle(70, 150, 100, 20));
		}
		return txtpin;
	}

	private JLabel getWhat() {
		if (what == null) {
			what = new JLabel();
			what.setText("WhatsApp");
			what.setBounds(new Rectangle(180, 150, 100, 20));
		}
		return what;
	}

	private JTextField getTxtWhat() {
		if (txtwhat == null) {
			txtwhat = new JTextField();
			txtwhat.setBounds(new Rectangle(240, 150, 100, 20));
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
			txtcorreo.setBounds(new Rectangle(70, 170, 270, 20));
		}
		return txtcorreo;
	}

	private JLabel getRegion() {
		if (region == null) {
			region = new JLabel();
			region.setText("Region");
			region.setBounds(new Rectangle(10, 240, 100, 20));
		}
		return region;
	}

	private JTextField getTxtRegion() {
		if (txtreg == null) {
			txtreg = new JTextField();
			txtreg.setBounds(new Rectangle(70, 240, 100, 20));
		}
		return txtreg;
	}

	private JLabel getEstado() {
		if (estado == null) {
			estado = new JLabel();
			estado.setText("Estado");
			estado.setBounds(new Rectangle(10, 260, 100, 20));
		}
		return estado;
	}

	private JTextField getTxtEstado() {
		if (txtestad == null) {
			txtestad = new JTextField();
			txtestad.setBounds(new Rectangle(70, 260, 100, 20));
		}
		return txtestad;
	}

	private JLabel getMunicipio() {
		if (municipio == null) {
			municipio = new JLabel();
			municipio.setText("Municipio");
			municipio.setBounds(new Rectangle(10, 280, 100, 20));
		}
		return municipio;
	}

	private JTextField getTxtMunic() {
		if (txtmunic == null) {
			txtmunic = new JTextField();
			txtmunic.setBounds(new Rectangle(70, 280, 100, 20));
		}
		return txtmunic;
	}

	private JLabel getParroquia() {
		if (parroquia == null) {
			parroquia = new JLabel();
			parroquia.setText("Parroquia");
			parroquia.setBounds(new Rectangle(10, 300, 100, 20));
		}
		return parroquia;
	}

	private JTextField getTxtParroquia() {
		if (txtparr == null) {
			txtparr = new JTextField();
			txtparr.setBounds(new Rectangle(70, 300, 100, 20));
		}
		return txtparr;
	}

	private JLabel getSector() {
		if (sector == null) {
			sector = new JLabel();
			sector.setText("Sector");
			sector.setBounds(new Rectangle(10, 320, 100, 20));
		}
		return sector;
	}

	private JTextField getTxtSector() {
		if (txtsector == null) {
			txtsector = new JTextField();
			txtsector.setBounds(new Rectangle(70, 320, 270, 20));
		}
		return txtsector;
	}

	private JLabel getDireccion() {
		if (direccion == null) {
			direccion = new JLabel();
			direccion.setText("Direccion");
			direccion.setBounds(new Rectangle(10, 340, 100, 20));
		}
		return direccion;
	}

	private JTextField getTxtDireccion() {
		if (txtdir == null) {
			txtdir = new JTextField();
			txtdir.setBounds(new Rectangle(70, 340, 270, 20));
		}
		return txtdir;
	}

	//Aqui estan las etiquetas JButton
	private JButton getbtnAceptar() {
		if (btnAceptar == null) {
			btnAceptar = new JButton();
			btnAceptar.setText("Aceptar");
			btnAceptar.setBounds(new Rectangle(50, 400, 100, 20));

			btnAceptar.addMouseListener(new MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					String nombre = txtnom.getText();
					String apellido = txtape.getText();
					String pin = txtpin.getText();
					String correo = txtcorreo.getText();
					String region = txtreg.getText();
					String municipio = txtmunic.getText();
					String parroquia = txtparr.getText();
					String sector = txtsector.getText();
					String direccion = txtdir.getText();



					if (nombre.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un nombre", "Mensaje del Sistema", 0);
					}
					if (apellido.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un Apellido", "Mensaje del Sistema", 0);
					}
					if (pin.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un PIN", "Mensaje del Sistema", 0);
					}
					if (correo.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un E-Mail", "Mensaje del Sistema", 0);
					}
					if (region.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese una Region", "Mensaje del Sistema", 0);
					}
					if (municipio.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese un Municipio", "Mensaje del Sistema", 0);
					}
					if (parroquia.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese una Parroquia", "Mensaje del Sistema", 0);
					}
					if (sector.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese el Sector", "Mensaje del Sistema", 0);
					}
					if (direccion.equals("")) {
						JOptionPane.showMessageDialog(null,
								"Ingrese su Direccion", "Mensaje del Sistema", 0);
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
			btnLimpiar.setBounds(new Rectangle(150,400,100,20));
			
			btnLimpiar.addMouseListener(new MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {

					txtnom.setText(null);
					txtape.setText(null);
					txtced.setText(null);
					txttlff.setText(null);
					txttlfm.setText(null);
					txtpin.setText(null);
					txtwhat.setText(null);
					txtcorreo.setText(null);
					txtreg.setText(null);
					txtestad.setText(null);
					txtmunic.setText(null);
					txtparr.setText(null);
					txtsector.setText(null);
					txtdir.setText(null);
				}

			});
			
		}
		return btnLimpiar;
	}

	private JButton getbtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton();
			btnCancelar.setText("Cancelar");
			btnCancelar.setBounds(new Rectangle(250, 400, 100, 20));

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