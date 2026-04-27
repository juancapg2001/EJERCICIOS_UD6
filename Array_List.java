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

    /*  ArrayList<String> listaCompra = new ArrayList<>();
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
        } */

        /*ArrayList <String> paises = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce 6 paises: ");

        for (int i = 0; i < 6; i++) {
        System.out.print ("Pais " + (i+1) + ": ");
        String pais = scanner.nextLine();
         paises.add(pais);
        }
        paises.remove(0);
        paises.remove(paises.size() - 1);
        System.out.println("Lista de paises: " + paises);*/

        /* Scanner scanner = new Scanner(System.in);
        ArrayList<String> jugadores = new ArrayList<>();
        System.out.print("¿Cuántos jugadores quieres introducir?: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner


        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del jugador " + (i + 1) + ": ");
            jugadores.add(scanner.nextLine());
        }

        // 3. Ordenar alfabéticamente
        Collections.sort(jugadores);
        System.out.println("Lista Ordenada Alfabéticamente: ");
        System.out.println(jugadores);

        // 4. Barajar aleatoriamente
        Collections.shuffle(jugadores);
        System.out.println("Lista Barajada (Orden Aleatorio): ");
        System.out.println(jugadores);*/

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();
        String entrada;

        System.out.println("Introduce palabras (escribe 'fin' para terminar):");

        // 1. Lectura de datos
        while (true) {
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) break;
            palabras.add(entrada);
        }

        if (palabras.isEmpty()) {
            System.out.println("No se introdujeron palabras.");
        } else {
            int largas = 0;
            int cortas = 0;

            // 2. Conteo de longitud
            for (String p : palabras) {
                if (p.length() > 5) largas++;
                else cortas++;
            }

            // 3. Palabra central
            // En listas pares, esto devuelve la primera de las dos centrales
            String central = palabras.get(palabras.size() / 2);

            System.out.println("Palabras con más de 5 letras: " + largas);
            System.out.println("Palabras con 5 letras o menos: " + cortas);
            System.out.println("La palabra central es: " + central);
        }
    }
    }

