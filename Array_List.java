import java.util.ArrayList;
import java.util.Scanner;

    public class Array_List {
    public static void main(String[] args) {
        ArrayList <String> peliculas = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce 5 peliculas: ");

    for (int i = 0; i < 5; i++) {
        System.out.print ("Pelicula " + (i+1) + ": ");
        String pelicula = scanner.nextLine();
         peliculas.add(pelicula);
    }
    System.out.println("Lista de peliculas: ");
    for (String pelicula : peliculas) {
        System.out.println(pelicula);
    }
}
    }

