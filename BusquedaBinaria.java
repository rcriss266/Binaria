public class BusquedaBinaria {

    public static int busquedaBinaria(int[] arr, int dato) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arr[medio] == dato) {
                return medio;
            }
            if (arr[medio] < dato) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }

    // ← ← ← ESTE ES EL MÉTODO QUE TE FALTABA
    public static void main(String[] args) {

        int[] arreglo = {2, 5, 8, 12, 16, 23, 38};
        int buscar = 16;

        int resultado = busquedaBinaria(arreglo, buscar);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}

