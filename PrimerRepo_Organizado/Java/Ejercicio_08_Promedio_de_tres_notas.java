import java.util.Scanner;
public class Ejercicio_08_Promedio_de_tres_notas {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        double calificacion1, calificacion2, calificacion3, promedio;
        // Ingresar la primera calificacion
        System.out.println("Ingrese calificacion1:");
        calificacion1 = sc.nextDouble();
        // Validar que la primera nota este entre 0 y 10
        while (calificacion1 < 0 || calificacion1 > 10) {
            System.out.println("Nota incorrecta, ingrese nuevamente:");
            calificacion1 = sc.nextDouble();
        }
        // Ingresar la segunda calificacion
        System.out.println("Ingrese calificacion2:");
        calificacion2 = sc.nextDouble();
        // Validar que la segunda nota este entre 0 y 10
        while (calificacion2 < 0 || calificacion2 > 10) {
            System.out.println("Nota incorrecta, ingrese nuevamente:");
            calificacion2 = sc.nextDouble();
        }
        // Ingresar la tercera calificacion
        System.out.println("Ingrese calificacion3:");
        calificacion3 = sc.nextDouble();
        // Validar que la tercera nota este entre 0 y 10
        while (calificacion3 < 0 || calificacion3 > 10) {
            System.out.println("Nota incorrecta, ingrese nuevamente:");
            calificacion3 = sc.nextDouble();
        }
        // Calcular el promedio de las tres notas
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        // Mostrar el resultado
        System.out.println("El promedio de las notas es: " + promedio);
    }
}
