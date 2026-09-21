public class App {
    public static void main(String[] args) throws Exception {
        PriorityQueue<String> urgencias = new PriorityQueue<>();
        System.out.println("llegada de pacientes");
        urgencias.enQueue("esguince",3);
        urgencias.enQueue("fractura expuesta",2);
        urgencias.enQueue("infarto como el kun xdxdxd",1);

        System.out.println("Lista pacientes:");
        urgencias.mostrar();

        urgencias.enQueue("Fiebre",4);
        System.out.println("Lista pacientes:");
        urgencias.mostrar();

        urgencias.dequeue();

    }
}
