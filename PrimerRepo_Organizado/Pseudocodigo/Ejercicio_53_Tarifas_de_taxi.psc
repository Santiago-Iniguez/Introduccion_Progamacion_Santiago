Algoritmo TarifaTaxi()
Inicio
    // Declarar variables
    Definir km, tarifa Como Real
    Definir noche Como Cadena

    // Ingresar datos
    Escribir "Ingrese los kilómetros recorridos:"
    Leer km
    Escribir "¿Es de noche? (S/N):"
    Leer noche

    // Validar distancia
    Si km >= 0 Entonces
        // Calcular tarifa base
        tarifa <- 2 + (1.50 * km)

        // Aplicar recargo por distancia
        Si km > 10 Entonces
            tarifa <- tarifa * 1.20
        FinSi

        // Aplicar recargo nocturno
        Si Mayusculas(noche) = "S" Entonces
            tarifa <- tarifa * 1.30
        FinSi

        // Mostrar resultado
        Escribir "Total a pagar: $", tarifa
    SiNo
        Escribir "Los kilómetros no pueden ser negativos"
    FinSi
Fin