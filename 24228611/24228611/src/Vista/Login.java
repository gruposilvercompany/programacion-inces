package Vista;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Menu");
		}
		return jMenu;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login thisClass = new Login();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);
	}

	/**
	 * This is the default constructor
	 */
	public Login() {
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
		this.setJMenuBar(getJJMenuBar());
		this.setTitle("JFrame");
	}

}
