public class Pila<T> {
    public static class Node<T>{
        public T data;
        public Node<T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    private Node<T> top;
    private int size;

    public Pila(){
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(T data){
        Node<T> nuevo = new Node<T>(data);
        if (isEmpty()) {
            top = nuevo;
        }else {
            nuevo.next = top;
            top = nuevo;
            size++;
        }
    }

    public T pop(){
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }else {
            T data = top.data;
            top = top.next;
            size--;
            return data;
    }
    }
    public T peek(){
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }else {
            return top.data;
        }
    }
    public String show(){
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Node<T> actual = top;
        boolean isTop = true;
        while (actual != null) {
            if (isTop){
                sb.append("<- Cima : ").append(actual.data).append("\n");
                isTop = false;
            }

            else{
                sb.append("        ").append(actual.data).append("\n");
            }
            actual = actual.next;
        }
        

        return sb.toString();
    }
    
}


