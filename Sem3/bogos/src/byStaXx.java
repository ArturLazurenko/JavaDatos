public class byStaXx<T> {
    public Node<T> top;
    public int size;

    public byStaXx(){
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
            System.out.println("Se regitro la venta!!!");
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
            System.out.println("Ultimo registre eliminado!");
            return data;
    }
    }
    public T peek(){
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }else {
            System.out.println("==Ultima venta==");
            return top.data;
        }
    }
    public void show(){
        if (isEmpty()) {
            System.out.println("--No hay ventas--");
            return;
        }
        System.out.println("Ventas: ");
        Node<T> actual = top;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }
}