Algoritmo NumeroPerfecto()
Inicio
    // Declarar variables
    Definir N, i, suma Como Entero

    // Ingresar número
    Escribir "Ingrese un número entero positivo:"
    Leer N

    // Validar número
    Si N > 0 Entonces
        // Inicializar suma
        suma <- 0

        // Sumar divisores propios
        Para i <- 1 Hasta N - 1 Hacer
            Si N MOD i = 0 Entonces
                suma <- suma + i
            FinSi
        FinPara

        // Verificar número perfecto
        Si suma = N Entonces
            Escribir N, " es un número perfecto"
        SiNo
            Escribir N, " no es un número perfecto"
        FinSi
    SiNo
        Escribir "Debe ingresar un número positivo"
    FinSi
Fin