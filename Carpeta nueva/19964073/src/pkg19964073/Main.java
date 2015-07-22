/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19964073;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author inces
 */
public class Main extends JFrame {
    
    JDesktopPane panel=null;
    JLabel lusu=null;
    JLabel lpass=null;
    JTextField tusu=null;
    JPasswordField pass=null;
    JMenuBar menu=null;
    JMenu registro=null;
    
    
    
    
    
    
    public void Main(){
        inicializar();
    }
    
    public void inicializar(){
        this.setTitle("Contenedores");
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
