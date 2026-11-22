# Ejercicio 8: Promedio de tres notas

# Ingresar primera calificación
calificacion1 = float(input("Ingrese calificación 1: "))

# Validar primera calificación
while calificacion1 < 0 or calificacion1 > 10:
    print("Nota incorrecta, ingrese nuevamente")
    calificacion1 = float(input("Ingrese calificación 1: "))

# Ingresar segunda calificación
calificacion2 = float(input("Ingrese calificación 2: "))

# Validar segunda calificación
while calificacion2 < 0 or calificacion2 > 10:
    print("Nota incorrecta, ingrese nuevamente")
    calificacion2 = float(input("Ingrese calificación 2: "))

# Ingresar tercera calificación
calificacion3 = float(input("Ingrese calificación 3: "))

# Validar tercera calificación
while calificacion3 < 0 or calificacion3 > 10:
    print("Nota incorrecta, ingrese nuevamente")
    calificacion3 = float(input("Ingrese calificación 3: "))

# Calcular promedio
promedio = (calificacion1 + calificacion2 + calificacion3) / 3

# Mostrar resultado
print("El promedio de las tres notas es:", promedio)
