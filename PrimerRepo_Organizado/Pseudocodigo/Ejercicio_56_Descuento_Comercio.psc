Algoritmo DescuentoComercio
Inicio
    // Declaración de variables
    Definir categoria, cantidad Como Entero
    Definir precio, descuento, total Como Real
    // Ingreso de datos
    Escribir "Categoría (1-4): "
    Leer categoria
    Escribir "Cantidad: "
    Leer cantidad
    Escribir "Precio unitario: "
    Leer precio
    // Validación de datos
    Si categoria < 1 O categoria > 4 O cantidad <= 0 O precio < 0 Entonces
        Escribir "Datos inválidos"
    SiNo
        // Inicializar descuento
        descuento <- 0
        // Descuento según categoría y cantidad
        Segun categoria Hacer
            1:
                Si cantidad >= 10 Entonces
                    descuento <- 0.05
                FinSi
            2:
                Si cantidad >= 5 Entonces
                    descuento <- 0.10
                FinSi
            3:
                descuento <- 0.03
            4:
                descuento <- 0
        FinSegun
        // Calcular total con descuento
        total <- precio * cantidad * (1 - descuento)

        // Aplicar descuento adicional del 2 %
        Si total > 100 Entonces
            total <- total * 0.98
        FinSi
        // Mostrar resultado
        Escribir "Total a pagar: $", total
    FinSi
Fin