Algoritmo EnergiaElectrica()
Inicio
    // Declarar variables
    Definir potencia, horas, tarifa Como Real
    Definir consumo, costo Como Real

    // Ingresar datos
    Escribir "Ingrese la potencia en watts:"
    Leer potencia
    Escribir "Ingrese las horas de uso diario:"
    Leer horas
    Escribir "Ingrese la tarifa por kWh:"
    Leer tarifa

    // Calcular consumo mensual
    consumo <- (potencia / 1000) * horas * 30

    // Calcular costo mensual
    costo <- consumo * tarifa

    // Mostrar resultados
    Escribir "Consumo mensual en kWh: ", consumo
    Escribir "Costo mensual: $", costo
Fin