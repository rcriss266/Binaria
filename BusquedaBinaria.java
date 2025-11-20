import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static void main(String[] args) {

        // Leer arreglo desde archivo
        int[] arreglo = leerArchivo("Entrada.txt");

        // Dato a buscar desde archivo
        int buscar = leerDato("Buscar.txt");

        int resultado = busquedaBinaria(arreglo, buscar);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }

    

    // Método para leer un arreglo
    
    public static int[] leerArchivo(String nombreArchivo) {
        try {
            Scanner sc = new Scanner(new File(nombreArchivo));
            List<Integer> lista = new ArrayList<>();

            while (sc.hasNextInt()) {
                lista.add(sc.nextInt());
            }
            sc.close();

            int[] arr = new int[lista.size()];
            for (int i = 0; i < lista.size(); i++) {
                arr[i] = lista.get(i);
            }
            return arr;

        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
            return new int[0];
        }
    }

    
    // Leer un solo entero desde archivo
    
    public static int leerDato(String nombreArchivo) {
        try {
            Scanner sc = new Scanner(new File(nombreArchivo));
            int dato = sc.nextInt();
            sc.close();
            return dato;
        } catch (Exception e) {
            System.out.println("Error al leer dato: " + e.getMessage());
            return -1;
        }
    }
}






