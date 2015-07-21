package Vista;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class Ventana extends JFrame{

	
	private static final long serialVersionUID = -1683049540705434541L;
	
	private JMenuBar menu = null;
	private JMenu opciones = null;
	private JMenuItem calculadora, registroI, salir = null;
	
	private JPanel panel = null;
	private JLabel inicio = null;
	
	private JButton calc, ecu, login, registro = null;
	
	private Registro registrov;

	public Ventana(){
		Inicializar();
	}
	
	public void Inicializar(){
		this.setVisible(true);
		this.setLocation(400,200);
		this.setSize(300,300);
		this.setTitle("Ventana Principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setJMenuBar(MenuContenedor());
		this.setContentPane(Contenedor());
	}
	
	//Inicio del codigo para el menu
	private JMenuBar MenuContenedor(){
		if (menu == null){
			menu = new JMenuBar();
			menu.add(OpcionesMenu());
		}
		return menu;
	}
	
	private JMenu OpcionesMenu(){
		if (opciones == null){
			opciones = new JMenu();
			opciones.setText("Opciones");
			opciones.add(CalculadoraItem());
			opciones.add(RegistroItem());
			opciones.add(SalirItem());
		}
		return opciones;
	}
	
	private JMenuItem RegistroItem(){
		if (registroI == null){
			registroI = new JMenuItem();
			registroI.setText("Registro");
		}
		
		registroI.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		if(registrov == null || registrov.isVisible()==false)
		{
			registrov = new Registro();
			registrov.setVisible(true);
			Contenedor().add(registrov);
		  
		}			            	
		}
			        });
		
		return registroI;
	}
	
	private JMenuItem CalculadoraItem(){
		if (calculadora == null){
			calculadora = new JMenuItem();
			calculadora.setText("Calculadora");
		}
		return calculadora;
	}
	
	private JMenuItem SalirItem(){
		if (salir == null){
			salir = new JMenuItem();
			salir.setText("Salir");
		}
		return salir;
	}
	//Aqui termina el codigo para el menu
	
	//Aqui empieza el codigo para el panel
	
	private JPanel Contenedor(){
		if (panel == null){
			panel = new JPanel();
			panel.setLayout(null);
			
			panel.add(getInicio(), null);
			panel.add(btnCalculadora(), null);
			panel.add(btnEcuacion(), null);
			panel.add(btnLogin(), null);
			panel.add(btnRegistro(), null);
		}
		return panel;
	}
	
	private JLabel getInicio(){
		if (inicio == null){
			inicio = new JLabel();
			inicio.setText("Seleccione una Opción");
			inicio.setBounds(new Rectangle(70,10,130,20));
		}
		return inicio;
	}
	
	private JButton btnCalculadora(){
		if (calc == null){
			calc = new JButton();
			calc.setText("Calculadora");
			calc.setBounds(new Rectangle(10,50,120,20));
			
			
		}
		return calc;
	}
	
	private JButton btnEcuacion(){
		if (ecu == null){
			ecu = new JButton();
			ecu.setText("Ecuaciones");
			ecu.setBounds(new Rectangle(10,80,120,20));

			 ecu.addMouseListener(new MouseAdapter() {
				   public void mouseClicked(java.awt.event.MouseEvent e){
					   Calculadora calc = new Calculadora();
					   calc.setVisible(true);
					   calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
				   }
			   });
			
		}
		return ecu;
	}
	
	private JButton btnLogin(){
		if (login == null){
			login = new JButton();
			login.setText("Login");
			login.setBounds(new Rectangle(10,120,120,20));
		}
		return login;
	}
	
	private JButton btnRegistro(){
		if (registro == null){
			registro = new JButton();
			registro.setText("Registro");
			registro.setBounds(new Rectangle(10,150,120,20));
		}
		return registro;
	}
	
	//Aqui termina el codigo para el panel

	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		ventana.setVisible(true);

	}

}
