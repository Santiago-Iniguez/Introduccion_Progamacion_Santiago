import java.util.Scanner;

public class Ejercicio_50_Maximo_comun_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos
        System.out.println("Ingrese el primer número positivo:");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo número positivo:");
        int b = sc.nextInt();

        // Validar números
        if (a > 0 && b > 0) {
            // Calcular MCD
            while (b != 0) {
                int residuo = a % b;
                a = b;
                b = residuo;
            }

            // Mostrar resultado
            System.out.println("El MCD es: " + a);
        } else {
            System.out.println("Los números deben ser positivos");
        }

    }
}