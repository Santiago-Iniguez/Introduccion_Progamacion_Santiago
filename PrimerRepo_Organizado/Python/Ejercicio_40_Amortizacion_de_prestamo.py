# Ingresar datos
monto = float(input("Ingrese el monto del préstamo: "))
tasa = float(input("Ingrese la tasa de interés mensual (%): "))
meses = int(input("Ingrese el número de meses: "))

# Validar plazo
if meses > 0:
    # Calcular interés simple
    interes = monto * (tasa / 100) * meses

    # Calcular cuota mensual
    cuota = (monto + interes) / meses

    # Mostrar resultados
    print("Interés total: $", interes)
    print("Cuota mensual: $", cuota)
else:
    print("Los meses deben ser mayores que cero")