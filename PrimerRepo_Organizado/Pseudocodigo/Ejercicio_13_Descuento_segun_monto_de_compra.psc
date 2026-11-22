Algoritmo DescuentoCompra()
Inicio
    // Declarar variables
    Definir compra, descuento, total Como Real

    // Ingresar monto de compra
    Escribir "Ingrese el monto de la compra:"
    Leer compra

    // Determinar porcentaje de descuento
    Si compra >= 200 Entonces
        descuento <- 0.15
    SiNo
        Si compra >= 100 Entonces
            descuento <- 0.10
        SiNo
            descuento <- 0.05
        FinSi
    FinSi

    // Calcular total a pagar
    total <- compra - (compra * descuento)

    // Mostrar resultados
    Escribir "El descuento es: ", descuento * 100, "%"
    Escribir "El total a pagar es: $", total
Fin