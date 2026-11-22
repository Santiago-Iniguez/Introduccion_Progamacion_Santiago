Algoritmo BonoProductividad()
Inicio
    // Declarar variables
    Definir sueldo, productividad Como Real
    Definir porcentaje, bono, total Como Real

    // Ingresar datos
    Escribir "Ingrese el sueldo base:"
    Leer sueldo
    Escribir "Ingrese el porcentaje de productividad:"
    Leer productividad

    // Determinar porcentaje de bono
    Si productividad >= 90 Entonces
        porcentaje <- 0.20
    SiNo
        Si productividad >= 70 Entonces
            porcentaje <- 0.10
        SiNo
            Si productividad >= 50 Entonces
                porcentaje <- 0.05
            SiNo
                porcentaje <- 0
            FinSi
        FinSi
    FinSi

    // Calcular bono y sueldo total
    bono <- sueldo * porcentaje
    total <- sueldo + bono

    // Mostrar resultados
    Escribir "Bono recibido: $", bono
    Escribir "Total a pagar: $", total
Fin