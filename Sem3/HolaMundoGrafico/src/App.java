import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame ventana = new JFrame("Me tiro de la ventana");
        ventana.setSize(300,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        
       
        JLabel etiqueta = new JLabel("Hola Mundo");
        JButton boton = new JButton("Dale click aqui bro");

        boton.addActionListener(e -> {
            etiqueta.setText("boton presionado :v");
        });

        JPanel panel = new JPanel();
        panel.add(etiqueta);
        panel.add(boton);

        ventana.add(panel);
        ventana.setVisible(true);
    }
}
