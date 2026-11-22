import java.util.Scanner;
public class Ejercicio_20_Promedio_de_N_notas {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        int N, i;
        double nota, suma, promedio;
        // Inicializar variables
        suma = 0;
        i = 1;
        // Ingresar cantidad de notas
        System.out.println("Ingrese la cantidad de notas:");
        N = sc.nextInt();
        // Validar que la cantidad sea mayor que cero
        if (N > 0) {
            // Repetir mientras i sea menor o igual a N
            while (i <= N) {
                // Ingresar la nota
                System.out.println("Ingrese la nota " + i + ":");
                nota = sc.nextDouble();
                // Acumular las notas
                suma = suma + nota;
                // Incrementar el contador
                i = i + 1;
            }
            // Calcular el promedio
            promedio = suma / N;
            // Mostrar los resultados
            System.out.println("La suma de las notas es: " + suma);
            System.out.println("El promedio es: " + promedio);
        } else {
            // Mostrar mensaje de error
            System.out.println("La cantidad de notas debe ser mayor que cero");
        }
    }
}
