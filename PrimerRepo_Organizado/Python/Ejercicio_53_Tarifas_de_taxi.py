# Ingresar datos
km = float(input("Ingrese los kilómetros recorridos: "))
noche = input("¿Es de noche? (S/N): ").upper()

# Validar distancia
if km >= 0:
    # Calcular tarifa base
    tarifa = 2 + (1.50 * km)

    # Aplicar recargo por distancia
    if km > 10:
        tarifa = tarifa * 1.20

    # Aplicar recargo nocturno
    if noche == "S":
        tarifa = tarifa * 1.30

    # Mostrar resultado
    print("Total a pagar: $", tarifa)
else:
    print("Los kilómetros no pueden ser negativos")