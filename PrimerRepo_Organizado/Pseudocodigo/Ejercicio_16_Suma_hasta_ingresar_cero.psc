Algoritmo SumaNumeros()
Inicio
    // Declarar variables
    Definir numero, suma Como Entero

    // Inicializar suma
    suma <- 0

    // Ingresar primer número
    Escribir "Ingrese un número (0 para terminar):"
    Leer numero

    // Sumar números hasta ingresar cero
    Mientras numero <> 0 Hacer
        suma <- suma + numero
        Escribir "Ingrese otro número (0 para terminar):"
        Leer numero
    FinMientras

    // Mostrar resultado
    Escribir "La suma total es: ", suma
Fin