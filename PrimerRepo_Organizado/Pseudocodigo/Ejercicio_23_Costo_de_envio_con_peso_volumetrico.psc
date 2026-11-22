Algoritmo costoEnvio()
Inicio
    // Declarar variables
    Definir peso, largo, ancho, alto Como Real
    Definir pesoVolumetrico, pesoCobrar, tarifa, totalPagar Como Real

    // Definir tarifa
    tarifa <- 2.50

    // Ingresar datos
    Escribir "Ingrese peso real en kg:"
    Leer peso
    Escribir "Ingrese largo en cm:"
    Leer largo
    Escribir "Ingrese ancho en cm:"
    Leer ancho
    Escribir "Ingrese alto en cm:"
    Leer alto

    // Calcular peso volumétrico
    pesoVolumetrico <- (largo * ancho * alto) / 5000

    // Determinar peso a cobrar
    Si (peso > pesoVolumetrico) Entonces
        pesoCobrar <- peso
    SiNo
        pesoCobrar <- pesoVolumetrico
    FinSi

    // Calcular costo total
    totalPagar <- pesoCobrar * tarifa

    // Mostrar resultados
    Escribir "El peso a cobrar es: ", pesoCobrar, " kg"
    Escribir "El total a pagar es: $", totalPagar
Fin