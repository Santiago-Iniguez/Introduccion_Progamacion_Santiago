import java.util.Scanner;
public class Ejercicio_14_Numero_par_o_impar {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        int numero;
        // Ingresar un numero entero
        System.out.println("Ingrese un numero entero:");
        numero = sc.nextInt();
        // Verificar si el numero es par
        if (numero % 2 == 0) {
            System.out.println("El numero es PAR");
        }
        // Si no es par, el numero es impar
        else {
            System.out.println("El numero es IMPAR");
        }
    }
}
