public class PriorityQueue<T> {
    public NodePrioridad<T> front;
    public int size;

    public PriorityQueue(){
        this.front = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void enQueue(T data,int prioridad){
        NodePrioridad<T> nuevo = new NodePrioridad<>(data, prioridad);
        if (isEmpty() || prioridad < front.prioridad){
            nuevo.next = front;
            front = nuevo;
        }else {
            NodePrioridad<T> actual = front;
            while (actual.next != null && actual.next.prioridad <= prioridad){
                actual = actual.next;

            }
            nuevo.next = actual.next;
            actual.next = nuevo;
        }

    }
    public T dequeue(){
        if (isEmpty()) {
            System.out.println("No hay nada");
            return null;

        }
        T atendido = front.data;
        front = front.next;
        
        size--;
        return atendido;
    }
    public T peek(){
        if (isEmpty()){
            return null;
        }
        return front.data;
    }

    public void mostrar(){
        if (isEmpty()){
            System.out.println("nada");
            return;
        }
        NodePrioridad<T> actual = front;
        System.out.println("Frente -> ");
    
        while (front != null) {
            System.out.println(actual.data + " con prioridad: " + actual.prioridad);
            actual = actual.next;
        }
        System.out.println("Fin");
    }
}

