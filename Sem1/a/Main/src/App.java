public class App {
    public static void main(String[] args) throws Exception {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);

        n1.next = n2;
        n2.next = n3;

        Node<Integer> actual = n1;
        while (actual != null) {
            System.out.println(actual.data);
            actual = actual.next;
        }

    }


}
