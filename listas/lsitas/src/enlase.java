public class enlase<T> {
    public Node<T> head;
    public Node<T> tail;
    public int tipoLista;
    public int size;

    public enlase(int tipoLista) {
        this.tipoLista = tipoLista;
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public boolean isEmpty() {
        return head == null;
    }
    public void appendNode(T data){
        Node<T> nuevo = new Node<T>(data);
        if (isEmpty()) {
            head = nuevo;
            tail = nuevo;
            if (tipoLista == 3) {
                head.next = head;
            }
        }else {
            
            if (tipoLista == 1) {
                Node<T> actual = head;
                while (actual.next != null) {
                    actual = actual.next;
                }
                actual.next = nuevo;
                tail = nuevo;

            } else if (tipoLista == 2) {
                tail.next = nuevo;
                nuevo.prev = tail;
                tail = nuevo;
            } else if (tipoLista == 3) {
                tail.next = nuevo;
                nuevo.next = head;
                tail = nuevo;
                
            }
                
        }
        size++;
    }
}


