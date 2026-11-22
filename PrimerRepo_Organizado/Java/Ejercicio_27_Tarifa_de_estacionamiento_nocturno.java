
import java.util.Scanner;

public class Ejercicio_27_Tarifa_de_estacionamiento_nocturno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos
        System.out.print("Ingrese las horas de estacionamiento: ");
        double horas = sc.nextDouble();

        System.out.print("¿Es horario nocturno? (S/N): ");
        String nocturno = sc.next().toUpperCase();

        // Validar horas
        if (horas > 0) {
            // Calcular tarifa base
            double tarifa = horas * 1.50;

            // Aplicar recargo por tiempo
            if (horas > 8) {
                tarifa = tarifa * 1.25;
            }

            // Aplicar recargo nocturno
            if (nocturno.equals("S")) {
                tarifa = tarifa * 1.30;
            }

            // Mostrar resultado
            double total = tarifa;
            System.out.printf("Total a pagar: $%.2f%n", total);
        } else {
            System.out.println("Las horas deben ser mayores que cero");
        }

        sc.close();
    }
}
