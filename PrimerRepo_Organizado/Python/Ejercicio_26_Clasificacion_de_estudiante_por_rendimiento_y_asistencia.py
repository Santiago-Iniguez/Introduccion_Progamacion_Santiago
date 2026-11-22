# Ingresar datos
promedio = float(input("Ingrese el promedio (0 a 10): "))
asistencia = float(input("Ingrese el porcentaje de asistencia: "))

# Validar datos
if 0 <= promedio <= 10 and 0 <= asistencia <= 100:

    # Clasificar estudiante
    if promedio >= 9 and asistencia >= 90:
        categoria = "Excelente"
    elif promedio >= 7 and asistencia >= 80:
        categoria = "Bueno"
    elif promedio >= 6 and asistencia >= 70:
        categoria = "Regular"
    else:
        categoria = "Deficiente"

    # Mostrar resultado
    print("Categoría:", categoria)
else:
    print("Datos fuera del rango permitido")