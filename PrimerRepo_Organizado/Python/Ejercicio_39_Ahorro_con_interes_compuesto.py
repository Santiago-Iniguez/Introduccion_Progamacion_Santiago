# Ingresar datos
capital = float(input("Ingrese el capital inicial: "))
deposito = float(input("Ingrese el depósito mensual: "))
N = int(input("Ingrese la cantidad de meses: "))
tasa = float(input("Ingrese la tasa mensual en porcentaje: "))

# Inicializar saldo
saldo = capital

# Calcular ahorro mensual
for mes in range(1, N + 1):
    saldo = (saldo + deposito) * (1 + tasa / 100)
    print("Saldo del mes", mes, ": $", saldo)

# Mostrar resultado
print("Saldo final: $", saldo)