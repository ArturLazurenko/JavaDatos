public class App {

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

    public static void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void postOrder(Node node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) throws Exception {
        Node raiz = new Node(1);
        raiz.left = new Node(2);
        raiz.right = new Node(3);
        raiz.left.left = new Node(4);
        raiz.right.right = new Node(5);
        raiz.left.right = new Node(6);
        raiz.right.left = new Node(7);

        System.out.println("Recorrido en preorden:");
        preOrder(raiz);
        System.out.println();
        System.out.println("Recorrido en inorden:");
        inOrder(raiz);
        System.out.println();
        System.out.println("Recorrido en postorden:");
        postOrder(raiz);
        System.out.println();
    }
}
