package Vista;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{

	private JPanel panel = null;
	private JDesktopPane ContenedorPrincipal = null;
	private JInternalFrame IntFrame = null;
	
        private JMenuBar MenuPrincipal = null;
        private JMenu archivo = null;
        private JMenuItem nuevo, registro = null;
        
	private JLabel inicio = null;
        private JLabel usuario, clave = null;
        private JTextField txtusuario = null;
        private JPasswordField txtclave = null;
        
        private JButton btnaceptar, btnlimpiar, btncancelar = null;
        
        private Registro vntRegistro;
	
	private static final long serialVersionUID = 1459206530077350977L;

	public Login(){
              
		Inicializar();
	}
	
	public void Inicializar(){
		this.setTitle("Login");
		this.setSize(450,600);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(getContenedorPrincipal());
		this.setJMenuBar(MenuContenedor());
	}
        
        //Inicio del codigo para el menu
	private JMenuBar MenuContenedor(){
		if (MenuPrincipal == null){
			MenuPrincipal = new JMenuBar();
                        MenuPrincipal.setVisible(false);
			MenuPrincipal.add(ArchivoMenu());
		}
		return MenuPrincipal;
	}
	
	private JMenu ArchivoMenu(){
		if (archivo == null){
			archivo = new JMenu();
			archivo.setText("Archivo");
			archivo.add(NuevoArchivo());
                        archivo.add(RegistroArchivo());
		}
		return archivo;
	}
        
        private JMenuItem NuevoArchivo(){
        if (nuevo == null){
                nuevo = new JMenuItem();
                nuevo.setText("Nuevo");
                }
            return nuevo;
        }
        
                private JMenuItem RegistroArchivo(){
        if (registro == null){
                registro = new JMenuItem();
                registro.setText("Registro");
                
                registro.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        if (vntRegistro == null || vntRegistro.isVisible()==false){
                            vntRegistro = new Registro();
                            vntRegistro.setVisible(true);
                            ContenedorPrincipal.add(vntRegistro);
                        }
                    }
                });
                
                }
            return registro;
        }
	
	private JDesktopPane getContenedorPrincipal() {
		if (ContenedorPrincipal == null) {
			ContenedorPrincipal = new JDesktopPane();
			ContenedorPrincipal.add(InternalFrame(), null);
		}
		return ContenedorPrincipal;
	}
	
	private JInternalFrame InternalFrame(){
		if (IntFrame == null){
			IntFrame = new JInternalFrame();
			IntFrame.setVisible(true);
			IntFrame.setBounds(new Rectangle(50,20,300,300));
			IntFrame.setContentPane(ContPanel());
			//Componentes
			
		}
		return IntFrame;
	}
	
	private JPanel ContPanel(){
		if (panel == null){
			panel = new JPanel();
			panel.setLayout(null);
                        //Componentes
                        panel.add(getInicio(), null);
                        panel.add(getNombre(), null);
                        panel.add(getTxtUsuario(), null);
                        panel.add(getClave(), null);
                        panel.add(getTxtClave(), null);
                        panel.add(Aceptar(), null);
                        panel.add(Limpiar(), null);
                        panel.add(Cancelar(), null);
		}
		return panel;
	}
	
	private JLabel getInicio(){
		if (inicio == null){
			inicio = new JLabel();
			inicio.setText("Iniciar Sesion");
			inicio.setBounds(new Rectangle(20,20,100,20));
		}
		return inicio;
	}
        
        	private JLabel getNombre(){
		if (usuario == null){
			usuario = new JLabel();
			usuario.setText("Usuario");
			usuario.setBounds(new Rectangle(10,50,100,20));
		}
		return usuario;
	}
                
                	private JTextField getTxtUsuario(){
		if (txtusuario == null){
			txtusuario = new JTextField();
			txtusuario.setBounds(new Rectangle(70,50,100,20));
		}
		return txtusuario;
	}
                        
              private JLabel getClave(){
		if (clave == null){
			clave = new JLabel();
			clave.setText("Clave");
			clave.setBounds(new Rectangle(10,70,100,20));
		}
		return clave;
	}
                
                	private JPasswordField getTxtClave(){
		if (txtclave == null){
			txtclave = new JPasswordField();
			txtclave.setBounds(new Rectangle(70,70,100,20));
		}
		return txtclave;
	}
                        
         	private JButton Aceptar(){
		if (btnaceptar == null){
			btnaceptar = new JButton();
			btnaceptar.setText("Aceptar");
                        btnaceptar.setBounds(new Rectangle(1,110,120,20));
                        
                         btnaceptar.addMouseListener(new MouseAdapter() {
				   public void mouseClicked(java.awt.event.MouseEvent e){
                                       
                                       String a = txtusuario.getText();
                                       String b =  txtclave.getText();
                                       
                                       String id = "admin";
                                       String pass = "12345";
                                       
                                       if (a.equals("") && b.equals("")){
                                           JOptionPane.showMessageDialog(null, "Ingrese los datos", "Mensaje de Advertencia", 0);
                                       }
                                       
                                       else if (id.equals(txtusuario.getText()) && pass.equals(txtclave.getText())) {
                                           JOptionPane.showMessageDialog(null, "Bienvenido", "Mensaje de Bienvenido", 1);
                                           
                                           MenuContenedor().setVisible(true);
                                           IntFrame.dispose();
                                       }
                                       else if (a.equals("")){
                                           JOptionPane.showMessageDialog(null, "Ingrese Usuario", "Mensaje de Advertencia", 0);
                                       }
                                       else if (b.equals("")){
                                           JOptionPane.showMessageDialog(null, "Ingrese Clave", "Mensaje de Advertencia", 0);
                                       }
                                        
                                       else JOptionPane.showMessageDialog(null, "Usuario o Clave Incorrecto", "Mensaje de Error", 0);
				   }
			   });
                        
		}
		return btnaceptar;
	}
	
	private JButton Limpiar(){
		if (btnlimpiar== null){
			btnlimpiar = new JButton();
			btnlimpiar.setText("Limpiar");
			btnlimpiar.setBounds(new Rectangle(130,110,120,20));
                        
                        btnlimpiar.addMouseListener(new MouseAdapter() {
				   public void mouseClicked(java.awt.event.MouseEvent e){
					   
                                       txtusuario.setText(null);
                                       txtclave.setText(null);
				   }
			   });
		}
		return btnlimpiar;
	}
        
        	private JButton Cancelar(){
		if (btncancelar== null){
			btncancelar = new JButton();
			btncancelar.setText("Cancelar");
			btncancelar.setBounds(new Rectangle(70,140,120,20));
                        
                         btncancelar.addMouseListener(new MouseAdapter() {
				   public void mouseClicked(java.awt.event.MouseEvent e){
					   
                                       dispose();
				   }
			   });
		}
		return btncancelar;
	}
	
	public static void main(String[] args) {
		Login ventana = new Login();
		ventana.setVisible(true);

	}

}
