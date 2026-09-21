public class AlgoritmosBusqueda {
    public static int buscarLineal(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;    
            }
        }
        return -1;
    }
    public static int buscarBinaria(int[] arr, int target, int izquierda, int derecha) {
            while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arr[medio] == target) {
                return medio;    
            } else if (arr[medio] < target) {
                izquierda = medio + 1;    
            } else {
                derecha = medio - 1;    
            }
        }
        return -1;
    }
}
