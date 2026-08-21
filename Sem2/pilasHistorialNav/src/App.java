public class App {
    public static void main(String[] args) throws Exception {
        Historial historial = new Historial();
        historial.visitar("youtube.com");
        historial.visitar("twitch.com");
        historial.visitar("x.com");

        historial.mostrarHistorial();

        System.out.println("mostrando ultima");
        historial.verUltima();

        System.out.println("borrando...");
        historial.borrarUltima();

        historial.mostrarHistorial();
    }
}
