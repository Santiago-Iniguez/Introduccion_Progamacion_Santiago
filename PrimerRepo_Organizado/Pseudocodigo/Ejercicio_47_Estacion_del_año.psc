Algoritmo EstacionYear()
Inicio
    // Declarar variables
    Definir mes, dia, maxDias Como Entero

    // Ingresar datos
    Escribir "Ingrese el número del mes (1-12):"
    Leer mes
    Escribir "Ingrese el día:"
    Leer dia

    // Determinar días del mes
    maxDias <- 0
    Segun mes Hacer
        1, 3, 5, 7, 8, 10, 12:
            maxDias <- 31
        4, 6, 9, 11:
            maxDias <- 30
        2:
            maxDias <- 29
    FinSegun

    // Validar fecha
    Si mes < 1 O mes > 12 O dia < 1 O dia > maxDias Entonces
        Escribir "Fecha no válida"
    SiNo
        // Determinar estación
        Segun mes Hacer
            12, 1, 2:
                Escribir "Verano"
            3, 4, 5:
                Escribir "Otoño"
            6, 7, 8:
                Escribir "Invierno"
            9, 10, 11:
                Escribir "Primavera"
        FinSegun
    FinSi
Fin