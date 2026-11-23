import java.util.Scanner;

public class Ejercicio_03_Area_de_un_triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion Variables
        double base, altura, area;
        // Ingresar datos
        System.out.print("Ingrese base del triángulo: ");
        base = sc.nextDouble();
        System.out.print("Ingrese altura del triángulo: ");
        altura = sc.nextDouble();
        // Calcular área
        area = base * altura / 2;
        // Mostrar resultado
        System.out.println("El área es: " + area);
    }
}
