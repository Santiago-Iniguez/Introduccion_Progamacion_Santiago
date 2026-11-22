import java.util.Scanner;
public class Ejercicio_06_Precio_final_con_descuento_e_IVA {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declarar variables decimales
        double precioArticulo, precioFinal;
        double precioConDescuento, valorDescuento, valorIVA;
        double IVA, Descuento;
        // Ingresar el precio del articulo
        System.out.println("Ingrese precio del articulo:");
        precioArticulo = sc.nextDouble();
        // Definir porcentaje de descuento e IVA
        Descuento = 0.20;
        IVA = 0.15;
        // Calcular el valor del descuento
        valorDescuento = precioArticulo * Descuento;
        // Calcular el precio con descuento
        precioConDescuento = precioArticulo - valorDescuento;
        // Calcular el IVA sobre el precio con descuento
        valorIVA = precioConDescuento * IVA;
        // Calcular el precio final incluyendo IVA
        precioFinal = precioConDescuento + valorIVA;
        // Mostrar los resultados
        System.out.println("El precio con descuento es: " + precioConDescuento);
        System.out.println("El precio final es: " + precioFinal);
    }
}
