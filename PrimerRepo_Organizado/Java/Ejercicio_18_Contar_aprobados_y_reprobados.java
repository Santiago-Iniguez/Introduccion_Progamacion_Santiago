import java.util.Scanner;
public class Ejercicio_18_Contar_aprobados_y_reprobados {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        int N, i, aprobados, reprobados;
        double nota;
        // Inicializar contadores
        aprobados = 0;
        reprobados = 0;
        i = 1;
        // Ingresar cantidad de estudiantes
        System.out.println("Ingrese la cantidad de estudiantes:");
        N = sc.nextInt();
        // Repetir mientras i sea menor o igual a N
        while (i <= N) {
            // Ingresar nota del estudiante
            System.out.println("Ingrese la nota del estudiante " + i + ":");
            nota = sc.nextDouble();
            // Verificar si el estudiante aprobo
            if (nota >= 7) {
                aprobados = aprobados + 1;
            }
            // Si no aprobo, contar como reprobado
            else {
                reprobados = reprobados + 1;
            }
            // Incrementar el contador
            i = i + 1;
        }
        // Mostrar los resultados
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);
    }
}
