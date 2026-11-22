# Ingresar número
numero = int(input("Ingrese un número entero no negativo: "))

# Validar número
if numero >= 0:
    binario = ""

    # Convertir a binario
    if numero == 0:
        binario = "0"
    else:
        while numero > 0:
            residuo = numero % 2
            binario = str(residuo) + binario
            numero = numero // 2

    # Mostrar resultado
    print("Número binario:", binario)
else:
    print("El número no puede ser negativo")