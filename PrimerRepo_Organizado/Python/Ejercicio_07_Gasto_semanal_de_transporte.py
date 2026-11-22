# Declaracion de variables e ingreso de datos
# Ingresar la cantidad de viajes por dia
viajesDia = int(input("Ingrese viajes por dia: "))
# Ingresar los dias que viaja
diasSemana = int(input("Ingrese cuantos dias viaja: "))
# Ingresar el costo del pasaje
pasaje = float(input("Ingrese costo del pasaje: "))
# Calcular el gasto total de transporte
gastoTotal = viajesDia * diasSemana * pasaje
# Mostrar el resultado
print("El gasto total es:", gastoTotal)
