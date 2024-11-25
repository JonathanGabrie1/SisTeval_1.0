package ec.edu.uce.dominio;

import java.util.HashSet;

public class Estudiante extends Usuario {
    private String Matricula;
    private int Calificacion;
    private Asignatura[] Asignaturas;

    // Constructor por defecto
    public Estudiante() {
        super();
        this.Matricula = null;
        this.Calificacion =0;
        this.Asignaturas = new Asignatura[0];
    }

    // Constructor con parámetros
    public Estudiante(String Nombre, String Email, String Contraseña, String tipoUsuario, String Matricula, int Calificacion, Asignatura[] Asignaturas) {
        super(Nombre, Email, Contraseña, tipoUsuario);
        this.Matricula = Matricula;
        this.Calificacion = Calificacion;
        this.Asignaturas = Asignaturas;
    }

    // Getters y Setters
    public String getMatricula() {
        return Matricula;
    }
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public int getCalificacion() {
        return Calificacion;
    }
    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    public Asignatura[] getAsignaturas() {
        return Asignaturas;
    }
    public void setAsignaturas(Asignatura[] Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

}

