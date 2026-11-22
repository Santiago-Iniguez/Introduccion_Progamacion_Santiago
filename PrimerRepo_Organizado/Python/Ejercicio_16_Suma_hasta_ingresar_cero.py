# Inicializar la suma en cero
suma = 0
# Ingresar el primer numero
numero = int(input("Ingrese un numero (0 para terminar): "))
# Repetir mientras el numero sea diferente de cero
while numero != 0:
    # Acumular el numero ingresado
    suma = suma + numero
    # Solicitar otro numero
    numero = int(input("Ingrese otro numero (0 para terminar): "))
# Mostrar la suma total
print("La suma total es:", suma)
