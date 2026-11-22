Algoritmo simulacionAhorro()
Inicio
    // Declarar variables
    Definir N, mes Como Entero
    Definir aporte, saldo Como Real

    // Ingresar cantidad de meses
    Escribir "Ingrese la cantidad de meses:"
    Leer N

    // Validar meses
    Si N > 0 Entonces
        // Inicializar variables
        saldo <- 0
        mes <- 1

        // Calcular ahorro mensual
        Mientras mes <= N Hacer
            Escribir "Ingrese el aporte del mes ", mes, ":"
            Leer aporte

            // Acumular aporte y aplicar interés
            saldo <- saldo + aporte
            saldo <- saldo * 1.008

            mes <- mes + 1
        FinMientras

        // Mostrar resultado
        Escribir "El saldo final es: $", saldo
    SiNo
        Escribir "La cantidad de meses debe ser mayor que cero"
    FinSi
Fin