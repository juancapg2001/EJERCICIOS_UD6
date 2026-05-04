import java.util.Scanner;

public class ejercicio3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: "); //Introducimos la frase
        String frase = sc.nextLine();

        System.out.println("Analisis del mensaje");
        System.out.println("Longitud de la frase: " + frase.length()); //Para ver longitud
        System.out.println("Frase en mayusculas: " + frase.trim().toUpperCase()); //Poner la frase en mayusculas
        System.out.println("Frase sin espacios extremos: " + frase.trim()); //Poner frase sin espacios extremos

        System.out.println("Palabras");


        System.out.println("Apariciones de la letra 'a'"); //Ver cuantas veces aparece la letra 'a'
        int contar = 0;
        String fraseMinuscula = frase.toLowerCase();
        for (int i = 0; i < fraseMinuscula.length(); i++) {
            if (fraseMinuscula.charAt(i) == 'a') {
            contar++;
            }
        }
        System.out.println("La letra 'a' aparece " + contar + " veces");
        }
    }