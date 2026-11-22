Algoritmo descuentoTienda()
Inicio
    // Declarar variables
    Definir monto, descuento, total Como Real
    Definir frecuente Como Cadena

    // Ingresar datos
    Escribir "Ingrese el monto de la compra:"
    Leer monto
    Escribir "¿Es cliente frecuente? (S/N):"
    Leer frecuente

    // Validar monto
    Si (monto >= 0) Entonces
        descuento <- 0

        // Determinar descuento por compra
        Si (monto >= 500) Entonces
            descuento <- 15
        SiNo
            Si (monto >= 300) Entonces
                descuento <- 10
            SiNo
                Si (monto >= 100) Entonces
                    descuento <- 5
                FinSi
            FinSi
        FinSi

        // Aplicar descuento adicional
        Si (Mayusculas(frecuente) = "S") Entonces
            descuento <- descuento + 5
        FinSi

        // Calcular total a pagar
        total <- monto - (monto * descuento / 100)

        // Mostrar resultados
        Escribir "Descuento aplicado: ", descuento, "%"
        Escribir "Total a pagar: $", total
    SiNo
        Escribir "El monto no puede ser negativo"
    FinSi
Fin