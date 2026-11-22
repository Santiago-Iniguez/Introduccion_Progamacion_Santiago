# Ingresar datos
potencia = float(input("Ingrese la potencia en watts: "))
horas = float(input("Ingrese las horas de uso diario: "))
tarifa = float(input("Ingrese la tarifa por kWh: "))

# Calcular consumo mensual
consumo = (potencia / 1000) * horas * 30

# Calcular costo mensual
costo = consumo * tarifa

# Mostrar resultados
print("Consumo mensual en kWh:", consumo)
print("Costo mensual: $", costo)