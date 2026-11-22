# Ingreso de datos
promedio = float(input("Promedio (0-10): "))
asistencia = float(input("Asistencia (%): "))
nivel = int(input("Nivel (1=Bajo, 2=Medio, 3=Alto): "))
# Validar datos
if not (0 <= promedio <= 10 and 0 <= asistencia <= 100 and 1 <= nivel <= 3):
    print("Datos inválidos")
else:
    # Inicializar beca
    beca = 0
    # Asignar beca según rendimiento y nivel
    if promedio >= 9 and asistencia >= 95:
        match nivel:
            case 1:
                beca = 100
            case 2:
                beca = 70
            case 3:
                beca = 40
    elif promedio >= 8 and asistencia >= 85:
        if nivel <= 2:
            beca = 50
        else:
            beca = 20
    elif promedio >= 7 and asistencia >= 75 and nivel == 1:
        beca = 25
    # Mostrar resultado
    print(f"Porcentaje de beca: {beca}%")
    if beca > 0:
        print("Sigue esforzándote")
    else:
        print("Puedes mejorar")