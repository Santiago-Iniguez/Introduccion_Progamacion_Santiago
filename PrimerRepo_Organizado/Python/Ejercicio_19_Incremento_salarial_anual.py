# Inicializar variables
salario = 1500
anio = 1
# Repetir durante 6 años
while anio <= 6:
    # Incrementar el salario un 10%
    salario = salario * 1.10
    # Mostrar el salario de cada año
    print("Salario del año", anio, ": $", round(salario, 2))
    # Incrementar el contador
    anio = anio + 1
# Mostrar el salario final
print("Salario final: $", round(salario, 2))
