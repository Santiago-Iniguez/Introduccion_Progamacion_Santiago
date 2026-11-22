# Definir tarifa
tarifa = 2.50

# Ingresar datos
peso = float(input("Ingrese peso real en kg: "))
largo = float(input("Ingrese largo en cm: "))
ancho = float(input("Ingrese ancho en cm: "))
alto = float(input("Ingrese alto en cm: "))

# Calcular peso volumétrico
pesoVolumetrico = (largo * ancho * alto) / 5000

# Determinar peso a cobrar
if peso > pesoVolumetrico:
    pesoCobrar = peso
else:
    pesoCobrar = pesoVolumetrico

# Calcular costo total
totalPagar = pesoCobrar * tarifa

# Mostrar resultados
print("El peso a cobrar es:", pesoCobrar, "kg")
print("El total a pagar es: $", totalPagar)