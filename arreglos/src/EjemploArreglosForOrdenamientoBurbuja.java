import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {


    public static void arregloInverso(String[] arreglo){

        int total = arreglo.length;
        int total2 = arreglo.length;

        for(int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;

        }
    }


    public static void sortBurbuja(Object[] arreglo){

        int contador = 0;

        int total = arreglo.length;

        for (int i = 0; i < total - 1; i++) {

            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {

        //  String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;

        /*
        int contador = 0;

        for (int i = 0; i < total - 1; i++) {

            for (int j = 0; j < total - 1 - i; j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

*/
        //  Arrays.sort(productos);
        //  arregloInverso(productos);


        //  Collections.reverse(Arrays.asList(productos));


        System.out.println("===Usando bucle for===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        int total2 = productos.length;

        for (int i = 0; i < total2; i++) {
            String actual = productos[i];
            String inverso = productos[total - 1 - i];
            productos[i] = inverso;
            productos[total - 1 - i] = actual;
            total2--;

        }

        sortBurbuja(productos);
        System.out.println("===Usando bucle for===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);

        }
        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (((Comparable) numeros[j+1]).compareTo(numeros[j]) < 0) {
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
              //  contador++;
            }
        }
        for(int i = 0; i < numeros.length; i ++) {
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }
    }