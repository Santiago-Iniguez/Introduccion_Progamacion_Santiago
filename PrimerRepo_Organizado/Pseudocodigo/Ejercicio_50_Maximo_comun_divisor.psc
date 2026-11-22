Algoritmo MaximoComunDivisor()
Inicio
    // Declarar variables
    Definir a, b, residuo Como Entero

    // Ingresar datos
    Escribir "Ingrese el primer número positivo:"
    Leer a
    Escribir "Ingrese el segundo número positivo:"
    Leer b

    // Validar números
    Si a > 0 Y b > 0 Entonces
        // Calcular MCD
        Mientras b <> 0 Hacer
            residuo <- a MOD b
            a <- b
            b <- residuo
        FinMientras

        // Mostrar resultado
        Escribir "El MCD es: ", a
    SiNo
        Escribir "Los números deben ser positivos"
    FinSi
Fin