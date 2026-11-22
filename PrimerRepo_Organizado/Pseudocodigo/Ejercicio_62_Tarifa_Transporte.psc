Algoritmo TarifaTransporte()
Inicio
    // Declaración de variables
    Definir edad Como Entero
    Definir tarifaBase, tarifaFinal Como Real
    Definir estudiante, horarioPico Como Cadena
    // Ingreso de datos
    Escribir "Ingrese la edad: "
    Leer edad
    Escribir "¿Es estudiante? (S/N): "
    Leer estudiante
    Escribir "¿Es horario pico? (S/N): "
    Leer horarioPico
    Escribir "Ingrese la tarifa base: "
    Leer tarifaBase
    // Validar datos
    Si edad < 0 O tarifaBase < 0 Entonces
        Escribir "Datos inválidos"
    SiNo
        // Inicializar tarifa
        tarifaFinal <- tarifaBase

        // Aplicar gratuidad por edad
        Si edad < 5 O edad >= 65 Entonces
            tarifaFinal <- 0
        SiNo
            // Aplicar descuento estudiantil
            Si Mayusculas(estudiante) = "S" Y Mayusculas(horarioPico) = "N" Entonces
                tarifaFinal <- tarifaBase * 0.80
            FinSi
        FinSi
        // Mostrar resultado
        Escribir "Tarifa final: $", tarifaFinal
    FinSi
Fin