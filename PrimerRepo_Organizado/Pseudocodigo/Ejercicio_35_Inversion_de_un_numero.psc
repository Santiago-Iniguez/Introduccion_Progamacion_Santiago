Algoritmo inversionNumero()
Inicio
    // Declarar variables
    Definir numero, original, digito, invertido Como Entero

    // Ingresar número
    Escribir "Ingrese un número entero positivo:"
    Leer numero

    // Validar número
    Si numero > 0 Entonces
        // Inicializar variables
        original <- numero
        invertido <- 0

        // Invertir los dígitos
        Mientras numero > 0 Hacer
            digito <- numero MOD 10
            invertido <- invertido * 10 + digito
            numero <- TRUNC(numero / 10)
        FinMientras

        // Mostrar resultados
        Escribir "Número original: ", original
        Escribir "Número invertido: ", invertido
    SiNo
        Escribir "Debe ingresar un número positivo"
    FinSi
Fin