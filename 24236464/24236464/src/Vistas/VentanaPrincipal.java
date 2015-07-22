package Vistas;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuBar barramenu = null;
	private JMenu Menu = null;
	private JMenuItem MenuItem = null;
	private JMenuItem Menusalir = null;
	/**
	 * This method initializes barramenu	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getBarramenu() {
		if (barramenu == null) {
			barramenu = new JMenuBar();
			barramenu.add(getMenu());
		}
		return barramenu;
	}

	/**
	 * This method initializes Menu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getMenu() {
		if (Menu == null) {
			Menu = new JMenu();
			Menu.setText("Men�");
			Menu.add(getMenuItem());
			Menu.add(getMenusalir());
		}
		return Menu;
	}

	/**
	 * This method initializes MenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getMenuItem() {
		if (MenuItem == null) {
			MenuItem = new JMenuItem("archivo");
		}
		return MenuItem;
	}

	/**
	 * This method initializes Menusalir	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenuItem getMenusalir() {
		if (Menusalir == null) {
			Menusalir = new JMenuItem();
			Menusalir.setText("Salir del Sistema");
			Menusalir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0); // TODO Auto-generated Event stub actionPerformed()
				}
			});
			
			
		}
		return Menusalir;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaPrincipal thisClass = new VentanaPrincipal();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);
	}

	/**
	 * This is the default constructor
	 */
	public VentanaPrincipal() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setJMenuBar(getBarramenu());
		this.setTitle("JFrame");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}