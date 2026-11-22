import java.util.Scanner;

public class Ejercicio_34_Contar_y_sumar_multiplos_de_3_y_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar número
        System.out.println("Ingrese el valor de N:");
        int N = sc.nextInt();

        // Validar número
        if (N > 0) {
            // Inicializar variables
            int i = 1;
            int cantidad = 0;
            int suma = 0;

            // Buscar múltiplos de 3 y 5
            while (i <= N) {
                if (i % 3 == 0 || i % 5 == 0) {
                    cantidad = cantidad + 1;
                    suma = suma + i;
                }
                i = i + 1;
            }

            // Mostrar resultados
            System.out.println("Cantidad de múltiplos: " + cantidad);
            System.out.println("Suma de los múltiplos: " + suma);
        } else {
            System.out.println("N debe ser mayor que cero");
        }

    }
}