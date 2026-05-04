import java.util.Scanner;

public class ejercicio4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de jugadores de 3 a 8: ");  //Introduccion de numero de jugadores
        int numeroJugadores = sc.nextInt();
        sc.nextLine(); //Limpiar buffer

        String[] nombres = new String[numeroJugadores];
        int[] puntuaciones = new int[numeroJugadores];

        for (int i = 0; i < numeroJugadores; i++) {
            System.out.print("Jugador " + (i + 1) + " Nombre: ");
            nombres[i] = sc.nextLine();
            System.out.print("Jugador " + (i + 1) + " Puntuacion: ");
            puntuaciones[i] = sc.nextInt();
            sc.nextLine();
        }
        //Encontrar maximo y minimo de las puntuaciones
        int max = puntuaciones[0];
        int min = puntuaciones[0];
        String nombreMaximo = nombres[0];
        String nombreMinimo = nombres[0];
        for (int i = 1; i < numeroJugadores; i++) {
            if (puntuaciones[i] > max) {
                max = puntuaciones[i];
                nombreMaximo = nombres[i];
            }
            if (puntuaciones[i] < min) {
                min = puntuaciones[i];
                nombreMinimo = nombres[i];
            }
        }
        //Imprime los resultados
        System.out.println("Puntuacion mas alta y la mas baja");
        System.out.println("Más alta: " + max + " " + nombreMaximo);
        System.out.println("Más baja: " + min + " " + nombreMinimo);
    }
}

