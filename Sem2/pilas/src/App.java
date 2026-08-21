public class App {
    public static void main(String[] args) throws Exception {
        byStaXx pila = new byStaXx();
        pila.push(10);
        pila.push(20);
        pila.push(30);

        pila.show();
        System.out.println("Elemento en la cima: " + pila.peek());
        System.out.println("Elemento eliminado: " + pila.pop());
        System.out.println("Elemento en la cima: " + pila.peek());
        pila.show();

        String caso1 = "(a+b)*(c-d)";
        String caso2 = "((a+b)*(c-d)";
        String caso3 = "(a+b*(c-d)";

        System.out.println("---validador------");
        System.out.println("Caso 1: " + caso1 + " -> " + validadorParentesis.validar(caso1));
        System.out.println("Caso 2: " + caso2 + " -> " + validadorParentesis.validar(caso2));
        System.out.println("Caso 3: " + caso3 + " -> " + validadorParentesis.validar(caso3));
    }
}
