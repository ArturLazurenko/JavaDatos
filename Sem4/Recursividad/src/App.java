public class App {

    public static void cuentaRegresiva(int n) {
        if (n == 0) {
            System.out.println("Cuente regresiva terminada");
            return;
        } else {
            System.out.println(n);
            cuentaRegresiva(n - 1);
        }
    }

    public static int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    public static int sumar(int[] arreglo, int indice){
        if (indice == arreglo.length) {
            return 0;
        } else {
            return arreglo[indice] + sumar(arreglo, indice + 1);
        }

    }

    public static int caclularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * caclularPotencia(base, exponente - 1);
        }
    }

public static String invertirPalabra(String palabra) {
        if (palabra.isEmpty()) {
            return palabra;
        } else {
            return invertirPalabra(palabra.substring(1)) + palabra.charAt(0);
        }
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void imprimirLista(Node actual) {
        if (actual == null) {
            return;
        } else {
            System.out.print(actual.data + " ");
            imprimirLista(actual.next);
        }
    }

    public static void imprimirListaInversa(Node actual) {
        if (actual == null) {
            return;
        } else {
            imprimirListaInversa(actual.next);
            System.out.print(actual.data + " ");
        }
    }

    public static int busquedaBinaria(int[] arreglo, int izquierda, int derecha, int objetivo) {
        if (izquierda > derecha) {
            return -1;
        }

        int medio = izquierda + (derecha - izquierda) / 2;

        if (arreglo[medio] == objetivo) {
            return medio;
        } else if (arreglo[medio] > objetivo) {
            return busquedaBinaria(arreglo, izquierda, medio - 1, objetivo);
        } else {
            return busquedaBinaria(arreglo, medio + 1, derecha, objetivo);
        }
    }

    public static void main(String[] args) throws Exception {

        cuentaRegresiva(5);

        System.out.println(calcularFactorial(7));

        int[] arreglo = {1, 2, 3, 4, 5};
        System.out.println(sumar(arreglo, 0));

        System.out.println(caclularPotencia(2, 3));

        System.out.println(invertirPalabra("hola"));

        Node head = new Node(6);
        head.next = new Node(7);



        imprimirLista(head);
        imprimirListaInversa(head);

        int[] arregloBusqueda = {1, 2, 3, 4, 5};
        int objetivo = 3;
        int resultado = busquedaBinaria(arregloBusqueda, 0, arregloBusqueda.length - 1, objetivo);
        if (resultado == -1) {
            System.out.println("Elemento no encontrado");
        } else {
            System.out.println("Elemento encontrado en el índice: " + resultado);
        }
    }
}
