Algoritmo multiplosDe3y5()
Inicio
    // Declarar variables
    Definir N, i, cantidad, suma Como Entero

    // Ingresar número
    Escribir "Ingrese el valor de N:"
    Leer N

    // Validar número
    Si N > 0 Entonces
        // Inicializar variables
        i <- 1
        cantidad <- 0
        suma <- 0

        // Buscar múltiplos de 3 y 5
        Mientras i <= N Hacer
            Si i MOD 3 = 0 O i MOD 5 = 0 Entonces
                cantidad <- cantidad + 1
                suma <- suma + i
            FinSi
            i <- i + 1
        FinMientras

        // Mostrar resultados
        Escribir "Cantidad de múltiplos: ", cantidad
        Escribir "Suma de los múltiplos: ", suma
    SiNo
        Escribir "N debe ser mayor que cero"
    FinSi
Fin