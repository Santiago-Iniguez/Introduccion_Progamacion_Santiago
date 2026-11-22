# Ingresar el monto del prestamo
montoPrestamo = float(input("Ingrese el monto del prestamo: "))
# Ingresar la tasa de interes trimestral
tasaTrimestral = float(input("Ingrese la tasa trimestral: "))
# Ingresar el porcentaje de abono
porcentajeAbono = float(input("Ingrese porcentaje abono: "))
# Ingresar el numero de trimestres
numeroTrimestres = int(input("Ingrese numero de trimestres: "))
# Calcular el monto total con interes compuesto
montoTotal = montoPrestamo * (1 + tasaTrimestral / 100) ** numeroTrimestres
# Calcular el valor del abono
abonoExtra = montoTotal * porcentajeAbono / 100
# Restar el abono al monto total
abonoTotal = montoTotal - abonoExtra
# Mostrar los resultados
print("El monto antes del abono es:", montoTotal)
print("El abono es:", abonoExtra)
print("El monto final es:", abonoTotal)
