import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int [] a = new int [10];
        int elemento, posicion;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <a.length-1; i++){
            System.out.println("Ingrese el número");
            a[i] = sc.nextInt();

        }
        System.out.println();

        System.out.println("Nuevo elemento");
        elemento = sc.nextInt();

        System.out.println("Posición donde agregar (de 0 a 9)");
        posicion = sc.nextInt();

        for(int i = a.length-2; i >= posicion; i--){
            a[i+1] = a[i];
        }

        a[posicion] = elemento;

        System.out.println("El arreglo:");
        for(int i = 0; i< a.length; i ++){
            System.out.println(a[i]);
        }
    }
}
