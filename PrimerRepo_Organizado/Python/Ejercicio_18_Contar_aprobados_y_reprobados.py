# Inicializar contadores
aprobados = 0
reprobados = 0
i = 1
# Ingresar cantidad de estudiantes
N = int(input("Ingrese la cantidad de estudiantes: "))
# Repetir mientras i sea menor o igual a N
while i <= N:
    # Ingresar nota del estudiante
    nota = float(input(f"Ingrese la nota del estudiante {i}: "))
    # Verificar si el estudiante aprobo
    if nota >= 7:
        aprobados = aprobados + 1
    # Si no aprobo, contar como reprobado
    else:
        reprobados = reprobados + 1
    # Incrementar el contador
    i = i + 1
# Mostrar los resultados
print("Cantidad de aprobados:", aprobados)
print("Cantidad de reprobados:", reprobados)
