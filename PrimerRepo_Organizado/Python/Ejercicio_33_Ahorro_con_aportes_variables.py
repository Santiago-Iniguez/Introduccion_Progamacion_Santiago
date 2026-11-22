# Ingresar cantidad de meses
N = int(input("Ingrese la cantidad de meses: "))

# Validar meses
if N > 0:
    # Inicializar variables
    saldo = 0
    mes = 1

    # Calcular ahorro mensual
    while mes <= N:
        aporte = float(input(f"Ingrese el aporte del mes {mes}: "))

        # Acumular aporte y aplicar interés
        saldo = saldo + aporte
        saldo = saldo * 1.008

        mes = mes + 1

    # Mostrar resultado
    print("El saldo final es: $", saldo)
else:
    print("La cantidad de meses debe ser mayor que cero")
