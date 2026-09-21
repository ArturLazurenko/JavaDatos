import javax.swing.*;
import java.awt.*;


public class App {
    private static Pila<String> pila = new Pila<>();
    public static void main(String[] args) throws Exception {
        JFrame ventana = new JFrame("GUI Pila");
        ventana.setSize(350,400);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JPanel panelControles = new JPanel(new GridLayout(3,1,5,5));
        JTextField txtValor = new JTextField();
        JButton btnPush = new JButton("Apilar elemento(push)");
        JButton btnPop = new JButton("Desapilar elemnto(pop)"); 
        panelControles.add(new JLabel("Valor a insertar"));
        panelControles.add(txtValor);

        JPanel panelBotones = new JPanel(new GridLayout(1,2,5,5));
        panelBotones.add(btnPush);
        panelBotones.add(btnPop);

        panelControles.add(panelBotones);

        panel.add(panelControles, BorderLayout.NORTH);

        JTextArea txtAreaPila = new JTextArea();
        txtAreaPila.setEditable(false);
        txtAreaPila.setFont(new Font("Monospaced",Font.PLAIN,16));
        JScrollPane scrollPane = new JScrollPane(txtAreaPila);

        JPanel panelcentro = new JPanel(new BorderLayout());
        panelcentro.add(new JLabel("Estado de la pila"),BorderLayout.NORTH);
        panelcentro.add(scrollPane,BorderLayout.CENTER);
        panel.add(panelcentro,BorderLayout.CENTER);


        Runnable actualizarVisual = () -> {
            txtAreaPila.setText(pila.show());   
        };

        btnPush.addActionListener ( e -> {
            String valor = txtValor.getText().trim();
            if (!valor.isEmpty()) {
                pila.push(valor);
                txtValor.setText("");
                actualizarVisual.run();
            } else {
                JOptionPane.showMessageDialog(ventana, "Ingrese un valor válido.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        });

        btnPop.addActionListener ( e -> {
            if (!pila.isEmpty()) {
                String valor = pila.pop();
                JOptionPane.showMessageDialog(ventana, "Elemento desapilado: " + valor, "Información", JOptionPane.INFORMATION_MESSAGE);
                actualizarVisual.run();
            } else {
                JOptionPane.showMessageDialog(ventana, "La pila está vacía.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        });

        ventana.add(panel);
        ventana.setVisible(true);
    }
}
