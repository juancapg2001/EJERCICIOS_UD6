import java.util.ArrayList;
import java.util.Scanner;

    public class Array_List {
    public static void main(String[] args) {
    /*  ArrayList <String> peliculas = new ArrayList<>();
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
    }*/

    /*  ArrayList <Integer> valores = new ArrayList<>();

        for (int i = 0; i < 25; i++){
            valores.add (1 + (int)(Math.random() * 10));
        }

        System.out.println("Antes: " + valores);

        Iterator<Integer> it = valores.iterator();
        while (it.hasNext()) {
            if (it.next() < 5){
                it.remove();
        }
    }
        System.out.println("Despues: " + valores); */

        ArrayList<String> listaCompra = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
        System.out.println("LISTA DE LA COMPRA");
            System.out.println("1. Añadir producto");
            System.out.println("2. Eliminar producto (por nombre)");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto a añadir: ");
                    String nuevo = sc.nextLine();
                    listaCompra.add(nuevo);
                    break;

                case 2:
                    System.out.print("Nombre del producto a eliminar: ");
                    String borrar = sc.nextLine();
                    if (listaCompra.remove(borrar)) {
                        System.out.println("'" + borrar + "' ha sido eliminado.");
                    } else {
                        System.out.println("El producto no se encontró en la lista.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            if (opcion != 3) {
                System.out.println("Lista actual: " + listaCompra);
            }

        }
    }
}
