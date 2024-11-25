import ec.edu.uce.dominio.Estudiante;
import ec.edu.uce.dominio.Examen;
import ec.edu.uce.dominio.Respuesta;
import ec.edu.uce.dominio.SesionExamen;

import java.util.HashSet;

public class TestRespuesta {

    public static void main(String[] args) {
        testConstructorPorDefecto();
        testConstructorConParametros();
        testSetters();
    }

    private static void testConstructorPorDefecto() {
        System.out.println("Prueba del constructor por defecto:");

        Respuesta respuesta = new Respuesta();

        if (respuesta.getRespuestaTexto() == null &&
                respuesta.getEsCorrecta() == false) {
            System.out.println("Constructor por defecto: PASADO");
        } else {
            System.out.println("Constructor por defecto: FALLIDO");
        }

        System.out.println();
    }

    private static void testConstructorConParametros() {
        System.out.println("Prueba del constructor con parámetros:");

        Respuesta respuesta = new Respuesta("Madrid", true);

        if (respuesta.getRespuestaTexto().equals("Madrid") &&
                respuesta.getEsCorrecta() == true) {
            System.out.println("Constructor con parámetros: PASADO");
        } else {
            System.out.println("Constructor con parámetros: FALLIDO");
        }

        System.out.println();
    }

    private static void testSetters() {
        System.out.println("Prueba de setters:");

        Respuesta respuesta = new Respuesta();
        respuesta.setRespuestaTexto("Barcelona");
        respuesta.setEsCorrecta(false);

        if (respuesta.getRespuestaTexto().equals("Barcelona") &&
                respuesta.getEsCorrecta() == false) {
            System.out.println("Setters: PASADO");
        } else {
            System.out.println("Setters: FALLIDO");
        }

        System.out.println();
    }
}
