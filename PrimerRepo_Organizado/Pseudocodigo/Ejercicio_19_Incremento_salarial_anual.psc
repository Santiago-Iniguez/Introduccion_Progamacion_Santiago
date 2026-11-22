Algoritmo IncrementoSalarial()
Inicio
    // Declaracion de variables
    Definir salario Como Real
    Definir año Como Entero
    // Inicializar variables
    salario <- 1500
    año <- 1
    // Repetir durante 6 años
    Mientras año <= 6 Hacer
        // Incrementar el salario un 10%
        salario <- salario * 1.10
        // Mostrar el salario de cada año
        Escribir "Salario del año ", año, ": $", salario
        // Incrementar el contador
        año <- año + 1
    FinMientras
    // Mostrar el salario final
    Escribir "Salario final: $", salario
Fin
