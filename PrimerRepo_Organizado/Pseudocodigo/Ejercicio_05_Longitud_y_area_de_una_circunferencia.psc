Algoritmo longitud_Area_Circunferencia()
Inicio
    // Declarar variables
    Definir radio, diametro, longitud, area Como Real

    // Ingresar radio
    Escribir "Ingrese radio de la circunferencia"
    Leer radio

    // Calcular diámetro, longitud y área
    diametro <- 2 * radio
    longitud <- 3.1416 * diametro
    area <- 3.1416 * radio^2

    // Mostrar resultados
    Escribir "La longitud es: ", longitud
    Escribir "El área es: ", area
Fin