Algoritmo conversionCoordenadas()
Inicio
    // Declarar variables
    Definir radio, angulo, radianes, x, y Como Real

    // Ingresar datos
    Escribir "Ingrese el radio:"
    Leer radio
    Escribir "Ingrese el ángulo en grados:"
    Leer angulo

    // Convertir grados a radianes
    radianes <- (angulo * PI) / 180

    // Calcular coordenadas cartesianas
    x <- radio * COS(radianes)
    y <- radio * SEN(radianes)

    // Mostrar resultados
    Escribir "Coordenada X: ", x
    Escribir "Coordenada Y: ", y
Fin