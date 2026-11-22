import java.util.Scanner;
public class Ejercicio_16_Suma_hasta_ingresar_cero {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        int numero, suma;
        // Inicializar la suma en cero
        suma = 0;
        // Ingresar el primer numero
        System.out.println("Ingrese un numero (0 para terminar):");
        numero = sc.nextInt();
        // Repetir mientras el numero sea diferente de cero
        while (numero != 0) {
            // Acumular el numero ingresado
            suma = suma + numero;
            // Solicitar otro numero
            System.out.println("Ingrese otro numero (0 para terminar):");
            numero = sc.nextInt();
        }
        // Mostrar la suma total
        System.out.println("La suma total es: " + suma);
    }
}
