import java.util.ArrayList;
import java.util.Scanner;

public class VECTORES_MATRICES {
    public static void main(String[] args) {

    //PROGRAMA QUE LE DAS NUMEROS Y EL TE DA LOS NUMEROS EN UNA LISTA//
    /* ArrayList <Integer> numeros = new ArrayList<>();
    Scanner scanner = new Scanner (System.in);        
    System.out.println("Introduce 10 numeros: ");

    for (int i = 0; i < 10; i++) {
            System.out.print ("Numero: " + (i+1) + ": ");
            Integer numero = scanner.nextInt();
            numeros.add(numero);
        }

    System.out.println("Lista de numeros: " + numeros); */

    //PROGRAMA QUE LE DAS LA LISTA DE NUMEROS Y TE LO SUMA TODOS//
       /* ArrayList <Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        int suma=0;
        System.out.println("Introduce 10 numeros: ");

        for (int i = 0; i < 10; i++) {
            System.out.print ("Numero: " + (i+1) + ": ");
            Integer numero = scanner.nextInt();
            numeros.add(numero);
        }
        for (Integer valor : numeros) {
            suma+=valor;
    }
        System.out.println("Lista de numeros: " + numeros);
        System.out.println("La suma de todos los valores es: " + suma);
    */

    //PROGRAMA QUE TE DA EL MINIMO Y EL MAXIMO DE LA LISTA DE NUMEROS//
    /*  ArrayList <Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce 10 numeros: ");
        int max, min;

        for (int i = 0; i < 10; i++) {
            System.out.print ("Numero: " + (i+1) + ": ");
            Integer numero = scanner.nextInt();
            numeros.add(numero);
        }
        max = numeros.get(0);
        min = numeros.get(0);

        for (int i = 1; i < 10; i++) {
            if (numeros.get(i) > max) {
                max = numeros.get(i);
            }
            if (numeros.get(i) < min){
                min = numeros.get(i);
            }
        }
        System.out.println("Numero maximo: " + max);
        System.out.println("Numero minimo: " + min);*/

    //PROGRAMA QUE TE PIDE 20 NUMEROS Y TE SUMA SI HAY POSITIVO Y SI HAY NEGATIVOS
    /*  ArrayList <Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        int sumapositivos=0;
        int sumanegativos=0;
        System.out.println("Introduce 20 numeros: ");

        for (int i = 0; i < 20; i++) {
            System.out.print ("Numero: " + (i+1) + ": ");
            Integer numero = scanner.nextInt();
            numeros.add(numero);
        }
        for (int i = 0; i < 20; i++) {
            if (numeros.get(i) > 0) {
                sumapositivos += numeros.get(i);
            } else if (numeros.get(i) < 0) {
                sumanegativos += numeros.get(i);
            }
        }
        System.out.println("Suma de los numeros positivos: " + sumapositivos);
        System.out.println("Suma de los numeros negativos: " + sumanegativos);*/

        ArrayList <Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce 20 numeros: ");
        int suma_valores=0;

        for (int i = 0; i < 20; i++) {
            System.out.print ("Numero: " + (i+1) + ": ");
            Integer numero = scanner.nextInt();
            numeros.add(numero);
            suma_valores+=numero;
        }

        double media = (double) suma_valores / 20;
        System.out.println("Lista de numeros: " + numeros);
        System.out.println("Media: " + media);
   }
} 