import java.util.Arrays;

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
        public static void main(String[] args) {
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
        }
    }

    