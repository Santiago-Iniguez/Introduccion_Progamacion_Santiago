Algoritmo serieArmonica()
Inicio
    // Declarar variables
    Definir N, i Como Entero
    Definir suma Como Real

    // Ingresar datos
    Escribir "Ingrese el valor de N:"
    Leer N

    // Validar número
    Si N > 0 Entonces
        // Inicializar variables
        suma <- 0
        i <- 1

        // Calcular suma de la serie
        Mientras i <= N Hacer
            suma <- suma + (1 / i)
            i <- i + 1
        FinMientras

        // Mostrar resultado
        Escribir "La suma de la serie es: ", suma
    SiNo
        Escribir "N debe ser mayor que cero"
    FinSi
Fin