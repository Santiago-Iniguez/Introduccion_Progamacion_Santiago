import java.util.Scanner;

public class Ejercicio_46_Calculo_de_energia_electrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos
        System.out.println("Ingrese la potencia en watts:");
        double potencia = sc.nextDouble();

        System.out.println("Ingrese las horas de uso diario:");
        double horas = sc.nextDouble();

        System.out.println("Ingrese la tarifa por kWh:");
        double tarifa = sc.nextDouble();

        // Calcular consumo mensual
        double consumo = (potencia / 1000) * horas * 30;

        // Calcular costo mensual
        double costo = consumo * tarifa;

        // Mostrar resultados
        System.out.println("Consumo mensual en kWh: " + consumo);
        System.out.println("Costo mensual: $" + costo);

    }
}