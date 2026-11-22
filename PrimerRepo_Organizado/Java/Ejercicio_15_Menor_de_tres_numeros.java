
import java.util.Scanner;
public class Ejercicio_15_Menor_de_tres_numeros {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        double num1, num2, num3, menor;
        // Ingresar el primer numero
        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextDouble();
        // Ingresar el segundo numero
        System.out.println("Ingrese el segundo numero:");
        num2 = sc.nextDouble();
        // Ingresar el tercer numero
        System.out.println("Ingrese el tercer numero:");
        num3 = sc.nextDouble();
        // Verificar si el primer numero es el menor
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        }
        // Si no, verificar si el segundo numero es el menor
        else {
            if (num2 <= num1 && num2 <= num3) {
                menor = num2;
            }
            // Si no, el tercer numero es el menor
            else {
                menor = num3;
            }
        }
        // Mostrar el numero menor
        System.out.println("El menor de los tres numeros es: " + menor);
    }
}
