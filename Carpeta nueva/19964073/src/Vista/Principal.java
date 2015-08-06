package Vista;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Principal extends JFrame {
    
    String Usuario="1";
    String Password="1";

	private static final long serialVersionUID = 1L;
	private JMenuBar barraMenu = null;
	private JMenu menuOpciones = null;
	private JMenuItem menuItemCalculadora = null;
	private IniciarSesion iniciar_Sesion;
	private JMenu menuAyuda = null;
	private JMenuItem menuItemSalir = null;
	private JDesktopPane contenedorPrincipal = null;
	private JInternalFrame jInternalFrame = null;
	private JPanel jContentPane = null;
	private JLabel lblNombreUsuario = null;
	private JLabel lblContraseña = null;
	private JTextField txtUsuario = null;
	private JPasswordField txtPassword = null;
	private JButton btnCanselar = null;
	private JButton btnLimpiar = null;
	private JButton btnAceptar = null;
	private JMenuBar getBarraMenu() {
		if (barraMenu == null) {
			barraMenu = new JMenuBar();
			barraMenu.setVisible(false);
			barraMenu.setToolTipText("Barra de Menus");
			barraMenu.add(getMenuOpciones());
			barraMenu.add(getMenuAyuda());
		}
		return barraMenu;
	}

	private JMenu getMenuOpciones() {
		if (menuOpciones == null) {
			menuOpciones = new JMenu();
			menuOpciones.setText("Menu Opciones");
			menuOpciones.add(getMenuItemCalculadora());
		}
		return menuOpciones;
	}

	private JMenuItem getMenuItemCalculadora() {
		if (menuItemCalculadora == null) {
			menuItemCalculadora = new JMenuItem();
			menuItemCalculadora.setText("Registro");
			menuItemCalculadora.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent e)
		{
		if(iniciar_Sesion == null || iniciar_Sesion.isVisible()==false)
		{
			iniciar_Sesion = new IniciarSesion();
			iniciar_Sesion.setVisible(true);
			contenedorPrincipal.add(iniciar_Sesion);
		   
		  
		}			            	
		}
			        });
				
				
		}
		return menuItemCalculadora;
	}

	private JMenu getMenuAyuda() {
		if (menuAyuda == null) {
			menuAyuda = new JMenu();
			menuAyuda.setText("Ayuda");
			menuAyuda.add(getMenuItemSalir());
		}
		return menuAyuda;
	}

	private JMenuItem getMenuItemSalir() {
		if (menuItemSalir == null) {
			menuItemSalir = new JMenuItem();
			menuItemSalir.setText("Salir");
		}
		return menuItemSalir;
	}

	/**
	 * This method initializes contenedorPrincipal	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getContenedorPrincipal() {
		if (contenedorPrincipal == null) {
			contenedorPrincipal = new JDesktopPane();
			contenedorPrincipal.add(getJInternalFrame(), null);
		}
		return contenedorPrincipal;
	}

	/**
	 * This method initializes jInternalFrame	
	 * 	
	 * @return javax.swing.JInternalFrame	
	 */
	private JInternalFrame getJInternalFrame() {
		if (jInternalFrame == null) {
			jInternalFrame = new JInternalFrame();
			jInternalFrame.setBounds(new Rectangle(192, 114, 420, 245));
			jInternalFrame.setVisible(true);
			jInternalFrame.setContentPane(getJContentPane());
		}
		return jInternalFrame;
	}

	/**
	 * This method initializes jContentPane	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lblContraseña = new JLabel();
			lblContraseña.setBounds(new Rectangle(30, 89, 165, 25));
			lblContraseña.setText("Comtraseña Usuario");
			lblNombreUsuario = new JLabel();
			lblNombreUsuario.setBounds(new Rectangle(33, 32, 165, 25));
			lblNombreUsuario.setText("Nombre de Usuario");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(lblNombreUsuario, null);
			jContentPane.add(lblContraseña, null);
			jContentPane.add(getTxtUsuario(), null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(getBtnCanselar(), null);
			jContentPane.add(getBtnLimpiar(), null);
			jContentPane.add(getBtnCancelar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtUsuario	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtUsuario() {
		if (txtUsuario == null) {
			txtUsuario = new JTextField();
			txtUsuario.setBounds(new Rectangle(225, 32, 168, 25));
		}
		return txtUsuario;
	}

	/**
	 * This method initializes txtPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getTxtPassword() {
		if (txtPassword == null) {
			txtPassword = new JPasswordField();
			txtPassword.setBounds(new Rectangle(224, 91, 170, 25));
		}
		return txtPassword;
	}

	/**
	 * This method initializes btnCanselar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCanselar() {
		if (btnCanselar == null) {
			btnCanselar = new JButton();
			btnCanselar.setBounds(new Rectangle(301, 180, 95, 26));
			btnCanselar.setText("Cancelar");
			btnCanselar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);
				}
			});
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
			btnLimpiar.setBounds(new Rectangle(163, 179, 114, 29));
			btnLimpiar.setText("Limpiar");
			btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					txtUsuario.setText("");
					txtPassword.setText("");
					
				}
			});
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
			btnAceptar.setBounds(new Rectangle(26, 181, 111, 25));
			btnAceptar.setText("Aceptar");
			btnAceptar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
                                    String var1=txtUsuario.getText();
                                    String var2=txtPassword.getText();
                                    if(var1.equals("")||var2.equals("")){
                                        if(var1.equals("")){
                                            JOptionPane.showMessageDialog(null, "Ingresar Usuario", "Error", 0);
                                        }
                                        if(var2.equals("")){
                                            JOptionPane.showMessageDialog(null, "Ingresar Contraseña", "Error", 0);
                                        }
					 // TODO Auto-generated Event stub actionPerformed()
                                    }else if(var1.equals(Usuario)&&var2.equals(Password)){
                                        barraMenu.setVisible(true);
                                        jInternalFrame.dispose();
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Usuario o Contraseña Invalidos", "Error", 0);
                                    }
                                }
			});
		}
		return btnAceptar;
	}

	public static void main(String[] args) {
		Principal thisClass = new Principal();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);

	}
	public Principal() {

		initialize();
	}

	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getContenedorPrincipal());
		this.setJMenuBar(getBarraMenu());
		this.setTitle("Ventana Principal");

	}
	
}  //  @jve:decl-index=0:visual-constraint="10,10"