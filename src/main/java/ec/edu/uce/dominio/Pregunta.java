package ec.edu.uce.dominio;

import java.util.HashSet;

public class Pregunta {
    private String Enunciado;
    private Respuesta[] Respuestas;

    // Constructor por defecto
    public Pregunta() {
        this.Enunciado = null;
        this.Respuestas = new Respuesta[0];
    }

    // Constructor con parámetros
    public Pregunta(String Enunciado, Respuesta[] Respuestas) {
        this.Enunciado = Enunciado;
        this.Respuestas = Respuestas;
    }

    // Getters y Setters
    public String getEnunciado() {
        return Enunciado;
    }
    public void setEnunciado(String Enunciado) {
        this.Enunciado = Enunciado;
    }

    public Respuesta[] getRespuestas() {
        return Respuestas;
    }
    public void setRespuestas(Respuesta[] Respuestas) {
        this.Respuestas = Respuestas;
    }

    // Método Crud
}

