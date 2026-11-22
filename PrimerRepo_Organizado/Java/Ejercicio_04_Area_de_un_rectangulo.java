import java.util.Scanner;

public class Ejercicio_04_Area_de_un_rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos
        System.out.print("Ingrese base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese altura del rectángulo: ");
        double altura = sc.nextDouble();

        // Calcular área
        double area = base * altura;

        // Mostrar resultado
        System.out.println("El área es: " + area);

    }
}