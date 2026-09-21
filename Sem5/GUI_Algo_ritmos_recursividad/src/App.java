import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.net.*;

public class App {

    public static long calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    public static long calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
    public static void main(String[] args) throws Exception {
        
        JFrame ventana = new JFrame("Recursividad");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 400);

        try {

            Image iconoVentana = Toolkit.getDefaultToolkit().getImage(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSje8VyyUu-TlJK2_VJqJNlgmv3NObdYLxO01XEnC_-exHDwJmzXeEbAOg&s=10"));
            ventana.setIconImage(iconoVentana);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblBanner = new JLabel();
        lblBanner.setHorizontalAlignment(SwingConstants.CENTER);
        try {
            URL urlBanner = new URL("https://media.gettyimages.com/id/2188500771/es/foto/topshot-israeli-prime-minister-benjamin-netanyahu-speaks-during-a-press-conference-in.jpg?s=612x612&w=gi&k=20&c=XUezWTmWGhShTXCIde3b0Mq5cXN2AsUMwtdyBdIYtQ0=");
            Image ImagenNormal = ImageIO.read(urlBanner);
            Image ImagenRedimensionada = ImagenNormal.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
            lblBanner.setIcon(new ImageIcon(ImagenRedimensionada));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(lblBanner);

        JTabbedPane pestañas = new JTabbedPane();
        JPanel panelFactorial = new JPanel();
        panelFactorial.setLayout(new GridLayout(3, 1, 10 , 10));
        panelFactorial.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        JTextField txtNumeroFactorial = new JTextField("5");
        JButton btnCalcularFactorial = new JButton("Calcular Factorial (n!)");
        JTextArea lblResultadoFactorial = new JTextArea();
        lblResultadoFactorial.setEditable(false);
        lblResultadoFactorial.setFont(new Font("MonoSpace", Font.PLAIN, 16));

        JPanel subPanelF = new JPanel(new GridLayout(1, 2, 5 , 5));
        subPanelF.add(new JLabel("Número: "));
        subPanelF.add(txtNumeroFactorial);



        panelFactorial.add(subPanelF);
        panelFactorial.add(btnCalcularFactorial);
        panelFactorial.add(lblResultadoFactorial);

        btnCalcularFactorial.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(txtNumeroFactorial.getText().trim());
                if (numero < 0 || numero > 20) {
                    lblResultadoFactorial.setText("Por favor, ingrese un número entre 0 y 20");
                } else {
                    long resultado = calcularFactorial(numero);
                    lblResultadoFactorial.setText("El factorial de " + numero + " es: " + resultado);
                    
                }
            } catch (NumberFormatException ex) {
                lblResultadoFactorial.setText("Por favor, ingrese un número válido.");
            }
        });

        JPanel panelFibonacci = new JPanel();
        panelFibonacci.setLayout(new GridLayout(3, 1, 10 , 10));
        panelFibonacci.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        JTextField txtNumeroFibonacci = new JTextField("5");
        JButton btnCalcularFibonacci = new JButton("Calcular Fibonacci (n-th)");
        JTextArea lblResultadoFibonacci = new JTextArea();
        lblResultadoFibonacci.setEditable(false);
        lblResultadoFibonacci.setFont(new Font("MonoSpace", Font.PLAIN, 16));

        JPanel subPanelFib = new JPanel(new GridLayout(1, 2, 5 , 5));
        subPanelFib.add(new JLabel("Número: "));
        subPanelFib.add(txtNumeroFibonacci);

        panelFibonacci.add(subPanelFib);
        panelFibonacci.add(btnCalcularFibonacci);
        panelFibonacci.add(lblResultadoFibonacci);

        btnCalcularFibonacci.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(txtNumeroFibonacci.getText().trim());
                if (numero < 0 || numero > 20) {
                    lblResultadoFibonacci.setText("Por favor, ingrese un número entre 0 y 20");
                } else {
                    long resultado = calcularFibonacci(numero);
                    lblResultadoFibonacci.setText("El fibonacci de " + numero + " es: " + resultado);
                }
            } catch (NumberFormatException ex) {
                lblResultadoFibonacci.setText("Por favor, ingrese un número válido.");
            }
        });
        
        pestañas.addTab("Factorial", panelFactorial);
        pestañas.addTab("Fibonacci", panelFibonacci);

        panel.add(pestañas);
        ventana.add(panel);
        ventana.setVisible(true);
    }
}
