Algoritmo tarifaEstacionamiento()
Inicio
    // Declarar variables
    Definir horas, tarifa, total Como Real
    Definir nocturno Como Cadena

    // Ingresar datos
    Escribir "Ingrese las horas de estacionamiento:"
    Leer horas
    Escribir "¿Es horario nocturno? (S/N):"
    Leer nocturno

    // Validar horas
    Si horas > 0 Entonces
        // Calcular tarifa base
        tarifa <- horas * 1.50

        // Aplicar recargo por tiempo
        Si horas > 8 Entonces
            tarifa <- tarifa * 1.25
        FinSi

        // Aplicar recargo nocturno
        Si nocturno = "S" Entonces
            tarifa <- tarifa * 1.30
        FinSi

        // Mostrar resultado
        total <- tarifa
        Escribir "Total a pagar: $", total
    SiNo
        Escribir "Las horas deben ser mayores que cero"
    FinSi
Fin