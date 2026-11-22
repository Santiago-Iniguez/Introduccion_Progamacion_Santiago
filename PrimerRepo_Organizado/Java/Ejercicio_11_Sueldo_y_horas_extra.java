import java.util.Scanner;
public class Ejercicio_11_Sueldo_y_horas_extra {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        double horas, pagoHora, sueldo = 0;
        // Ingresar las horas trabajadas
        System.out.println("Ingrese horas trabajadas:");
        horas = sc.nextDouble();
        // Ingresar el pago por hora
        System.out.println("Ingrese pago por horas:");
        pagoHora = sc.nextDouble();
        // Calcular sueldo si trabaja 40 horas o menos
        if (horas <= 40) {
            sueldo = horas * pagoHora;
        }
        // Calcular sueldo si trabaja mas de 40 horas
        if (horas > 40) {
            sueldo = (40 * pagoHora) + ((horas - 40) * pagoHora * 2);
        }
        // Mostrar el sueldo semanal
        System.out.println("El sueldo semanal es: " + sueldo);
    }
}
