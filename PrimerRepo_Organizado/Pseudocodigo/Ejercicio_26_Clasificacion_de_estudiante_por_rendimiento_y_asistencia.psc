Algoritmo ClasificacionEstudiante()
Inicio
    // Declarar variables
    Definir promedio, asistencia Como Real
    Definir categoria Como Cadena

    // Ingresar datos
    Escribir "Ingrese el promedio (0 a 10):"
    Leer promedio
    Escribir "Ingrese el porcentaje de asistencia:"
    Leer asistencia

    // Validar datos
    Si (promedio >= 0 Y promedio <= 10 Y asistencia >= 0 Y asistencia <= 100) Entonces

        // Clasificar estudiante
        Si (promedio >= 9 Y asistencia >= 90) Entonces
            categoria <- "Excelente"
        SiNo
            Si (promedio >= 7 Y asistencia >= 80) Entonces
                categoria <- "Bueno"
            SiNo
                Si (promedio >= 6 Y asistencia >= 70) Entonces
                    categoria <- "Regular"
                SiNo
                    categoria <- "Deficiente"
                FinSi
            FinSi
        FinSi

        // Mostrar resultado
        Escribir "Categoría: ", categoria
    SiNo
        Escribir "Datos fuera del rango permitido"
    FinSi
Fin