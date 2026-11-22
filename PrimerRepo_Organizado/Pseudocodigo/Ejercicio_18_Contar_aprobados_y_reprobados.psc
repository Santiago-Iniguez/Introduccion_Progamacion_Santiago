Algoritmo ContarAprobados()
Inicio
    // Declaracion de variables
    Definir N, i, aprobados, reprobados Como Entero
    Definir nota Como Real
    // Inicializar contadores
    aprobados <- 0
    reprobados <- 0
    i <- 1
    // Ingresar cantidad de estudiantes
    Escribir "Ingrese la cantidad de estudiantes:"
    Leer N
    // Repetir mientras i sea menor o igual a N
    Mientras i <= N Hacer
        // Ingresar nota del estudiante
        Escribir "Ingrese la nota del estudiante ", i, ":"
        Leer nota
        // Verificar si el estudiante aprobo
        Si nota >= 7 Entonces
            aprobados <- aprobados + 1
        SiNo
            reprobados <- reprobados + 1
        FinSi
        // Incrementar el contador
        i <- i + 1
    FinMientras
    // Mostrar resultados
    Escribir "Cantidad de aprobados: ", aprobados
    Escribir "Cantidad de reprobados: ", reprobados
Fin
