package ec.edu.uce.dominio;

import java.util.Date;

public class Examen {
    private int IdExamen;
    private String Asignatura;
    private Date Fecha;
    private Pregunta[] Preguntas;
    private float Calificaciones;

    // Constructor por defecto
    public Examen() {
        this.IdExamen = 0;
        this.Asignatura = null;
        this.Fecha = new Date();
        this.Preguntas = new Pregunta[0];
        this.Calificaciones = 0;
    }

    // Constructor con parámetros
    public Examen(int IdExamen, String Asignatura, Date Fecha, Pregunta[] Preguntas, float Calificaciones) {
        this.IdExamen = IdExamen;
        this.Asignatura = Asignatura;
        this.Fecha = Fecha;
        this.Preguntas = Preguntas;
        this.Calificaciones = Calificaciones;
    }

    // Getters y Setters
    public int getIdExamen() {
        return IdExamen;
    }
    public void setIdExamen(int IdExamen) {
        this.IdExamen = IdExamen;
    }

    public String getAsignatura() {
        return Asignatura;
    }
    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public Date getFecha() {
        return Fecha;
    }
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Pregunta[] getPreguntas() {
        return Preguntas;
    }
    public void setPreguntas(Pregunta[] Preguntas) {
        this.Preguntas = Preguntas;
    }

    public float getCalificaciones() {
        return Calificaciones;
    }
    public void setCalificaciones(float Calificaciones) {
        this.Calificaciones = Calificaciones;
    }

    // Métodos Crud
}

