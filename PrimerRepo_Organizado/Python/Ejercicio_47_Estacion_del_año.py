# Ingresar datos
mes = int(input("Ingrese el número del mes (1-12): "))
dia = int(input("Ingrese el día: "))

# Determinar días del mes
if mes in (1, 3, 5, 7, 8, 10, 12):
    maxDias = 31
elif mes in (4, 6, 9, 11):
    maxDias = 30
elif mes == 2:
    maxDias = 29
else:
    maxDias = 0

# Validar fecha
if mes < 1 or mes > 12 or dia < 1 or dia > maxDias:
    print("Fecha no válida")
else:
    # Determinar estación
    if mes in (12, 1, 2):
        print("Verano")
    elif mes in (3, 4, 5):
        print("Otoño")
    elif mes in (6, 7, 8):
        print("Invierno")
    else:
        print("Primavera")