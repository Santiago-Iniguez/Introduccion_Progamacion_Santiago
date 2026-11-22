Algoritmo suma_mediaAritmetica()
Inicio
    // Declarar variables
    Definir dato1, dato2, dato3, dato4, suma, producto Como Entero
    Definir mediaAritmetica Como Real

    // Ingresar datos
    Escribir "Ingrese dato 1"
    Leer dato1
    Escribir "Ingrese dato 2"
    Leer dato2
    Escribir "Ingrese dato 3"
    Leer dato3
    Escribir "Ingrese dato 4"
    Leer dato4

    // Calcular suma, producto y media
    suma <- dato1 + dato2 + dato3 + dato4
    producto <- dato1 * dato2 * dato3 * dato4
    mediaAritmetica <- suma / 4

    // Mostrar resultados
    Escribir "La suma es: ", suma
    Escribir "El producto es: ", producto
    Escribir "La media aritmética es: ", mediaAritmetica
Fin