public class Cola<T> {
    public Node<String> front;
    public Node<String> back;
    public int size;

    public Cola(){
        this.front = null;
        this.back = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return front == null;
    }

    public void enQueue(String nombre){
        Node<String> nuevoNodo = new Node<String>(nombre);
        if (isEmpty()){
            front = nuevoNodo;
            back = nuevoNodo;
        }else{
            back.next = nuevoNodo;
            back = nuevoNodo;
        }
        size++;
    }
    public String deQueue(){
        if (isEmpty()){
            System.out.println("La fila esta vacia");
            return null;
        }
        String data = front.data;
        front = front.next;
        size--;
        if (isEmpty()){
            back = null;
        }
        return data;
    }
    public String peek(){
        if (isEmpty()){
            return "nada";
        }
        return front.data;
    }

    public void mostrarFila(){
        if (isEmpty()){
            System.out.println("nada");
            return;
        }
        Node<String> actual = front;
        System.out.println("===Inicio de la fila===");
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("Fin de la fila");


    }
}
