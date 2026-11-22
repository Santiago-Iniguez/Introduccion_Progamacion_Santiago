import java.util.Scanner;

public class Ejercicio_45_Costo_total_de_un_viaje_con_peajes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos
        System.out.println("Ingrese la distancia en km:");
        double distancia = sc.nextDouble();

        System.out.println("Ingrese el rendimiento en km por litro:");
        double consumo = sc.nextDouble();

        System.out.println("Ingrese el precio por litro:");
        double precio = sc.nextDouble();

        System.out.println("Ingrese la cantidad de peajes:");
        int N = sc.nextInt();

        // Validar datos
        if (distancia >= 0 && consumo > 0 && precio >= 0 && N >= 0) {
            double costoPeajes = 0;

            // Sumar costos de peajes
            for (int i = 1; i <= N; i++) {
                System.out.println("Ingrese el costo del peaje " + i + ":");
                double costoPeaje = sc.nextDouble();
                costoPeajes = costoPeajes + costoPeaje;
            }

            // Calcular combustible y total
            double litros = distancia / consumo;
            double costoCombustible = litros * precio;
            double total = costoCombustible + costoPeajes;

            // Mostrar resultados
            System.out.println("Litros necesarios: " + litros);
            System.out.println("Costo de combustible: $" + costoCombustible);
            System.out.println("Costo de peajes: $" + costoPeajes);
            System.out.println("Costo total del viaje: $" + total);
        } else {
            System.out.println("Datos no válidos");
        }

        sc.close();
    }
}