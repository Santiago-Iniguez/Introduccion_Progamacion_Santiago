Algoritmo DistanciaPuntoMedio()
Inicio
    // Declarar variables
    Definir x1, y1, x2, y2 Como Real
    Definir distancia, xm, ym Como Real

    // Ingresar coordenadas
    Escribir "Ingrese x1:"
    Leer x1
    Escribir "Ingrese y1:"
    Leer y1
    Escribir "Ingrese x2:"
    Leer x2
    Escribir "Ingrese y2:"
    Leer y2

    // Calcular distancia
    distancia <- RC((x2 - x1)^2 + (y2 - y1)^2)

    // Calcular punto medio
    xm <- (x1 + x2) / 2
    ym <- (y1 + y2) / 2

    // Mostrar resultados
    Escribir "Distancia entre los puntos: ", distancia
    Escribir "Punto medio: (", xm, ", ", ym, ")"
Fin