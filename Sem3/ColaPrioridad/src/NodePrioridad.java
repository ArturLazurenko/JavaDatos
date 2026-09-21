public class NodePrioridad<T> {
    public T data;
    public int prioridad;
    public NodePrioridad<T> next;

    public NodePrioridad(T data, int prioridad) {
        this.data = data;
        this.next = null;
        this.prioridad = prioridad;
    }

    public String toString() {
        return data != null ? data.toString() : "null";
    }
}
