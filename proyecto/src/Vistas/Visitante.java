package Vistas;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sun.security.jgss.LoginConfigImpl;

import com.sun.glass.events.MouseEvent;

public class Visitante extends JFrame{

	private static final long serialVersionUID = 1L;
	JPanel panel = null;
	JLabel clasif1 = null;
	JTextArea area1, imgarea1 = null;
	JButton btnregistro, btnlogin = null;

	
	public Visitante(){
		Inicializar();
	}
	
	private  void Inicializar() {
		this.setVisible(true);
		this.setSize(400,600);
		this.setLocationRelativeTo(null);
		this.setTitle("Clasificados");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(contenedor());
		
	}
	
	private JPanel contenedor(){
		   if (panel == null){
			   panel = new JPanel();
			   panel.setLayout(null);
			   panel.add(getLabel(),null);
			   panel.add(getArea1(), null);
			   panel.add(getArea2(), null);
			   panel.add(getBoton1(), null);
			   panel.add(getBoton2(), null);
		   }
		return panel;
	}
	
	   private JLabel getLabel(){
		   if(clasif1 == null){
			   clasif1 = new JLabel();
			   clasif1.setText("Clasificado 1: ");
			   clasif1.setBounds(new Rectangle(100,1,100,100));  
		   }
		   return clasif1;
	   }
	   
	   private JTextArea getArea1(){
		   if (area1 == null){
			   area1 = new JTextArea();
			   area1.setText("Informacion");
			   area1.setBounds(new Rectangle(200, 20, 100, 70));
		   }
		   return area1;
	   }
	   
	   private JTextArea getArea2(){
		   if (imgarea1 == null){
			   imgarea1 = new JTextArea();
			   imgarea1.setText("Imagen");
			   imgarea1.setBounds(new Rectangle(100, 80, 100, 70));
		   }
		   return imgarea1;
	   }
	   
	   private JButton getBoton1(){
		   if (btnregistro == null){
			   btnregistro = new JButton();
			   btnregistro = new JButton("Registro");
			   btnregistro.setBounds(new Rectangle(50,310,100,20));
			   
			   btnregistro.addMouseListener(new MouseAdapter(){
				   public void mouseClicked(java.awt.event.MouseEvent e){
					   Registro registro = new Registro();
					   registro.setVisible(true);
					   registro.setDefaultCloseOperation(EXIT_ON_CLOSE);
				   }
				 
			   });
		   }
		return btnregistro;
	   }
	   
	   private JButton getBoton2(){
		   if (btnlogin == null){
			   btnlogin = new JButton();
			   btnlogin = new JButton("Login");
			   btnlogin.setBounds(new Rectangle(160,310,100,20));
			   
			   btnlogin.addMouseListener(new MouseAdapter(){
				   public void mouseClicked(java.awt.event.MouseEvent e){
					   Logeo login = new Logeo();
					   login.setVisible(true);
					   login.setDefaultCloseOperation(EXIT_ON_CLOSE);
				   }
				 
			   });
		   }
		return btnlogin;
	   }

	
	public static void main(String[] args) {
		Visitante obj1 = new Visitante();
		obj1.setVisible(true);


	}

}
