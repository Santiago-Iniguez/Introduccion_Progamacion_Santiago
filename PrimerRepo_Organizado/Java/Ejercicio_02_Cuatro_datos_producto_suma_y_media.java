import java.util.Scanner;

public class Ejercicio_02_Cuatro_datos_producto_suma_y_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion Variables
        int dato1, dato2, dato3, dato4, suma, producto;
        double maediaAritmeticaL;
        // Ingresar datos
        System.out.print("Ingrese dato 1: ");
        dato1 = sc.nextInt();
        System.out.print("Ingrese dato 2: ");
        dato2 = sc.nextInt();
        System.out.print("Ingrese dato 3: ");
        dato3 = sc.nextInt();
        System.out.print("Ingrese dato 4: ");
        dato4 = sc.nextInt();
        // Calcular suma, producto y media
        suma = dato1 + dato2 + dato3 + dato4;
        producto = dato1 * dato2 * dato3 * dato4;
        double mediaAritmetica = suma / 4.0;
        // Mostrar resultados
        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);
        System.out.println("La media aritmética es: " + mediaAritmetica);
        sc.close();
    }
}
