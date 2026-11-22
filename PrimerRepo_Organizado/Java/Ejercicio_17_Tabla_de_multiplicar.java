import java.util.Scanner;
public class Ejercicio_17_Tabla_de_multiplicar {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        int K, i, resultado;
        // Ingresar un numero entero
        System.out.println("Ingrese un numero entero:");
        K = sc.nextInt();
        // Inicializar el contador
        i = 1;
        // Repetir mientras i sea menor o igual a 10
        while (i <= 10) {
            // Calcular la multiplicacion
            resultado = K * i;
            // Mostrar el resultado
            System.out.println(K + " x " + i + " = " + resultado);
            // Incrementar el contador
            i = i + 1;
        }
    }
}
