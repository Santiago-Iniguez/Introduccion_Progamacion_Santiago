import java.util.Scanner;

public class Ejercicio_62_Tarifa_Transporte {
    public static void main(String[] args) {

        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        System.out.print("¿Es estudiante? (S/N): ");
        String estudiante = sc.next().toUpperCase();

        System.out.print("¿Es horario pico? (S/N): ");
        String horarioPico = sc.next().toUpperCase();

        System.out.print("Ingrese la tarifa base: ");
        double tarifaBase = sc.nextDouble();

        // Validar datos
        if (edad < 0 || tarifaBase < 0) {
            System.out.println("Datos inválidos");
        } else {

            // Inicializar tarifa
            double tarifaFinal = tarifaBase;

            // Aplicar gratuidad por edad
            if (edad < 5 || edad >= 65) {
                tarifaFinal = 0;

            // Aplicar descuento estudiantil
            } else if (estudiante.equals("S") && horarioPico.equals("N")) {
                tarifaFinal = tarifaBase * 0.80;
            }

            // Mostrar resultado
            System.out.println("Tarifa final: $" + tarifaFinal);
        }
    }
}