Algoritmo PromedioNotas()
Inicio
    // Declaracion de variables
    Definir N, i Como Entero
    Definir nota, suma, promedio Como Real
    // Inicializar variables
    suma <- 0
    i <- 1
    // Ingresar cantidad de notas
    Escribir "Ingrese la cantidad de notas:"
    Leer N
    // Validar que la cantidad sea mayor que cero
    Si N > 0 Entonces
        // Repetir mientras i sea menor o igual a N
        Mientras i <= N Hacer
            // Ingresar la nota
            Escribir "Ingrese la nota ", i, ":"
            Leer nota
            // Acumular las notas
            suma <- suma + nota
            // Incrementar el contador
            i <- i + 1
        FinMientras
        // Calcular el promedio
        promedio <- suma / N
        // Mostrar resultados
        Escribir "La suma de las notas es: ", suma
        Escribir "El promedio es: ", promedio
    SiNo
        Escribir "La cantidad de notas debe ser mayor que cero"
    FinSi
Fin
