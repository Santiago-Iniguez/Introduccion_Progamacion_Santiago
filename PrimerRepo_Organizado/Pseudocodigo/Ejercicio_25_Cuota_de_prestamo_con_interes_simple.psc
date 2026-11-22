Algoritmo interesSimple()
Inicio
    // Declarar variables
    Definir capital, interes, cuotaMensual, tasaAnual, porcentaje Como Real
    Definir meses Como Entero

    // Ingresar datos
    Escribir "Ingrese el capital:"
    Leer capital
    Escribir "Ingrese la tasa anual en porcentaje (12 para 12%):"
    Leer tasaAnual
    Escribir "Ingrese los meses:"
    Leer meses

    // Validar plazo
    Si meses > 0 Entonces
        // Calcular interés simple
        porcentaje <- tasaAnual / 100
        interes <- capital * porcentaje * (meses / 12)

        // Calcular cuota mensual
        cuotaMensual <- (capital + interes) / meses

        // Mostrar resultados
        Escribir "El interés es: ", interes
        Escribir "La cuota mensual es: ", cuotaMensual
    SiNo
        Escribir "El número de meses debe ser mayor que cero"
    FinSi
Fin