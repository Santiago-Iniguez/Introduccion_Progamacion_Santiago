# Ingresar datos
distancia = float(input("Ingrese la distancia en km: "))
consumo = float(input("Ingrese el rendimiento en km por litro: "))
precio = float(input("Ingrese el precio por litro: "))
N = int(input("Ingrese la cantidad de peajes: "))

# Validar datos
if distancia >= 0 and consumo > 0 and precio >= 0 and N >= 0:
    costoPeajes = 0

    # Sumar costos de peajes
    for i in range(1, N + 1):
        costoPeaje = float(input("Ingrese el costo del peaje " + str(i) + ": "))
        costoPeajes = costoPeajes + costoPeaje

    # Calcular combustible y total
    litros = distancia / consumo
    costoCombustible = litros * precio
    total = costoCombustible + costoPeajes

    # Mostrar resultados
    print("Litros necesarios:", litros)
    print("Costo de combustible: $", costoCombustible)
    print("Costo de peajes: $", costoPeajes)
    print("Costo total del viaje: $", total)
else:
    print("Datos no válidos")