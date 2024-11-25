package ec.edu.uce.dominio;

import java.util.HashSet;

public class Respuesta {

    // Atributos
    private String respuesta;
    private boolean esCorrecta;

    // Constructor por defecto
    public Respuesta() {
        this.respuesta = null;
        this.esCorrecta = false;
    }

    // Constructor con parámetros
    public Respuesta(String respuesta, boolean esCorrecta) {
        this.respuesta = respuesta;
        this.esCorrecta = esCorrecta;
    }

    // Getters y Setters
    public String getRespuestaTexto() {
        return respuesta;
    }
    public void setRespuestaTexto(String RespuestaTexto) {
        this.respuesta = respuesta;
    }

    public boolean getEsCorrecta() {
        return esCorrecta;
    }
    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

    // Método Crud
}
