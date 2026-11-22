# Ingreso de datos
promedio = float(input("Promedio: "))
repro = int(input("Materias reprobadas: "))

# Validar datos
if promedio < 0 or promedio > 10 or repro < 0:
    print("Datos inválidos")
else:
    # Clasificar el nivel académico
    nivel = 4

    if promedio >= 9 and repro == 0:
        nivel = 1
    elif promedio >= 8 and repro <= 1:
        nivel = 2
    elif promedio >= 7:
        nivel = 3

    # Mostrar resultado según el nivel
    match nivel:
        case 1:
            print("Excelente - Continúa así")
        case 2:
            print("Bueno - Refuerza debilidades")
        case 3:
            print("Regular - Necesitas más estudio")
        case 4:
            print("En riesgo - Busca tutoría")