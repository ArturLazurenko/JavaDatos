import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame ventana = new JFrame("Me tiro de la ventana");
        ventana.setSize(300,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);


        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        JLabel Titulo = new JLabel("Registro de datos");
        Titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        Titulo.setFont(new Font("arial",Font.BOLD,16));
        JTextField Nombre = new JTextField();
        Nombre.setMaximumSize(new Dimension(300,30));

        String[] opciones = {"Cafe","Pan","chanwis"};

        panel.add(Titulo);
        ventana.add(panel);
        ventana.setVisible(true);


    }
}
