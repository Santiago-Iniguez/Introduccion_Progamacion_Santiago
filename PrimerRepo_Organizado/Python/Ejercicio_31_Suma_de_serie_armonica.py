# Ingresar datos
N = int(input("Ingrese el valor de N: "))

# Validar número
if N > 0:
    # Inicializar variables
    suma = 0
    i = 1

    # Calcular suma de la serie
    while i <= N:
        suma = suma + (1 / i)
        i = i + 1

    # Mostrar resultado
    print("La suma de la serie es:", suma)
else:
    print("N debe ser mayor que cero")