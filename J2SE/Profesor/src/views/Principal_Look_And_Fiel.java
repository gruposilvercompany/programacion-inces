package views;



import views.Principal;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.EventQueue;
import java.awt.Frame;
import javax.swing.JFrame;

import javax.swing.UIManager;
public class Principal_Look_And_Fiel {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {

                    NimRODTheme nt = new NimRODTheme("Mi_Theme/Mi_Theme_1.theme");
                    NimRODLookAndFeel nf = new NimRODLookAndFeel();
                    NimRODLookAndFeel.setCurrentTheme(nt);
                    UIManager.setLookAndFeel(nf);

                } catch (Exception e) {
                }
                Principal frame = new Principal();
                frame.setVisible(true);
                frame.setSize(900, 700);
                frame.setLocationRelativeTo(null);
                frame.setExtendedState(Frame.MAXIMIZED_BOTH);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
    }

}
