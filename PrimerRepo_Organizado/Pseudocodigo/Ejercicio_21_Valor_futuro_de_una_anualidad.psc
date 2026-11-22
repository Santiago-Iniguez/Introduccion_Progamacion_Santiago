Algoritmo valorFuturo()
Inicio
    // Declarar variables
    Definir depositoMensual, tasaMensual, valorFuturo, totalDepositado Como Real
    Definir meses Como Entero

    // Ingresar datos
    Escribir "Ingrese depósito mensual"
    Leer depositoMensual
    Escribir "Ingrese tasa mensual"
    Leer tasaMensual
    Escribir "Ingrese número de meses"
    Leer meses

    // Calcular total depositado
    totalDepositado <- depositoMensual * meses

    // Calcular valor futuro
    Si (tasaMensual = 0) Entonces
        valorFuturo <- totalDepositado
    SiNo
        valorFuturo <- depositoMensual * (((1 + tasaMensual)^meses - 1) / tasaMensual)
    FinSi

    // Mostrar resultados
    Escribir "El valor total depositado es: ", totalDepositado
    Escribir "El valor futuro es: ", valorFuturo
Fin
