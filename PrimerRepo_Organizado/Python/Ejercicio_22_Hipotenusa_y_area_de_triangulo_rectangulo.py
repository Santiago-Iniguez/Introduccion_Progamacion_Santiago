import math

# Ingresar catetos
a = float(input("Ingrese cateto a: "))
b = float(input("Ingrese cateto b: "))

# Calcular hipotenusa y área
c = math.sqrt(a**2 + b**2)
area = (a * b) / 2

# Mostrar resultados
print("La hipotenusa es:", c)
print("El área del triángulo es:", area)