import java.util.Scanner;
public class Ejercicio_36_Cooperativa_y_abono_extraordinario_con_interes_compuesto {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declarar variables decimales
        double montoPrestamo, tasaTrimestral, porcentajeAbono;
        double montoTotal, abonoTotal, abonoExtra;
        // Declarar variable entera
        int numeroTrimestres;
        // Ingresar los datos
        System.out.println("Ingrese el monto del prestamo:");
        montoPrestamo = sc.nextDouble();
        System.out.println("Ingrese la tasa trimestral:");
        tasaTrimestral = sc.nextDouble();
        System.out.println("Ingrese porcentaje abono:");
        porcentajeAbono = sc.nextDouble();
        System.out.println("Ingrese numero de trimestres:");
        numeroTrimestres = sc.nextInt();
        // Calcular monto total con interes compuesto
        montoTotal = montoPrestamo * Math.pow(
            1 + tasaTrimestral / 100, numeroTrimestres
        );
        // Calcular el valor del abono
        abonoExtra = montoTotal * porcentajeAbono / 100;
        // Restar el abono al monto total
        abonoTotal = montoTotal - abonoExtra;
        // Mostrar los resultados
        System.out.println("El monto antes del abono es: " + montoTotal);
        System.out.println("El abono es: " + abonoExtra);
        System.out.println("El monto final es: " + abonoTotal);
    }
}
