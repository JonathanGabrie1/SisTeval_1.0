package ec.edu.uce.dominio;

public class Docente extends Usuario {
    private String Asignatura;
    private Examen[] ExamenesCreados;

    // Constructor por defecto
    public Docente() {
        super();
        this.Asignatura = null;
        this.ExamenesCreados = new Examen[0];
    }

    // Constructor con parámetros
    public Docente(String Nombre, String Email, String Contraseña, String tipoUsuario, String Asignatura, Examen[] ExamenesCreados) {
        super(Nombre, Email, Contraseña, tipoUsuario);
        this.Asignatura = Asignatura;
        this.ExamenesCreados = ExamenesCreados;
    }

    // Getters y Setters
    public String getAsignatura() {
        return Asignatura;
    }
    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public Examen[] getExamenesCreados() {
        return ExamenesCreados;
    }
    public void setExamenesCreados(Examen[] ExamenesCreados) {
        this.ExamenesCreados = ExamenesCreados;
    }

    // Métodos Crud + agregar calificacion
}

