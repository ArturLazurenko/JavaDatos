public class App {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void mezclar(int[] arreglo, int izquierda, int medio, int derecha){
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int [] izqArr = new int[n1];
        int [] DerArr = new int[n2];

        for(int j = 0 ; j < n1 ; j++) izqArr[j] = arreglo[izquierda + j];
        for(int j = 0 ; j < n2; j++) DerArr[j] = arreglo[medio + 1 + j];

        int i = 0, j = 0, k = izquierda;
        while (i < n1 && j < n2){
            if(izqArr[i] <= DerArr[j]){
                arreglo[k++] = izqArr[i++];
            } else{
                arreglo[k++] = DerArr[j++];
            }
        }

        while (i < n1) arreglo[k++] = izqArr[i++];
        while (j < n2) arreglo[k++] = DerArr[j++];

    }

    public static void mergeSort(int[] arreglo, int izquierda, int derecha){
        int medio = izquierda + (derecha - izquierda) / 2;
        mergeSort(arreglo, izquierda, medio);
        mergeSort(arreglo, medio + 1, derecha);
        mezclar(arreglo, izquierda, medio, derecha);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) throws Exception {
        int[] numeros = {67, 34, 25, 12, 69, 11, 90};
        
        System.out.println("Array original:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        bubbleSort(numeros);
        System.out.println("\nArray ordenado:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        //mergeSort(numeros, 0, numeros.length - 1);
        //System.out.println("\nArray ordenado:");
        //for (int num : numeros) {
        //    System.out.print(num + " "); 
        //}

        insertionSort(numeros);
        System.out.println("\nArray ordenado:");
        for (int num : numeros) {
            System.out.print(num + " "); 
        }


    }

}

