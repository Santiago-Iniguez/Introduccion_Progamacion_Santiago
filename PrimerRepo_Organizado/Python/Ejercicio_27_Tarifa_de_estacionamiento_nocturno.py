# Ingresar datos
horas = float(input("Ingrese las horas de estacionamiento: "))
nocturno = input("¿Es horario nocturno? (S/N): ").upper()

# Validar horas
if horas > 0:
    # Calcular tarifa base
    tarifa = horas * 1.50

    # Aplicar recargo por tiempo
    if horas > 8:
        tarifa = tarifa * 1.25

    # Aplicar recargo nocturno
    if nocturno == "S":
        tarifa = tarifa * 1.30

    # Mostrar resultado
    total = tarifa
    print("Total a pagar: $", round(total, 2))
else:
    print("Las horas deben ser mayores que cero")