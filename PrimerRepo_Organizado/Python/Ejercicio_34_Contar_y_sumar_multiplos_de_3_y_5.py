# Ingresar número
N = int(input("Ingrese el valor de N: "))

# Validar número
if N > 0:
    # Inicializar variables
    i = 1
    cantidad = 0
    suma = 0

    # Buscar múltiplos de 3 y 5
    while i <= N:
        if i % 3 == 0 or i % 5 == 0:
            cantidad = cantidad + 1
            suma = suma + i
        i = i + 1

    # Mostrar resultados
    print("Cantidad de múltiplos:", cantidad)
    print("Suma de los múltiplos:", suma)
else:
    print("N debe ser mayor que cero")