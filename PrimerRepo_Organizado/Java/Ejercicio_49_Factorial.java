import java.util.Scanner;

public class Ejercicio_49_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar número
        System.out.println("Ingrese un número:");
        int n = sc.nextInt();

        // Validar número
        if (n >= 0 && n <= 20) {
            // Inicializar factorial
            long factorial = 1;

            // Calcular factorial
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }

            // Mostrar resultado
            System.out.println("Factorial de " + n + ": " + factorial);
        } else {
            System.out.println("Ingrese un número entre 0 y 20");
        }

        sc.close();
    }
}