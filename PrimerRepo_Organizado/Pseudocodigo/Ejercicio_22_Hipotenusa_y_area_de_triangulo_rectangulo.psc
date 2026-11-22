Algoritmo trianguloRectanguloHipotenusaArea()
Incio
    // Declarar variables
    Definir a, b, c, area Como Real

    // Ingresar catetos
    Escribir "Ingrese cateto a:"
    Leer a
    Escribir "Ingrese cateto b:"
    Leer b

    // Calcular hipotenusa y área
    c <- RC(a^2 + b^2)
    area <- (a * b) / 2

    // Mostrar resultados
    Escribir "La hipotenusa es: ", c
    Escribir "El área del triángulo es: ", area
Fin