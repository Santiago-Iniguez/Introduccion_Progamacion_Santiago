# Ingresar monto de compra
compra = float(input("Ingrese el monto de la compra: "))

# Determinar porcentaje de descuento
if compra >= 200:
    descuento = 0.15
elif compra >= 100:
    descuento = 0.10
else:
    descuento = 0.05

# Calcular total a pagar
total = compra - (compra * descuento)

# Mostrar resultados
print("El descuento es:", descuento * 100, "%")
print("El total a pagar es: $", total)