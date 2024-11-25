import ec.edu.uce.dominio.Examen;
import ec.edu.uce.dominio.Pregunta;
import ec.edu.uce.dominio.Respuesta;

import java.util.Date;

public class TestExamen {

    public static void main(String[] args) {
        testConstructorPorDefecto();
        testConstructorConParametros();
        testSetters();
    }

    private static void testConstructorPorDefecto() {
        System.out.println("Prueba del constructor por defecto:");

        Examen examen = new Examen();

        if (examen.getIdExamen() == 0 &&
                examen.getAsignatura() == null &&
                examen.getFecha() != null &&
                examen.getPreguntas().length == 0 &&
                examen.getCalificaciones() == 0) {
            System.out.println("Constructor por defecto: PASADO");
        } else {
            System.out.println("Constructor por defecto: FALLIDO");
        }

        System.out.println();
    }

    private static void testConstructorConParametros() {
        System.out.println("Prueba del constructor con parámetros:");

        Pregunta[] preguntas = {
                new Pregunta(1, "¿Cuál es la capital de Francia?", "París"),
                new Pregunta(2, "¿Cuánto es 2 + 2?", "4")
        };
        Date fecha = new Date();

        Examen examen = new Examen(101, "Matemáticas", fecha, preguntas, 8.5f);

        boolean idCorrecto = examen.getIdExamen() == 101;
        boolean asignaturaCorrecta = examen.getAsignatura().equals("Matemáticas");
        boolean fechaCorrecta = examen.getFecha().equals(fecha);
        boolean preguntasCorrectas = examen.getPreguntas().length == 2 &&
                examen.getPreguntas()[0].getEnunciado().equals("¿Cuál es la capital de Francia?");
        boolean calificacionesCorrectas = examen.getCalificaciones() == 8.5f;

        if (idCorrecto && asignaturaCorrecta && fechaCorrecta && preguntasCorrectas && calificacionesCorrectas) {
            System.out.println("Constructor con parámetros: PASADO");
        } else {
            System.out.println("Constructor con parámetros: FALLIDO");
        }

        System.out.println();
    }

    private static void testSetters() {
        System.out.println("Prueba de setters:");

        Examen examen = new Examen();

        Pregunta[] nuevasPreguntas = {
                new Pregunta(3, "¿Cuál es la fórmula del agua?", "H2O"),
                new Pregunta(4, "¿Qué planeta es conocido como el planeta rojo?", "Marte")
        };
        Date nuevaFecha = new Date();

        examen.setIdExamen(202);
        examen.setAsignatura("Ciencias");
        examen.setFecha(nuevaFecha);
        examen.setPreguntas(nuevasPreguntas);
        examen.setCalificaciones(9.2f);

        boolean idCorrecto = examen.getIdExamen() == 202;
        boolean asignaturaCorrecta = examen.getAsignatura().equals("Ciencias");
        boolean fechaCorrecta = examen.getFecha().equals(nuevaFecha);
        boolean preguntasCorrectas = examen.getPreguntas().length == 2 &&
                examen.getPreguntas()[1].getEnunciado().equals("¿Qué planeta es conocido como el planeta rojo?");
        boolean calificacionesCorrectas = examen.getCalificaciones() == 9.2f;

        if (idCorrecto && asignaturaCorrecta && fechaCorrecta && preguntasCorrectas && calificacionesCorrectas) {
            System.out.println("Setters: PASADO");
        } else {
            System.out.println("Setters: FALLIDO");
        }

        System.out.println();
    }
}

