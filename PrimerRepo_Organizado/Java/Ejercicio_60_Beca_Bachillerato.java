import java.util.Scanner;

public class Ejercicio_60_Beca_Bachillerato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Promedio (0-10): ");
        double promedio = sc.nextDouble();

        System.out.print("Asistencia (%): ");
        double asistencia = sc.nextDouble();

        System.out.print("Nivel (1=Bajo, 2=Medio, 3=Alto): ");
        int nivel = sc.nextInt();

        // Validar datos
        if (promedio < 0 || promedio > 10 || asistencia < 0 ||
            asistencia > 100 || nivel < 1 || nivel > 3) {
            System.out.println("Datos inválidos");
        } else {

            // Inicializar beca
            double beca = 0;

            // Asignar beca según rendimiento y nivel
            if (promedio >= 9 && asistencia >= 95) {
                switch (nivel) {
                    case 1:
                        beca = 100;
                        break;
                    case 2:
                        beca = 70;
                        break;
                    case 3:
                        beca = 40;
                        break;
                }
            } else if (promedio >= 8 && asistencia >= 85) {
                if (nivel <= 2) {
                    beca = 50;
                } else {
                    beca = 20;
                }
            } else if (promedio >= 7 && asistencia >= 75 && nivel == 1) {
                beca = 25;
            }

            // Mostrar resultado
            System.out.println("Porcentaje de beca: " + beca + "%");

            if (beca > 0) {
                System.out.println("Sigue esforzándote");
            } else {
                System.out.println("Puedes mejorar");
            }
        }
    }
}