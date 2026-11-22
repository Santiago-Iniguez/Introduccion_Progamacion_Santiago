Algoritmo factorialNumero()
Inicio
    // Declarar variables
    Definir n, i, factorial Como Entero

    // Ingresar número
    Escribir "Ingrese un número:"
    Leer n

    // Validar número
    Si n >= 0 Entonces
        // Inicializar factorial
        factorial <- 1

        // Calcular factorial
        Para i <- 1 Hasta n Hacer
            factorial <- factorial * i
        FinPara

        // Mostrar resultado
        Escribir "Factorial de ", n, ": ", factorial
    SiNo
        Escribir "Número no válido"
    FinSi
Fin