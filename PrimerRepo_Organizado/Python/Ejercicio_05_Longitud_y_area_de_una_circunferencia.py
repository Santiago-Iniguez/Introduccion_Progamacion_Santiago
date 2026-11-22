import math

# Ingresar radio
radio = float(input("Ingrese radio de la circunferencia: "))

# Calcular diámetro, longitud y área
diametro = 2 * radio
longitud = math.pi * diametro
area = math.pi * radio**2

# Mostrar resultados
print("La longitud es:", longitud)
print("El área es:", area)