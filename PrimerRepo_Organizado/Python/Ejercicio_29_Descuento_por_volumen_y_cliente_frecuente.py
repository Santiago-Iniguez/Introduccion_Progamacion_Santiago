# Ingresar datos
monto = float(input("Ingrese el monto de la compra: "))
frecuente = input("¿Es cliente frecuente? (S/N): ").upper()

# Validar monto
if monto >= 0:
    # Determinar descuento por compra
    if monto >= 500:
        descuento = 15
    elif monto >= 300:
        descuento = 10
    elif monto >= 100:
        descuento = 5
    else:
        descuento = 0

    # Aplicar descuento adicional
    if frecuente == "S":
        descuento += 5

    # Calcular total a pagar
    total = monto - (monto * descuento / 100)

    # Mostrar resultados
    print("Descuento aplicado:", descuento, "%")
    print("Total a pagar: $", round(total, 2))
else:
    print("El monto no puede ser negativo")