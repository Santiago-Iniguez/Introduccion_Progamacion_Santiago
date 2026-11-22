# Ingreso de datos
tipo = int(input("Tipo (1=Est, 2=Ind, 3=Emp, 4=Empresa): "))
ingreso = float(input("Ingreso anual: "))

# Inicializar impuesto
impuesto = 0.0

# Validar ingreso
if ingreso < 0:
    print("El ingreso no puede ser negativo")
else:
    # Calcular impuesto según el tipo de contribuyente
    match tipo:
        case 1:
            if ingreso >= 5000:
                impuesto = ingreso * 0.05

        case 2:
            impuesto = ingreso * 0.10

        case 3:
            impuesto = ingreso * 0.12
            if ingreso > 20000:
                impuesto += ingreso * 0.02

        case 4:
            impuesto = ingreso * 0.15

        case _:
            print("Tipo inválido")

    # Mostrar resultado
    if tipo in (1, 2, 3, 4):
        print(f"Impuesto a pagar: ${impuesto:.2f}")