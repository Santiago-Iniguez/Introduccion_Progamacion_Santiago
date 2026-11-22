# Inicializar variables
suma = 0
i = 1
# Ingresar cantidad de notas
N = int(input("Ingrese la cantidad de notas: "))
# Validar que la cantidad sea mayor que cero
if N > 0:
    # Repetir mientras i sea menor o igual a N
    while i <= N:
        # Ingresar la nota
        nota = float(input(f"Ingrese la nota {i}: "))
        # Acumular las notas
        suma = suma + nota
        # Incrementar el contador
        i = i + 1
    # Calcular el promedio
    promedio = suma / N
    # Mostrar los resultados
    print("La suma de las notas es:", suma)
    print("El promedio es:", promedio)
else:
    # Mostrar mensaje de error
    print("La cantidad de notas debe ser mayor que cero")
