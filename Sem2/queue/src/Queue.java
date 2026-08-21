public class Queue {
    public Node<String> front;
    public Node<String> back;
    public int size;

    public Queue(){
        this.front = null;
        this.back = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return front == null;
    }

    public void inQueue(String nombre){
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
            System.out.println("esta vacio");
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
        System.out.println("inicio ===");
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("se acavoids");


    }
}
