import java.util.Scanner;
public class Ejercicio_12_Aprobado_o_reprobado {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        double promedio;
        // Ingresar el promedio del estudiante
        System.out.println("Ingrese el promedio:");
        promedio = sc.nextDouble();
        // Verificar si el estudiante esta aprobado
        if (promedio >= 7) {
            System.out.println("Estudiante aprobado");
        }
        // Si el promedio es menor a 7, esta reprobado
        else {
            System.out.println("Estudiante reprobado");
        }
    }
}
