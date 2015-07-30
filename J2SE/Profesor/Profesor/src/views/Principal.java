package views;

import controllers.ControlAcceso;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.ImageIcon;

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

    private static final long serialVersionUID = 1L;
    private JMenuBar barraMenu = null;
    private JMenu menuOpciones = null;
    private JMenuItem menuItemNuevoRegistroUuario = null;
    private RegitroUsuario iniciar_Sesion;
    private JMenu menuAyuda = null;
    private JMenuItem menuItemSalir = null;
    private JDesktopPane contenedorPrincipal = null;
    public JInternalFrame jInternalFrame = null;
    private JPanel jContentPane = null;
    private JLabel lblNombreUsuario = null;
    private JLabel lblContrasena = null;
    private JTextField txtUsuario = null;
    private JPasswordField txtPassword = null;
    private JButton btnCancelar = null;
    private JButton btnLimpiar = null;
    private JButton btnAceptar = null;
    private ControlAcceso control = null;

    private JMenuBar getBarraMenu() {
        if (barraMenu == null) {
            barraMenu = new JMenuBar();
            barraMenu.setToolTipText("Barra de Menus");
            barraMenu.add(getMenuOpciones());
            //barraMenu.add(getMenuAyuda());
        }
        return barraMenu;
    }

    private JMenu getMenuOpciones() {
        if (menuOpciones == null) {
            menuOpciones = new JMenu();
            menuOpciones.setText("Menu Opciones");
            menuOpciones.add(getMenuItemNuevoRegistro());
            menuOpciones.add(getMenuItemSalir());

        }
        return menuOpciones;
    }

    private JMenuItem getMenuItemNuevoRegistro() {
        if (menuItemNuevoRegistroUuario == null) {
            menuItemNuevoRegistroUuario = new JMenuItem();
            menuItemNuevoRegistroUuario.setIcon(new ImageIcon(getClass().getResource("/imagenes/nuevoregistrousuario.png")));
            menuItemNuevoRegistroUuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));

            menuItemNuevoRegistroUuario.setText("Registrar Personal");

            menuItemNuevoRegistroUuario.setText("Registro De Usuarios");
            menuItemNuevoRegistroUuario.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (iniciar_Sesion == null || iniciar_Sesion.isVisible() == false) {
                        iniciar_Sesion = new RegitroUsuario();
                        iniciar_Sesion.setVisible(true);
                        contenedorPrincipal.add(iniciar_Sesion);

                    }
                }
            });

        }
        return menuItemNuevoRegistroUuario;
    }

    private JMenuItem getMenuItemSalir() {
        if (menuItemSalir == null) {
            menuItemSalir = new JMenuItem();
            menuItemSalir.setText("Salir del Sistema");
            menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
            menuItemSalir.setIcon(new ImageIcon(getClass().getResource("/imagenes/sALIR_sISTEMA.png")));
            menuItemSalir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        }
        return menuItemSalir;
    }

    private JDesktopPane getContenedorPrincipal() {
        if (contenedorPrincipal == null) {
            contenedorPrincipal = new JDesktopPane();
            contenedorPrincipal.add(getJInternalFrame(), null);
        }
        return contenedorPrincipal;
    }

    private JInternalFrame getJInternalFrame() {
        if (jInternalFrame == null) {
            jInternalFrame = new JInternalFrame();
            jInternalFrame.setBounds(new Rectangle(192, 114, 420, 245));
            jInternalFrame.setVisible(true);
            jInternalFrame.setContentPane(getJContentPane());
        }
        return jInternalFrame;
    }

    private JPanel getJContentPane() {
        if (jContentPane == null) {
            lblContrasena = new JLabel();
            lblContrasena.setBounds(new Rectangle(30, 89, 165, 25));
            lblContrasena.setText("Comtrase�a Usuario");
            lblNombreUsuario = new JLabel();
            lblNombreUsuario.setBounds(new Rectangle(33, 32, 165, 25));
            lblNombreUsuario.setText("Nombre de Usuario");
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(lblNombreUsuario, null);
            jContentPane.add(lblContrasena, null);
            jContentPane.add(getTxtUsuario(), null);
            jContentPane.add(getTxtPassword(), null);
            jContentPane.add(getBtnCancelar(), null);
            jContentPane.add(getBtnLimpiar(), null);
            jContentPane.add(getBtnAceptar(), null);
        }
        return jContentPane;
    }

    private JTextField getTxtUsuario() {
        if (txtUsuario == null) {
            txtUsuario = new JTextField();
            txtUsuario.setBounds(new Rectangle(225, 32, 168, 25));
        }
        return txtUsuario;
    }

    private JPasswordField getTxtPassword() {
        if (txtPassword == null) {
            txtPassword = new JPasswordField();
            txtPassword.setBounds(new Rectangle(224, 91, 170, 25));
        }
        return txtPassword;
    }

    private JButton getBtnCancelar() {
        if (btnCancelar == null) {
            btnCancelar = new JButton();
            btnCancelar.setBounds(new Rectangle(301, 180, 95, 26));
            btnCancelar.setText("Cancelar");
            btnCancelar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    System.exit(0);
                }
            });
        }
        return btnCancelar;
    }

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

    private JButton getBtnAceptar() {
        if (btnAceptar == null) {
            btnAceptar = new JButton();
            btnAceptar.setBounds(new Rectangle(26, 181, 111, 25));
            btnAceptar.setText("Aceptar");
            	btnAceptar.addActionListener(control);//registrando el listener
				
            /*  btnAceptar.addMouseListener(new MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent e) {
             String a = txtUsuario.getText();
             String b = txtUsuario.getText();
             String id = "admin";
             String pass = "12345";
             if (a.equals("") && b.equals("")) {
             JOptionPane.showMessageDialog(null, "Ingrese los datos", "Mensaje de Advertencia", 0);
             } else if (id.equals(txtUsuario.getText()) && pass.equals(txtPassword.getText())) {
             JOptionPane.showMessageDialog(null, "Bienvenido", "Mensaje de Bienvenido", 1);
             //  MenuContenedor().setVisible(true);
             jInternalFrame.dispose();
             } else if (a.equals("")) {
             JOptionPane.showMessageDialog(null, "Ingrese Usuario", "Mensaje de Advertencia", 0);
             } else if (b.equals("")) {
             JOptionPane.showMessageDialog(null, "Ingrese Clave", "Mensaje de Advertencia", 0);
             } else {
             JOptionPane.showMessageDialog(null, "Usuario o Clave Incorrecto", "Mensaje de Error", 0);
             }
             }
             });*/
        }
        return btnAceptar;
    }

    public static void main(String[] args) {
        Principal thisClass = new Principal();
        thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thisClass.setVisible(true);

    }

    public Principal() {
        control = new ControlAcceso(this);
        initialize();
    }

    private void initialize() {
        this.setSize(1000, 700);
        // this.setUndecorated(true);
        this.setContentPane(getContenedorPrincipal());
        this.setJMenuBar(getBarraMenu());
        this.setTitle("Ventana Principal");

    }

    public String getUsuario() {
        return txtUsuario.getText();
    }

    public String getClave() {
        return String.copyValueOf(txtPassword.getPassword());
    }

}
