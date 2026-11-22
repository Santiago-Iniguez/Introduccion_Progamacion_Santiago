Algoritmo cooperativa()
Inicio
    // Declarar variables
    Definir montoPrestamo, tasaTrimestral, porcentajeAbono Como Real
    Definir montoTotal, abonoTotal, abonoExtra Como Real
    Definir numeroTrimestres Como Entero

    // Ingresar datos
    Escribir "Ingrese el monto del préstamo:"
    Leer montoPrestamo
    Escribir "Ingrese la tasa trimestral en decimal:"
    Leer tasaTrimestral
    Escribir "Ingrese porcentaje de abono:"
    Leer porcentajeAbono
    Escribir "Ingrese número de trimestres:"
    Leer numeroTrimestres

    // Calcular monto con interés compuesto
    montoTotal <- montoPrestamo * (1 + tasaTrimestral)^numeroTrimestres

    // Calcular abono extraordinario
    abonoExtra <- montoTotal * porcentajeAbono / 100

    // Calcular monto final
    abonoTotal <- montoTotal - abonoExtra

    // Mostrar resultados
    Escribir "El monto antes del abono es: ", montoTotal
    Escribir "El abono es: ", abonoExtra
    Escribir "El monto final es: ", abonoTotal
Fin