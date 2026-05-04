import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> listaCompra = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String opcion = "";

        //Menu de opciones
        while (!opcion.equalsIgnoreCase("e")) {
        System.out.println("LISTA DE LA COMPRA");
            System.out.println("a. Añadir producto");
            System.out.println("b. Eliminar producto");
            System.out.println("c. Mostrar lista");
            System.out.println("d. Comprobar producto");
            System.out.println("e. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.next().toLowerCase(); //Para introducir la opcion
            sc.nextLine();//Limpia buffer del scanner
            switch (opcion) {
                case "a": //Para introducir productos
                    System.out.print("Nombre del producto a añadir: ");
                    String nuevo = sc.nextLine();
                    listaCompra.add(nuevo);
                    break;
                case "b": //Para eliminar productos
                    System.out.print("Nombre del producto a eliminar: ");
                    String borrar = sc.nextLine();
                    if (listaCompra.remove(borrar)) {
                        System.out.println("El producto " + borrar + " ha sido eliminado.");
                    } else {
                        System.out.println("El producto no se encontro en la lista.");
                    }
                    break;
                case "c": //Para ver la lista de la compra
                    if (listaCompra.isEmpty()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        for (int i = 0; i < listaCompra.size(); i++) {
                        System.out.println((i + 1) + " " + listaCompra.get(i));
                        }
                        }
                    break;
                case "d": //Para comprobar si el producto esta en la lista
                    System.out.print("Nombre del producto a comprobar: ");
                    String comprobar = sc.nextLine();
                    if (listaCompra.contains(comprobar)){
                        System.out.println(comprobar +" Esta en la lista");
                        System.out.println("Posicion: " + listaCompra.indexOf(comprobar));
                    } else {
                        System.out.println(comprobar + "No esta en la lista");
                    }
                    break;
                case "e": //Salir del programa
                    System.out.println("¿Hasta luego!");
                    break;
                default: //Si se introduce una opcion que no esta
                    System.out.println("Opcion no valida"); 
            }
        }
}
}