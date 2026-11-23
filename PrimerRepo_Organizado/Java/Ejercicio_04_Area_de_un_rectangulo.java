import java.util.Scanner;

public class Ejercicio_04_Area_de_un_rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion Variables
        double base, altura, area;
        // Ingresar datos
        System.out.print("Ingrese base del rectángulo: ");
        base = sc.nextDouble();
        System.out.print("Ingrese altura del rectángulo: ");
        altura = sc.nextDouble();
        // Calcular área
        area = base * altura;
        // Mostrar resultado
        System.out.println("El área es: " + area);
    }
}
