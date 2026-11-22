Algoritmo AhorroInteresCompuesto()
Inicio
    // Declarar variables
    Definir capital, deposito, tasa, saldo Como Real
    Definir N, mes Como Entero

    // Ingresar datos
    Escribir "Ingrese el capital inicial:"
    Leer capital
    Escribir "Ingrese el depósito mensual:"
    Leer deposito
    Escribir "Ingrese la cantidad de meses:"
    Leer N
    Escribir "Ingrese la tasa mensual en porcentaje:"
    Leer tasa

    // Inicializar saldo
    saldo <- capital

    // Calcular ahorro mensual
    Para mes <- 1 Hasta N Hacer
        saldo <- (saldo + deposito) * (1 + tasa / 100)
        Escribir "Saldo del mes ", mes, ": $", saldo
    FinPara

    // Mostrar resultado
    Escribir "Saldo final: $", saldo
Fin