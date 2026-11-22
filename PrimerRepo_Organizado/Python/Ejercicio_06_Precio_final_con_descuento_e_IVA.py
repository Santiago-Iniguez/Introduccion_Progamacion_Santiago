# Ingresar el precio del articulo
precioArticulo = float(input("Ingrese precio del articulo: "))
# Definir porcentaje de descuento e IVA
Descuento = 0.20
IVA = 0.15
# Calcular el valor del descuento
valorDescuento = precioArticulo * Descuento
# Calcular el precio con descuento
precioConDescuento = precioArticulo - valorDescuento
# Calcular el IVA sobre el precio con descuento
valorIVA = precioConDescuento * IVA
# Calcular el precio final incluyendo IVA
precioFinal = precioConDescuento + valorIVA
# Mostrar los resultados
print("El precio con descuento es:", precioConDescuento)
print("El precio final es:", precioFinal)
