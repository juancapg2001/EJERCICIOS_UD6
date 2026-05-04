
    public class ejerciciosT7 {
        public static void resta_x_al_vector(int v[], int x) {
            for (int i = 0; i<v.length; i++)
            v [i] = v[i] - x;
        }
        public static int suma (int a, int b){
            int resultado = a + b;
            a = -1;
            return resultado;
        }
        public static float dividir (int a, int b){
            float resultado = 0;
            try {
                resultado = a / b;
                System.out.println("La ejecucion no llegara aqui");
            } catch (ArithmeticException e) {
            System.out.println("Has intentado dividir entre 0");
            }
            System.out.println("Fin del programa");
            return resultado;
        }
        public static int mayor (int a, int b) {
            if (a>b){
                return a;
            } else {
                return b;
            }
        }
        public static void imprimirLinea(char a, int n){
            for (int i = 0; i < n; i++){
                System.out.print(a);
            if (i < n - 1) {
                System.out.print(", ");
            }
            }
        }

        public static double convertir(int opcion, double temp) {
        if (opcion == 1) {
            return gradosCelsius(temp);
        } else {
            return gradosFahrenheit(temp);
        }
        }

        public static double gradosCelsius(double f) {
            return (f - 32) * 5 / 9;
        }

        public static double gradosFahrenheit(double c) {
            return (c * 9 / 5) + 32;
        }

        public static int dividiendo (int a, int b){
            return a/b;
        }

        public static void main(String[] args) {
            
        }
        /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double temperatura;

        do {
            System.out.println();
            System.out.println(" CONVERTIR TEMPERATURA");
            System.out.println("1. Convertir de Fahrenheit a Celsius");
            System.out.println("2. Convertir de Celsius a Fahrenheit");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
        if (opcion == 1 || opcion == 2) {
            System.out.print("Introduzca la temperatura a convertir: ");
            temperatura = sc.nextDouble();
        double resultado = convertir(opcion, temperatura);
            System.out.print("El resultado de la conversión es: " + resultado);
        } else if (opcion != 3) {
            System.out.println("Opción no válida. Intente de nuevo.");
        }
        } while (opcion != 3);
        System.out.println("El programa ha finalizado."); 
    sc.close();
    }
}*/
        /* public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un caracter: ");
            char c1 = sc.next().charAt(0);
            System.out.print("Introduce un numero para repertir la letra: ");
            int n1 = sc.nextInt();
            System.out.print("Resultado: "); 
            imprimirLinea(c1, n1); 
            System.out.println();
        }*/
        /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres pares de numeros: ");
        for (int i = 1; i <= 3; i++){
            System.out.println("Par de numeros " + i);
            System.out.println("Introduce el primer numero: ");
            int num1 = sc.nextInt();
            System.out.println("Introduce segundo numero: ");
            int num2 = sc.nextInt();
            int resultado = mayor(num1, num2);
            System.out.println("El numero mayor es: " + resultado);
        }
        sc.close();
    }*/
       /*public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int resultado = suma(a, b); //SUMA
        float resultadoDividir = dividir(a, b); //DIVIDIR
        System.out.println("Dividir: " + resultadoDividir);//IMPRIMIR DIVISION
        System.out.println("Suma: " + resultado);//IMPRIMIR SUMA
        System.out.println("A: " + a);//IMPRIMIR A


        int v[] = {0, 1, 2, 3};
            System.out.println("Vector antes: " + Arrays.toString(v));
            resta_x_al_vector(v, 10);
            System.out.println("Vector despues: " + Arrays.toString(v));
        } */
    }

    