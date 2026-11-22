Algoritmo PlanMaterias()
Inicio
    // Declaración de variables
    Definir semestre, materias Como Entero
    Definir promedio Como Real
    // Ingreso de datos
    Escribir "Semestre actual (1-4): "
    Leer semestre
    Escribir "Promedio actual: "
    Leer promedio
    // Validar datos
    Si semestre < 1 O semestre > 4 O promedio < 0 O promedio > 10 Entonces
        Escribir "Datos inválidos"
    SiNo
        // Asignar materias según el semestre
        Segun semestre Hacer
            1, 2:
                materias <- 5
            3, 4:
                materias <- 4
        FinSegun
        // Ajustar materias según el promedio
        Si promedio >= 8.5 Entonces
            materias <- materias + 1
        SiNo
            Si promedio < 7 Entonces
                materias <- materias - 1
            FinSi
        FinSi
        // Establecer mínimo y máximo de materias
        Si materias < 3 Entonces
            materias <- 3
        FinSi
        Si materias > 6 Entonces
            materias <- 6
        FinSi
        // Mostrar resultado
        Escribir "Materias recomendadas: ", materias
    FinSi
FinAlgoritmo