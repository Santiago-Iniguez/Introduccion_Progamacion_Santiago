import java.util.Scanner;
public class Ejercicio_09_Dolares_a_pesos_mexicanos {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        double dolares, cambioMoneda, cambioFinal;
        // Definir el tipo de cambio
        cambioMoneda = 18.43;
        // Ingresar la cantidad de dolares
        System.out.println("Ingrese cantidad de dolares:");
        dolares = sc.nextDouble();
        // Calcular la conversion de dolares a pesos
        cambioFinal = dolares * cambioMoneda;
        // Mostrar el resultado
        System.out.println("El cambio final es: " + cambioFinal);
    }
}
