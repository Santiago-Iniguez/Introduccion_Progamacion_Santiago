Algoritmo MenorDeTres()
Inicio
    // Declarar variables
    Definir num1, num2, num3, menor Como Real

    // Ingresar los tres números
    Escribir "Ingrese el primer número:"
    Leer num1
    Escribir "Ingrese el segundo número:"
    Leer num2
    Escribir "Ingrese el tercer número:"
    Leer num3

    // Determinar el número menor
    Si (num1 <= num2 Y num1 <= num3) Entonces
        menor <- num1
    SiNo
        Si (num2 <= num1 Y num2 <= num3) Entonces
            menor <- num2
        SiNo
            menor <- num3
        FinSi
    FinSi

    // Mostrar resultado
    Escribir "El menor de los tres números es: ", menor
Fin