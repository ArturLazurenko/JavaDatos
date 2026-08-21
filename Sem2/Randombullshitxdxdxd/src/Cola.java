public class Cola<T> {
    public Node<T> front;
    public Node<T> back;
    public int size;

    public Cola(){
        this.front = null;
        this.back = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return front == null;
    }

    public void inQueue(T nombre){
        Node<T> nuevoNodo = new Node<T>(nombre);
        if (isEmpty()){
            front = nuevoNodo;
            back = nuevoNodo;
        }else{
            back.next = nuevoNodo;
            back = nuevoNodo;
        }
        size++;
    }
    public T deQueue(){
        if (isEmpty()){
            System.out.println("esta vacio");
            return null;
        }
        T data = front.data;
        front = front.next;
        size--;
        if (isEmpty()){
            back = null;
        }
        return data;
    }
    public T peek(){
        if (isEmpty()){
            System.out.println("nada");
            return null;
        }
        return front.data;
    }

    public void mostrarFila(){
        if (isEmpty()){
            System.out.println("nada");
            return;
        }
        Node<T> actual = front;
        System.out.println("inicio ===");
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("se acavoid");
    }
}
