# Ingreso de datos
edad = int(input("Ingrese la edad: "))
estudiante = input("¿Es estudiante? (S/N): ").upper()
horario_pico = input("¿Es horario pico? (S/N): ").upper()
tarifa_base = float(input("Ingrese la tarifa base: "))

# Validar datos
if edad < 0 or tarifa_base < 0:
    print("Datos inválidos")
else:
    # Inicializar tarifa
    tarifa_final = tarifa_base

    # Aplicar gratuidad por edad
    if edad < 5 or edad >= 65:
        tarifa_final = 0

    # Aplicar descuento estudiantil
    elif estudiante == "S" and horario_pico == "N":
        tarifa_final = tarifa_base * 0.80

    # Mostrar resultado
    print(f"Tarifa final: ${tarifa_final:.2f}")