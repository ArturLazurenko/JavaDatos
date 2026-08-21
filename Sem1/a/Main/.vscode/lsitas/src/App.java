import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        enlase<Object> list = null;
        int tipo = 0; 
        int opcion = 0;
        System.out.println("DEMO LISTAS ENLAZADAS");
        do{
            System.out.println("MENU: ");
            System.out.println("1. Elejir tipo de lista");
            System.out.println("2. Ver los tipos de datos");
            System.out.println("3. Insertar elemento");
            System.out.println("4. Mostrar elementos");
            System.out.println("5. Buscar elemento");
            System.out.println("6. Eliminar elemento");
            System.out.println("7. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de lista:");
                    System.out.println("1. Lista simple");
                    System.out.println("2. Lista doble");
                    System.out.println("3. Lista circular");
                    tipo = sc.nextInt();
                    list = new enlase<>(tipo);
                    System.out.println("lista creada");
                    break;
                case 2:

                    tiposDeDatos.demostrarTipos();
                    break;
                case 3:
                    if (list == null) {
                        System.out.println("Primero debe crear una lista.");
                        break;
                    }
                    System.out.println("Ingrese el elemento a insertar:");
                    System.out.println("1.Enteros");
                    System.out.println("2.Cadenas de texto");
                    System.out.println("3.Alumnos");
                    int opcionTipo = sc.nextInt();
                    if (opcionTipo == 1) {
                        System.out.println("Ingrese un número entero:");
                        int numero = sc.nextInt();
                        list.appendNode(numero);
                        System.out.println("Elemento insertado.");
                        break;
                    } else if (opcionTipo == 2) {
                        System.out.println("Ingrese una cadena de texto:");
                        String texto = sc.next();
                        list.appendNode(texto);
                        System.out.println("Elemento insertado.");
                        break;
                    } else if (opcionTipo == 3) {
                        System.out.println("Ingrese el nombre del alumno:");
                        String nombre = sc.next();
                        System.out.println("Ingrese el teléfono del alumno:");
                        String telefono = sc.next();
                        System.out.println("Ingrese la matrícula del alumno:");
                        String matricula = sc.next();
                        System.out.println("Ingrese el correo del alumno:");
                        String correo = sc.next();
                        Alumnos alumno = new Alumnos(nombre, telefono, matricula, correo);
                        list.appendNode(alumno);
                        System.out.println("Alumno insertado.");
                        break;
                    } else {
                        System.out.println("Opción inválida.");
                        break;

                    } 
                    case 4:
                    if (list == null) {
                        System.out.println("Primero debe crear una lista.");
                        break;
                    }else{
                        list.showList();
                    }
                    case 5:
                    if (list == null) {
                        System.out.println("Primero debe crear una lista.");
                        break;
                    }else{
                        System.out.println("Ingrese el elemento a buscar:");
                        String elementoABuscar = sc.next();
                        boolean encontrado = list.search(elementoABuscar);
                        if (encontrado) {
                            System.out.println("Elemento encontrado.");
                        } else {
                            System.out.println("Elemento no encontrado.");
                        }
                    }
                    break;
                    case 6:
                    if (list == null) {
                        System.out.println("Primero debe crear una lista.");
                        break;
                    }else{
                        System.out.println("Ingrese el elemento a eliminar:");
                        String elementoAEliminar = sc.next();
                        list.delete(elementoAEliminar);
                        System.out.println("Elemento eliminado.");
                        break;
                    }
                    case 7:
                        System.out.println("Saliendo del programa...");

                default:
                    break;
            }
        }while(opcion != 7);
        sc.close();
    }
}
