package Vistas;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Logeo extends JFrame{


	private static final long serialVersionUID = 1L;
	JPanel panel = null;
	JLabel usuario, clave, inicio = null;
	JTextField campo = null;
	JPasswordField txtclave = null;
	JButton btnaceptar, btnsalir = null;
	
	public Logeo(){
		Inicializar();
	}
	
	public void Inicializar(){
		this.setVisible(true);
		this.setSize(360, 300);
		this.setLocationRelativeTo(null);
		this.setTitle("Login");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(contenedor());
	}
	
	private JPanel contenedor(){
		   if (panel == null){
			   panel = new JPanel();
			   panel.setLayout(null);
			   //agregar componentes
			   panel.add(getLabelI(), null);
			   panel.add(getLabel(), null);
			   panel.add(getText(), null);
			   panel.add(getLabel1(), null);
			   panel.add(getText1(), null);
			   panel.add(getButton(), null);
			   panel.add(getButton1(), null);
		   }
		return panel;
	}
	
	private JLabel getLabelI(){
		   if(inicio == null){
			   inicio = new JLabel();
			   inicio.setText("Ingrese sus datos");
			   inicio.setBounds(new Rectangle(70,10,150,20));
		   }
		   return inicio;
}
	
		private JLabel getLabel(){
			   if(usuario == null){
				   usuario = new JLabel();
				   usuario.setText("Usuario");
				   usuario.setBounds(new Rectangle(50,40,50,20));  
			   }
			   return usuario;
	}
		
		private JTextField getText(){
			if (campo == null){
				campo = new JTextField();
				campo.setBounds(new Rectangle(100, 40, 100, 20));
			}
			return campo;
		}
		
		private JLabel getLabel1(){
			   if(clave == null){
				   clave = new JLabel();
				   clave.setText("Clave");
				   clave.setBounds(new Rectangle(50,70,50,20));  
			   }
			   return clave;
	}
		
		private JPasswordField getText1(){
			if (txtclave == null){
				txtclave = new JPasswordField();
				txtclave.setBounds(new Rectangle(100, 70, 100, 20));
			}
			return txtclave;
		}
		
		private JButton getButton(){
			if (btnaceptar == null){
				btnaceptar = new JButton();
				btnaceptar.setText("Aceptar");
				btnaceptar.setBounds(new Rectangle(50, 110, 90, 20));
			}
			return btnaceptar;
		}
		
		private JButton getButton1(){
			if (btnsalir == null){
				btnsalir = new JButton();
				btnsalir.setText("Salir");
				btnsalir.setBounds(new Rectangle(150, 110, 90, 20));
			}
			return btnsalir;
		}

	public static void main(String[] args) {
		new Logeo();

	}

}
