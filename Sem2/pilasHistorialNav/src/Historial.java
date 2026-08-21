public class Historial {
    public Node<String> top;
    public int size;

    public Historial() {
        this.top = null;
        this.size = 0;
    }

    public void visitar(String url) {
        Node<String> newNode = new Node<>(url);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String retroceder() {
        if (top == null) {
            return null;
        }
        String url = top.data;
        top = top.next;
        size--;
        return url;
    }
    public String borrarUltima() {
        if (isEmpty()) {
            System.out.println("nada xdxdxdxdxdxdxd");
            return null;
        }
        String url = top.data;
        top = top.next;
        size--;
        System.out.println("Se ha borrado la última página visitada: " + url);
        return url;
    }
    public String verUltima() {
        if (isEmpty()) return "nada xdxxdxdxdxdx";
        return top.data;
    }

    public void mostrarHistorial() {
        if (isEmpty()) {
            System.out.println("nada xdxdxdxdxdxdxd");
            return;
        }
        Node<String> nodoActual = top;
        while (nodoActual != null) {
            System.out.print(nodoActual.data + "->");
            nodoActual = nodoActual.next;

        }
        System.out.println("fondo de virgini");
    }

}
