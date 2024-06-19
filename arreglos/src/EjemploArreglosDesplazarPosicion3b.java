import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3b {
    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion, ultimo;

        Scanner sc = new Scanner(System.in);

        // Llenado del arreglo 'a' con números ingresados por el usuario
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un número: ");
            a[i] = sc.nextInt();
        }

        System.out.println();

        // Ingreso del número que se quiere insertar en el arreglo
        System.out.println("Ingrese un número a insertar: ");
        numero = sc.nextInt();

        // Guardar el último elemento del arreglo 'a'
        ultimo = a[a.length-1];
        posicion = 0;

        // Determinar la posición donde se debe insertar el nuevo número
        while (posicion < 6 && numero > a[posicion]) {
            posicion++;
        }

        // Desplazar los elementos del arreglo 'a' para hacer espacio para el nuevo número
        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        // Crear un nuevo arreglo 'b' de tamaño 'a.length + 1'
        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);

        // Insertar el nuevo número en la posición correcta en el nuevo arreglo 'b'
        if (numero > ultimo) {
            b[b.length - 1] = numero;
        } else {
            b[b.length - 1] = ultimo;
            b[posicion] = numero;
        }

        // Imprimir el nuevo arreglo 'b'
        System.out.println("El nuevo arreglo ordenado: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]);
        }
    }
}
