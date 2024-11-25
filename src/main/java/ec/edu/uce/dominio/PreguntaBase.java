package ec.edu.uce.dominio;

public class PreguntaBase {
    private int IdPreguntaBase;
    private Pregunta Pregunta;
    private Respuesta[] Respuestas;

    // Constructor por defecto
    public PreguntaBase() {
        this.IdPreguntaBase = 0;
        this.Pregunta = new Pregunta();
        this.Respuestas = new Respuesta[0];
    }

    // Constructor con parámetros
    public PreguntaBase(int IdPreguntaBase, Pregunta Pregunta, Respuesta[] Respuestas) {
        this.IdPreguntaBase = IdPreguntaBase;
        this.Pregunta = Pregunta;
        this.Respuestas = Respuestas;
    }

    // Getters y Setters
    public int getIdPreguntaBase() {
        return IdPreguntaBase;
    }
    public void setIdPreguntaBase(int IdPreguntaBase) {
        this.IdPreguntaBase = IdPreguntaBase;
    }

    public Pregunta getPregunta() {
        return Pregunta;
    }
    public void setPregunta(Pregunta Pregunta) {
        this.Pregunta = Pregunta;
    }

    public Respuesta[] getRespuestas() {
        return Respuestas;
    }
    public void setRespuestas(Respuesta[] Respuestas) {
        this.Respuestas = Respuestas;
    }

}

