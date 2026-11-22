import java.util.Scanner;

public class Ejercicio_21_Valor_futuro_de_una_anualidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos
        System.out.print("Ingrese depósito mensual: ");
        double depositoMensual = sc.nextDouble();

        System.out.print("Ingrese tasa mensual: ");
        double tasaMensual = sc.nextDouble();

        System.out.print("Ingrese número de meses: ");
        int meses = sc.nextInt();

        // Calcular total depositado
        double totalDepositado = depositoMensual * meses;

        // Calcular valor futuro
        double valorFuturo;

        if (tasaMensual == 0) {
            valorFuturo = totalDepositado;
        } else {
            valorFuturo = depositoMensual *
                ((Math.pow(1 + tasaMensual, meses) - 1) / tasaMensual);
        }

        // Mostrar resultados
        System.out.println("El valor total depositado es: " + totalDepositado);
        System.out.println("El valor futuro es: " + valorFuturo);

    }
}
