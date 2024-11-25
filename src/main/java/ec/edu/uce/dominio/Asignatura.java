package ec.edu.uce.dominio;

public class Asignatura {
    private String Nombre;
    private int IdAsignatura;

    // Constructor por defecto
    public Asignatura() {
        this.Nombre = null;
        this.IdAsignatura = 0;
    }

    // Constructor con parámetros
    public Asignatura(String Nombre, int IdAsignatura) {
        this.Nombre = Nombre;
        this.IdAsignatura = IdAsignatura;
    }

    // Getters y Setters
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getIdAsignatura() {
        return IdAsignatura;
    }
    public void setIdAsignatura(int IdAsignatura) {
        this.IdAsignatura = IdAsignatura;
    }

    // Métodos Crud
}

