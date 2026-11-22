import java.util.Scanner;
public class Ejercicio_07_Gasto_semanal_de_transporte {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        int viajesDia, diasSemana;
        double pasaje, gastoTotal;
        // Ingresar la cantidad de viajes por dia
        System.out.println("Ingrese viajes por dia:");
        viajesDia = sc.nextInt();
        // Ingresar los dias que viaja
        System.out.println("Ingrese cuantos dias viaja:");
        diasSemana = sc.nextInt();
        // Ingresar el costo del pasaje
        System.out.println("Ingrese costo del pasaje:");
        pasaje = sc.nextDouble();
        // Calcular el gasto total de transporte
        gastoTotal = viajesDia * diasSemana * pasaje;
        // Mostrar el resultado
        System.out.println("El gasto total es: " + gastoTotal);
    }
}
