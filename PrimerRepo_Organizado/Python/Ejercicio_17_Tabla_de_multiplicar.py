# Ingresar un numero entero
K = int(input("Ingrese un numero entero: "))
# Inicializar el contador
i = 1
# Repetir mientras i sea menor o igual a 10
while i <= 10:
    # Calcular la multiplicacion
    resultado = K * i
    # Mostrar el resultado
    print(K, "x", i, "=", resultado)
    # Incrementar el contador
    i = i + 1
