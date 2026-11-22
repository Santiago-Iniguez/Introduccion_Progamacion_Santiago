# Ingresar número
N = int(input("Ingrese un número entero positivo: "))

# Validar número
if N > 0:
    # Inicializar suma
    suma = 0

    # Sumar divisores propios
    for i in range(1, N):
        if N % i == 0:
            suma = suma + i

    # Verificar número perfecto
    if suma == N:
        print(N, "es un número perfecto")
    else:
        print(N, "no es un número perfecto")
else:
    print("Debe ingresar un número positivo")