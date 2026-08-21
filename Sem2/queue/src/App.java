public class App {
    public static void main(String[] args) throws Exception {
        Queue fila = new Queue();

        fila.inQueue("checo");
        fila.inQueue("marvin");
        fila.inQueue("ishowspeed");

        fila.mostrarFila();

        fila.deQueue();

        fila.mostrarFila();
    }
}
