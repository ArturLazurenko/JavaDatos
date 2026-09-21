import javax.swing.*;

import java.awt.*;

public class App extends JFrame{
    private JTextField txtObjetivo;
    private JTextArea areaResultado;

    private int[] num = {1,2,3,4,5,6,7,8,9,10};

    public App() {
        setTitle("Metodos de Busqueda");
        setSize(480,360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panelPrincipal = new JPanel(new BorderLayout(10,10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JPanel panelControles = new JPanel(new GridLayout(3,1,5,5));

        JPanel subPanelInput = new JPanel(new GridLayout(3,1,5,5));
        subPanelInput.add(new JLabel("Ingrese el numero a buscar:"));
        txtObjetivo = new JTextField("67");
        subPanelInput.add(txtObjetivo);

        JButton btnBusquedaLineal = new JButton("Busqueda Lineal");
        JButton btnBusquedaBinaria = new JButton("Busqueda Binaria");


        panelControles.add(subPanelInput);
        panelControles.add(btnBusquedaLineal);
        panelControles.add(btnBusquedaBinaria);

        panelPrincipal.add(panelControles, BorderLayout.NORTH);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        areaResultado.setFont(new Font("Arial", Font.PLAIN, 14));
        areaResultado.setText("Arreglo Ejemplo:\n[1,2,3,4,5,6,7,8,9]\nSelecciona un metodo de Busqueda");

        panelPrincipal.add(new JScrollPane(areaResultado), BorderLayout.CENTER);

        btnBusquedaLineal.addActionListener(e -> {
            try {
                int objetivo = Integer.parseInt(txtObjetivo.getText().trim());
                int indice = AlgoritmosBusqueda.buscarLineal(num, objetivo);

                areaResultado.setText("Metodo de busqueda Lineal:\n");
                if (indice != -1) {
                    areaResultado.append("El numero " + objetivo + " se encuentra en el indice: " + indice);
                } else {
                    areaResultado.append("El numero " + objetivo + " no se encuentra en el arreglo.");
                }
            } catch (NumberFormatException ex) {
                areaResultado.setText("Por favor, ingrese un número válido.");
            }
        });
        add(panelPrincipal);
    }
    public static void main(String[] args) throws Exception {
        App frame = new App();
        frame.setVisible(true);
    }
}
