import java.util.Scanner;

public class Ejercicio_52_Punto_medio_y_distancia_entre_dos_puntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar coordenadas
        System.out.println("Ingrese x1:");
        double x1 = sc.nextDouble();

        System.out.println("Ingrese y1:");
        double y1 = sc.nextDouble();

        System.out.println("Ingrese x2:");
        double x2 = sc.nextDouble();

        System.out.println("Ingrese y2:");
        double y2 = sc.nextDouble();

        // Calcular distancia
        double distancia = Math.sqrt(
            Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        // Calcular punto medio
        double xm = (x1 + x2) / 2;
        double ym = (y1 + y2) / 2;

        // Mostrar resultados
        System.out.println("Distancia entre los puntos: " + distancia);
        System.out.println("Punto medio: (" + xm + ", " + ym + ")");

    }
}