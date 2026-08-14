
public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;
    public int tipoLista;
    public int size;

    public LinkedList(int tipoLista) {
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

    public void showList(){
        if (isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("La lista: ");
        Node<T> actual = head;
        int i = 0;
        do {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
            if (tipoLista == 3 && actual == head) {
                break;
            }
        } while (actual != null);
        if (tipoLista == 3) {
            System.out.println("Fin del bucle");
        } else {
            System.out.println("null");
        }
    }
    public boolean search(T data) {
        if (isEmpty()) return false;
        
        Node<T> actual = head;
        do {
            if (actual.data.equals(data)) {
                return true;
            }
            actual = actual.next;
            if (tipoLista == 3 && actual == head) {
                break;
            }
        } while (actual != null);
        return false;
    }
    public void delete(T data){
        if (isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Node<T> actual = head;
        Node<T> anterior = null;
        boolean encontrado = false;
        do {
            if (actual.data.equals(data)) {
                encontrado = true;
                break;
            }
            anterior = actual;
            actual = actual.next;
            if (tipoLista == 3 && actual == head) break;
        } while (actual != null);
        if (!encontrado) {
            System.out.println("No se encontró el elemento.");
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else if (actual == head) {
            head = head.next;
            if (tipoLista == 2) head.prev = null;
            if (tipoLista == 3) head.prev = tail;
        } else if (actual == tail) {
            tail = anterior;
            if (tipoLista == 2) tail.next = null;
            if (tipoLista == 3) tail.next = head;
        } else {
            anterior.next = actual.next;
            if (tipoLista == 2 && actual.next != null) {
                actual.next.prev = anterior;
            }
        }
        size--;
        System.out.println("Elemento eliminado.");
    }


}

