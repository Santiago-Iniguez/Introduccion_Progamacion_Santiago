import java.util.Scanner;

public class Ejercicio_33_Ahorro_con_aportes_variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar cantidad de meses
        System.out.println("Ingrese la cantidad de meses:");
        int N = sc.nextInt();

        // Validar meses
        if (N > 0) {
            // Inicializar variables
            double saldo = 0;
            int mes = 1;

            // Calcular ahorro mensual
            while (mes <= N) {
                System.out.println("Ingrese el aporte del mes " + mes + ":");
                double aporte = sc.nextDouble();

                // Acumular aporte y aplicar interés
                saldo = saldo + aporte;
                saldo = saldo * 1.008;

                mes = mes + 1;
            }

            // Mostrar resultado
            System.out.println("El saldo final es: $" + saldo);
        } else {
            System.out.println("La cantidad de meses debe ser mayor que cero");
        }

        sc.close();
    }
}