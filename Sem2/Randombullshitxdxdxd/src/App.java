import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cola<Proceso> queueCPU = new Cola<>();
        pila<String> pilaLLamadas = new pila<>();

        int opcion;
        do {
            System.out.println("1. Registra proceso (queue)");
            System.out.println("2. Ejecutar proceso (queue)");
            System.out.println("3. Ver proceso (queue)");
            System.out.println("4. Mostara cola (queue)");
            System.out.println("5. Simular llamada funcional (pila)");
            System.out.println("6. Retornar la funcion actual (pila)");
            System.out.println("7. Ver funcion en le tope (pila)");
            System.out.println("8. Mostrar pila (pila)");
            System.out.println("9. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ID del proceso: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("nombre del proceso: ");
                    String nombre = sc.nextLine();
                    System.out.println("usuario del proceso: ");
                    String usuario = sc.nextLine();
                    System.out.println("tiempo estimado del proceso: ");
                    int tiempoEstimado = sc.nextInt();

                    Proceso nuevoProceso = new Proceso(id, nombre, usuario, tiempoEstimado);
                    queueCPU.inQueue(nuevoProceso);
                    System.out.println("Registrado!!");
                    break;
                case 2:
                    System.out.println("Ejectutando...");
                    Proceso ejecutado = queueCPU.deQueue();
                    if (ejecutado != null) {
                        System.out.println("procesando tarea: " + ejecutado);
                    }
                    break;
                case 3:
                    Proceso frente = queueCPU.peek();
                    if (frente != null) {
                        System.out.println("Primer proseso: " + frente);
                    } else {
                        System.out.println("no hay nada");
                    }
                    break;
                default:
                    break;
            }
        } while (opcion != 9);

        sc.close();
    }
}
