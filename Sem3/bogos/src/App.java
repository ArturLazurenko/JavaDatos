import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cola<String> Fila = new Cola<>();
        byStaXx<String> Historial = new byStaXx<>();
        SimpleHashTable<String,String> invetario = new SimpleHashTable<>(10);

        int opcion = 0;
        do{
            System.out.println("===Menu Bogos===");
            System.out.println("1. Instertar producto nuevo");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Formar un cliente");
            System.out.println("4. Atender un cliente");
            System.out.println("5. Instertar Venta nueva");
            System.out.println("6. Deshacer ultima venta");
            System.out.println("7. Salir");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Insterte nombre: ");
                    String key = sc.nextLine();
                    System.out.print("Insterte Precio: ");
                    sc.nextLine();
                    String value = sc.nextLine();
                    invetario.put(key,value);
                    System.out.println("Producto insertado corretamente!!!");
                    break;
                case 2:
                    invetario.showTable();
                    break;
                case 3:
                    System.out.println("Insterte nombre del cliente: ");
                    String cliente = sc.nextLine();
                    Fila.enQueue(cliente);
                    System.out.println("El cliente "+cliente+" se ah formado");
                    break;
                case 4: 
                    System.out.println("Atendiendo "+Fila.front+"...");
                    Fila.deQueue();
                    break;
                case 5:
                    System.out.println("Insterte la nueva venta (Cliente - Venta)");
                    String venta = sc.nextLine();
                    Historial.push(venta);
                    break;
                case 6: 
                    System.out.println("Eliminando "+ Historial.top);
                    Historial.pop();
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                default:
                    break;
            }
        }while(opcion != 7);



    }
}
