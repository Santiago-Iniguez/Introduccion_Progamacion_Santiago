# Ejercicio 58: Conversor de monedas

# Ingreso de datos
codigo = int(input("Código (1=EUR, 2=GBP, 3=JPY, 4=MXN): "))
monto = float(input("Monto en USD: "))

# Validar datos
if codigo < 1 or codigo > 4 or monto < 0:
    print("Datos inválidos")
else:
    # Asignar tasa y comisión según la moneda
    match codigo:
        case 1:
            tasa = 0.92
            comision = 0.01
        case 2:
            tasa = 0.78
            comision = 0.01
        case 3:
            tasa = 149
            comision = 0.015
        case 4:
            tasa = 17.2
            comision = 0.02

    # Calcular resultado con comisión
    resultado = monto * tasa * (1 - comision)

    # Mostrar resultados
    print(f"Resultado: {resultado:.2f}")
    print(f"Comisión: ${monto * comision:.2f}")