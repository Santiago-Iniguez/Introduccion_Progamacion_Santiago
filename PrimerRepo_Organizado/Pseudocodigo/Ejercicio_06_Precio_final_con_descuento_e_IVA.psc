Algoritmo precioFinalIVA()
Inicio
    // Declarar variables
    Definir precioArticulo, precioFinal, precioConDescuento Como Real
    Definir valorDescuento, valorIVA, IVA, descuento Como Real

    // Ingresar precio
    Escribir "Ingrese precio del artículo"
    Leer precioArticulo

    // Definir porcentajes
    descuento <- 0.20
    IVA <- 0.15

    // Calcular descuento e IVA
    valorDescuento <- precioArticulo * descuento
    precioConDescuento <- precioArticulo - valorDescuento
    valorIVA <- precioConDescuento * IVA
    precioFinal <- precioConDescuento + valorIVA

    // Mostrar resultados
    Escribir "El precio con descuento es: ", precioConDescuento
    Escribir "El precio final es: ", precioFinal
Fin