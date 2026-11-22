public class Ejercicio_19_Incremento_salarial_anual {
    public static void main(String[] args) {
        // Declaracion de variables
        double salario;
        int anio;
        // Inicializar variables
        salario = 1500;
        anio = 1;
        // Repetir durante 6 años
        while (anio <= 6) {
            // Incrementar el salario un 10%
            salario = salario * 1.10;
            // Mostrar el salario de cada año
            System.out.println("Salario del año " + anio + ": $" + salario);
            // Incrementar el contador
            anio = anio + 1;
        }
        // Mostrar el salario final
        System.out.println("Salario final: $" + salario);
    }
}
