# Ingresar datos
sueldo = float(input("Ingrese el sueldo base: "))
productividad = float(input("Ingrese el porcentaje de productividad: "))

# Determinar porcentaje de bono
if productividad >= 90:
    porcentaje = 0.20
elif productividad >= 70:
    porcentaje = 0.10
elif productividad >= 50:
    porcentaje = 0.05
else:
    porcentaje = 0

# Calcular bono y sueldo total
bono = sueldo * porcentaje
total = sueldo + bono

# Mostrar resultados
print("Bono recibido: $", bono)
print("Total a pagar: $", total)