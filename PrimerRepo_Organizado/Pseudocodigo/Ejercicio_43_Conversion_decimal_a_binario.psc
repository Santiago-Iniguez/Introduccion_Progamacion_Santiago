Algoritmo DecimalBinario()
Inicio
    // Declarar variables
    Definir numero, residuo Como Entero
    Definir binario Como Cadena

    // Ingresar número
    Escribir "Ingrese un número entero no negativo:"
    Leer numero

    // Validar número
    Si numero >= 0 Entonces
        binario <- ""

        // Convertir a binario
        Si numero = 0 Entonces
            binario <- "0"
        SiNo
            Mientras numero > 0 Hacer
                residuo <- numero MOD 2
                binario <- ConvertirATexto(residuo) + binario
                numero <- TRUNC(numero / 2)
            FinMientras
        FinSi

        // Mostrar resultado
        Escribir "Número binario: ", binario
    SiNo
        Escribir "El número no puede ser negativo"
    FinSi
Fin