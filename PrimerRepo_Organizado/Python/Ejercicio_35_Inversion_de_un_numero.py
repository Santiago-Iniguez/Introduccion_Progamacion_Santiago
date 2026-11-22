# Ingresar número
numero = int(input("Ingrese un número entero positivo: "))

# Validar número
if numero > 0:
    # Inicializar variables
    original = numero
    invertido = 0

    # Invertir los dígitos
    while numero > 0:
        digito = numero % 10
        invertido = invertido * 10 + digito
        numero = numero // 10

    # Mostrar resultados
    print("Número original:", original)
    print("Número invertido:", invertido)
else:
    print("Debe ingresar un número positivo")