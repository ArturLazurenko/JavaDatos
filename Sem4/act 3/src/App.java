public class App {
    public class Fibbonacci {
    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println(calcularFibonacci(10));
    }
    }
}
