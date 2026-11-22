import java.util.Scanner;

public class Ejercicio_24_Conversion_de_coordenadas_polares_a_cartesianas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos
        System.out.print("Ingrese el radio: ");
        double radio = sc.nextDouble();

        System.out.print("Ingrese el ángulo en grados: ");
        double angulo = sc.nextDouble();

        // Convertir grados a radianes
        double radianes = Math.toRadians(angulo);

        // Calcular coordenadas cartesianas
        double x = radio * Math.cos(radianes);
        double y = radio * Math.sin(radianes);

        // Mostrar resultados
        System.out.println("Coordenada X: " + x);
        System.out.println("Coordenada Y: " + y);

    }
}