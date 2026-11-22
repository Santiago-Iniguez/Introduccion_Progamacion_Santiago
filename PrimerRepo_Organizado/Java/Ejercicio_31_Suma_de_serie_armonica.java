import java.util.Scanner;

public class Ejercicio_31_Suma_de_serie_armonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos
        System.out.println("Ingrese el valor de N:");
        int N = sc.nextInt();

        // Validar número
        if (N > 0) {
            // Inicializar variables
            double suma = 0;
            int i = 1;

            // Calcular suma de la serie
            while (i <= N) {
                suma = suma + (1.0 / i);
                i = i + 1;
            }

            // Mostrar resultado
            System.out.println("La suma de la serie es: " + suma);
        } else {
            System.out.println("N debe ser mayor que cero");
        }

    }
}