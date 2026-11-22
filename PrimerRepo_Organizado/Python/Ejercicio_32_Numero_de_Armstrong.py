# Ingresar número
numero = int(input("Ingrese un número de tres dígitos: "))

# Validar número
if 100 <= numero <= 999:
    # Inicializar variables
    original = numero
    suma = 0

    # Extraer y elevar los dígitos al cubo
    while numero > 0:
        digito = numero % 10
        suma = suma + (digito * digito * digito)
        numero = numero // 10

    # Verificar número de Armstrong
    if suma == original:
        print("Es un número de Armstrong")
    else:
        print("No es un número de Armstrong")
else:
    print("Debe ingresar un número de tres dígitos")