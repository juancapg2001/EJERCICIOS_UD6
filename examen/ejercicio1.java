import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de alumnos de 4 a 12: "); //Introduccion de numero de alumnos
        int n = sc.nextInt();

        if (n < 4 || n > 12) {
            System.out.println("Error: el numero de alumnos debe estar entre 4 y 12.");
            return;
        }
        double[] notas = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) { //Introduccion de las notas
            double nota;
            while (true) {
                System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
                nota = sc.nextDouble();
                if (nota >= 0.0 && nota <= 10.0) {
                    break;
                }
                System.out.println("Error: la nota debe estar entre 0 y 10.");
            }
            notas[i] = nota;
            suma += nota;
        }
        //Calculos de notas
        double media = suma / n;
        double max = notas[0];
        double min = notas[0];
        int aprobados = 0;
        int suspensos = 0;
        //Notas introducidas
        System.out.println("Notas introducidas");
        for (int i = 0; i < n; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
            if (notas[i] > max) max = notas[i];
            if (notas[i] < min) min = notas[i];
            if (notas[i] >= 5.0) aprobados++;
            else suspensos++;
        }
        //Estadisticas
        System.out.println("Estadisticas");
        System.out.println("Nota media: " + media);
        System.out.println("Nota mas alta: " + max);
        System.out.println("Nota mas baja: " + min);
        //Resultados 
        System.out.println("Resultados");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        //Alumnos por encima de la media
        System.out.println("Alumnos por encima de la media " + media);
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
            }
        }
    }
}

