import java.util.Scanner;

public class Ejercicio_13_Descuento_segun_monto_de_compra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar monto de compra
        System.out.print("Ingrese el monto de la compra: ");
        double compra = sc.nextDouble();

        // Determinar porcentaje de descuento
        double descuento;

        if (compra >= 200) {
            descuento = 0.15;
        } else if (compra >= 100) {
            descuento = 0.10;
        } else {
            descuento = 0.05;
        }

        // Calcular total a pagar
        double total = compra - (compra * descuento);

        // Mostrar resultados
        System.out.println("El descuento es: " + descuento * 100 + "%");
        System.out.println("El total a pagar es: $" + total);

    }
}