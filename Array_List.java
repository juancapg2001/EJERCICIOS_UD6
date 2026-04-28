import java.util.ArrayList;
import java.util.Collections;
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
        }*/

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una cantidad de numeros para la lista: ");
        int cantidad = sc.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int num = sc.nextInt();
            numeros.add(num);
        }     
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println(numeros);

        if (!numeros.isEmpty()) {
            int mitad = numeros.size() / 2;
            double mediana;

            if (numeros.size() % 2 != 0) {
                mediana = numeros.get(mitad);
            } else {
                mediana = (numeros.get(mitad - 1) + numeros.get(mitad)) / 2.0;
            }
            System.out.println("La mediana es: " + mediana);
        } else {
            System.out.println("La lista está vacía.");
        }
        }
    } 
