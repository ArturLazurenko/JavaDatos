public class ArbolBinario {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private Node raiz;

    public ArbolBinario() {
        raiz = null;
    }

    private Node insertarRecursividad(Node actual, int dato){
        if (actual == null) {
            return new Node(dato);
        }

        if (dato < actual.data) {
            actual.left = insertarRecursividad(actual.left, dato);
        } else if (dato > actual.data) {
            actual.right = insertarRecursividad(actual.right, dato);
        }

        return actual;    
    }

    public void preOrderRecursivo(Node node){
            if (node == null) {
                return;
            }
            System.out.print(node.data + " ");
            preOrderRecursivo(node.left);
            preOrderRecursivo(node.right);
        }

        public void mostrarPreOrder() {
            System.out.println("preOrden: ");
            preOrderRecursivo(raiz);
            System.out.println();
        }
    public static void inOrder(Node node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void mostrarInOrder() {
        System.out.println("inOrden: ");
        inOrder(raiz);
        System.out.println();
    }
    public static void postOrder(Node node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void mostrarPostOrder() {
        System.out.println("postOrden: ");
        postOrder(raiz);
        System.out.println();
    }

    public void insertar(int dato) {
        raiz = insertarRecursividad(raiz, dato);
    }
    public static void main(String[] args) throws Exception {
        ArbolBinario arbol = new ArbolBinario();
        int[] datos = {1, 2, 3, 4, 5, 6, 7};
        for (int dato : datos) {
            arbol.insertar(dato);
            System.out.println(dato + " ");
            
        }   

        arbol.mostrarPreOrder();
        arbol.mostrarInOrder();
        arbol.mostrarPostOrder();


        
    }
}
