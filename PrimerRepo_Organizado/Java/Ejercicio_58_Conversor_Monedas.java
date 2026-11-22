import java.util.Scanner;

public class Ejercicio_58_Conversor_Monedas {
    public static void main(String[] args) {

        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Código (1=EUR, 2=GBP, 3=JPY, 4=MXN): ");
        int codigo = sc.nextInt();

        System.out.print("Monto en USD: ");
        double monto = sc.nextDouble();

        // Validar datos
        if (codigo < 1 || codigo > 4 || monto < 0) {
            System.out.println("Datos inválidos");
        } else {

            // Declaración de variables
            double tasa = 0;
            double comision = 0;

            // Asignar tasa y comisión según la moneda
            switch (codigo) {
                case 1:
                    tasa = 0.92;
                    comision = 0.01;
                    break;

                case 2:
                    tasa = 0.78;
                    comision = 0.01;
                    break;

                case 3:
                    tasa = 149;
                    comision = 0.015;
                    break;

                case 4:
                    tasa = 17.2;
                    comision = 0.02;
                    break;
            }

            // Calcular resultado con comisión
            double resultado = monto * tasa * (1 - comision);

            // Mostrar resultados
            System.out.println("Resultado: " + resultado);
            System.out.println("Comisión: $" + (monto * comision));
        }
    }
}