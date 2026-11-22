# Ingresar número
n = int(input("Ingrese un número: "))

# Validar número
if n >= 0:
    # Inicializar factorial
    factorial = 1

    # Calcular factorial
    for i in range(1, n + 1):
        factorial = factorial * i

    # Mostrar resultado
    print("Factorial de", n, ":", factorial)
else:
    print("Número no válido")