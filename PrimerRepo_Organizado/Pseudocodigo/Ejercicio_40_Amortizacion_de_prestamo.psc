Algoritmo AmortizacionPrestamo()
Inicio
    // Declarar variables
    Definir monto, tasa, interes, cuota Como Real
    Definir meses Como Entero

    // Ingresar datos
    Escribir "Ingrese el monto del préstamo:"
    Leer monto
    Escribir "Ingrese la tasa de interés mensual (%):"
    Leer tasa
    Escribir "Ingrese el número de meses:"
    Leer meses

    // Validar plazo
    Si meses > 0 Entonces
        // Calcular interés simple
        interes <- monto * (tasa / 100) * meses

        // Calcular cuota mensual
        cuota <- (monto + interes) / meses

        // Mostrar resultados
        Escribir "Interés total: $", interes
        Escribir "Cuota mensual: $", cuota
    SiNo
        Escribir "Los meses deben ser mayores que cero"
    FinSi
Fin