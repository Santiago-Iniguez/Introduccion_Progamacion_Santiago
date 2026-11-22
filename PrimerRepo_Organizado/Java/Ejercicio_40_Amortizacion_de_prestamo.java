import java.util.Scanner;

public class Ejercicio_40_Amortizacion_de_prestamo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos
        System.out.println("Ingrese el monto del préstamo:");
        double monto = sc.nextDouble();

        System.out.println("Ingrese la tasa de interés mensual (%):");
        double tasa = sc.nextDouble();

        System.out.println("Ingrese el número de meses:");
        int meses = sc.nextInt();

        // Validar plazo
        if (meses > 0) {
            // Calcular interés simple
            double interes = monto * (tasa / 100) * meses;

            // Calcular cuota mensual
            double cuota = (monto + interes) / meses;

            // Mostrar resultados
            System.out.println("Interés total: $" + interes);
            System.out.println("Cuota mensual: $" + cuota);
        } else {
            System.out.println("Los meses deben ser mayores que cero");
        }

    }
}