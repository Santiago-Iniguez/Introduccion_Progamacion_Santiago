# Ingresar datos
capital = float(input("Ingrese el capital: "))
tasaAnual = float(input("Ingrese la tasa anual en porcentaje (12 para 12%): "))
meses = int(input("Ingrese los meses: "))

# Validar plazo
if meses > 0:
    # Calcular interés simple
    porcentaje = tasaAnual / 100
    interes = capital * porcentaje * (meses / 12)

    # Calcular cuota mensual
    cuotaMensual = (capital + interes) / meses

    # Mostrar resultados
    print("El interés es:", interes)
    print("La cuota mensual es:", cuotaMensual)
else:
    print("El número de meses debe ser mayor que cero")