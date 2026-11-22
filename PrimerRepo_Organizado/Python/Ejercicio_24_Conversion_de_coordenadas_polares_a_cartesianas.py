import math

# Ingresar datos
radio = float(input("Ingrese el radio: "))
angulo = float(input("Ingrese el ángulo en grados: "))

# Convertir grados a radianes
radianes = math.radians(angulo)

# Calcular coordenadas cartesianas
x = radio * math.cos(radianes)
y = radio * math.sin(radianes)

# Mostrar resultados
print("Coordenada X:", x)
print("Coordenada Y:", y)