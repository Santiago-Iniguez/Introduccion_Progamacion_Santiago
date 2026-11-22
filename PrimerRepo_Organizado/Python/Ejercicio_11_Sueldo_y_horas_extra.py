# Declaracion de variables e ingreso de datos
# Ingresar las horas trabajadas
horas = float(input("Ingrese horas trabajadas: "))
# Ingresar el pago por hora
pagoHora = float(input("Ingrese pago por horas: "))
# Calcular sueldo si trabaja 40 horas o menos
if horas <= 40:
    sueldo = horas * pagoHora
# Calcular sueldo si trabaja mas de 40 horas
if horas > 40:
    sueldo = (40 * pagoHora) + ((horas - 40) * pagoHora * 2)
# Mostrar el sueldo semanal
print("El sueldo semanal es:", sueldo)
