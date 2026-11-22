# Ingresar datos
a = int(input("Ingrese el primer número positivo: "))
b = int(input("Ingrese el segundo número positivo: "))

# Validar números
if a > 0 and b > 0:
    # Calcular MCD
    while b != 0:
        residuo = a % b
        a = b
        b = residuo

    # Mostrar resultado
    print("El MCD es:", a)
else:
    print("Los números deben ser positivos")