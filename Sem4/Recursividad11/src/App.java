public class App {


    public static void resolverHanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        resolverHanoi(n - 1, origen, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        resolverHanoi(n - 1, auxiliar, destino, origen);
    }
    public static void main(String[] args) throws Exception {

        int numeroDiscos = 3;
        resolverHanoi(numeroDiscos, 'A', 'C', 'B');
        /* 
        
            *
           ***
          *****
         *******
        *********
            ||
            ||
        
        */

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = 0 ; l < 2; l++) {
            for (int m = 0; m < 3; m++) {
                System.out.print(" ");
            }
            System.out.println("| |");
        }


        
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
        System.out.println("   | |");
        System.out.println("   | |");
        
        
    }
}
