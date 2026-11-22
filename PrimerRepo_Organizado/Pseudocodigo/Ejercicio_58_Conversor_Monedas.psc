Algoritmo ConversorMonedas()
Inicio
    // Declaración de variables
    Definir codigo Como Entero
    Definir monto, tasa, comision, resultado Como Real
    // Ingreso de datos
    Escribir "Código (1=EUR, 2=GBP, 3=JPY, 4=MXN): "
    Leer codigo
    Escribir "Monto en USD: "
    Leer monto
    // Validar datos
    Si codigo < 1 O codigo > 4 O monto < 0 Entonces
        Escribir "Datos inválidos"
    SiNo
        // Asignar tasa y comisión según la moneda
        Segun codigo Hacer
            1:
                tasa <- 0.92
                comision <- 0.01
            2:
                tasa <- 0.78
                comision <- 0.01
            3:
                tasa <- 149
                comision <- 0.015
            4:
                tasa <- 17.2
                comision <- 0.02
        FinSegun
        // Calcular resultado con comisión
        resultado <- monto * tasa * (1 - comision)
        // Mostrar resultados
        Escribir "Resultado: ", resultado
        Escribir "Comisión: ", monto * comision
    FinSi
Fin