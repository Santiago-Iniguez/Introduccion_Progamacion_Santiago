Algoritmo DecimalHexadecimal()
Inicio
    // Declarar variables
    Definir numero, residuo Como Entero
    Definir hexadecimal, digito Como Cadena

    // Ingresar número
    Escribir "Ingrese un número entero no negativo:"
    Leer numero

    // Validar número
    Si numero >= 0 Entonces
        hexadecimal <- ""

        // Convertir a hexadecimal
        Si numero = 0 Entonces
            hexadecimal <- "0"
        SiNo
            Mientras numero > 0 Hacer
                residuo <- numero MOD 16

                // Obtener dígito hexadecimal
                Segun residuo Hacer
                    10: digito <- "A"
                    11: digito <- "B"
                    12: digito <- "C"
                    13: digito <- "D"
                    14: digito <- "E"
                    15: digito <- "F"
                    De Otro Modo:
                        digito <- ConvertirATexto(residuo)
                FinSegun

                hexadecimal <- digito + hexadecimal
                numero <- TRUNC(numero / 16)
            FinMientras
        FinSi

        // Mostrar resultado
        Escribir "Número hexadecimal: ", hexadecimal
    SiNo
        Escribir "El número no puede ser negativo"
    FinSi
Fin