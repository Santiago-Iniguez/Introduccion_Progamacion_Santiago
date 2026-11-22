import java.util.Scanner;
public class Ejercicio_10_Area_y_perimetro_de_un_rectangulo {
    public static void main(String[] args) {
        // Crear objeto para ingresar datos
        Scanner sc = new Scanner(System.in);
        // Declaracion de variables
        double largo, ancho, area, perimetro;
        // Ingresar el largo del terreno
        System.out.println("Ingrese largo del terreno:");
        largo = sc.nextDouble();
        // Ingresar el ancho del terreno
        System.out.println("Ingrese ancho del terreno:");
        ancho = sc.nextDouble();
        // Calcular el area del terreno
        area = largo * ancho;
        // Calcular el perimetro del terreno
        perimetro = 2 * (largo + ancho);
        // Mostrar los resultados
        System.out.println("El area del terreno es: " + area);
        System.out.println("El perimetro del terreno es: " + perimetro);
    }
}
