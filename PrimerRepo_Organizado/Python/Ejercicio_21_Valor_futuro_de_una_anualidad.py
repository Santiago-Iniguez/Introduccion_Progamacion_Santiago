# Ingresar datos
depositoMensual = float(input("Ingrese depósito mensual: "))
tasaMensual = float(input("Ingrese tasa mensual: "))
meses = int(input("Ingrese número de meses: "))

# Calcular total depositado
totalDepositado = depositoMensual * meses

# Calcular valor futuro
if tasaMensual == 0:
    valorFuturo = totalDepositado
else:
    valorFuturo = depositoMensual * (((1 + tasaMensual)**meses - 1) / tasaMensual)

# Mostrar resultados
print("El valor total depositado es:", totalDepositado)
print("El valor futuro es:", valorFuturo)