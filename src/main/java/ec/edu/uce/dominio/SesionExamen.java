package ec.edu.uce.dominio;

public class SesionExamen {
    private float Calificacion;
    private int IdSesion;
    private Examen examen;
    private Estudiante[] Estudiantes;

    // Constructor por defecto
    public SesionExamen() {
        this.Calificacion = 0;
        this.IdSesion = 0;
        this.examen = new Examen();
        this.Estudiantes = new Estudiante[0];
    }

    // Constructor con parámetros
    public SesionExamen(float Calificacion, int IdSesion, Examen examen, Estudiante[] Estudiantes) {
        this.Calificacion = Calificacion;
        this.IdSesion = IdSesion;
        this.examen = examen;
        this.Estudiantes = Estudiantes;
    }

    // Getters y Setters
    public float getCalificacion() {
        return Calificacion;
    }
    public void setCalificacion(float Calificacion) {
        this.Calificacion = Calificacion;
    }

    public int getIdSesion() {
        return IdSesion;
    }
    public void setIdSesion(int IdSesion) {
        this.IdSesion = IdSesion;
    }

    public Examen getExamen() {
        return examen;
    }
    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public Estudiante[] getEstudiantes() {
        return Estudiantes;
    }
    public void setEstudiantes(Estudiante[] Estudiantes) {
        this.Estudiantes = Estudiantes;
    }

}
