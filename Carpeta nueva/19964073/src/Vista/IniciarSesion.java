package Vista;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

public class IniciarSesion extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
        JTextField campo1 = null;
        JTextField campo2 = null;
        JButton btnSumar = null;
        JButton btnResta = null;
        JButton btnMultiplicacion = null; 
        JButton btnDivision = null; 
        
        

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
        public JButton getbtnSumar (){
		   if(btnSumar ==null){
			   btnSumar = new JButton();
			   btnSumar.setText("Suma");
			   btnSumar.setBounds(new Rectangle(20,20,10,20));

			   
		   }
		   
		   return btnSumar;
		   
	   }
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
                        jContentPane.add(getbtnSumar());
		}
		return jContentPane;
	}

}
