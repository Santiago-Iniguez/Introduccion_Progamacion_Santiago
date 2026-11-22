
import java.util.Scanner;

public class Ejercicio_26_Clasificacion_de_estudiante_por_rendimiento_y_asistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos
        System.out.print("Ingrese el promedio (0 a 10): ");
        double promedio = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de asistencia: ");
        double asistencia = sc.nextDouble();

        // Validar datos
        if (promedio >= 0 && promedio <= 10 &&
            asistencia >= 0 && asistencia <= 100) {

            // Clasificar estudiante
            String categoria;

            if (promedio >= 9 && asistencia >= 90) {
                categoria = "Excelente";
            } else if (promedio >= 7 && asistencia >= 80) {
                categoria = "Bueno";
            } else if (promedio >= 6 && asistencia >= 70) {
                categoria = "Regular";
            } else {
                categoria = "Deficiente";
            }

            // Mostrar resultado
            System.out.println("Categoría: " + categoria);
        } else {
            System.out.println("Datos fuera del rango permitido");
        }

    }
}