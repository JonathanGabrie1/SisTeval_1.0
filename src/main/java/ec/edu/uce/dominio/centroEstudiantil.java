package ec.edu.uce.dominio;


public class centroEstudiantil {
    private Usuario[] Usuarios;
    private Asignatura[] Asignaturas;
    private Examen[] Examenes;

    // Constructor por defecto
    public centroEstudiantil() {
        this.Usuarios = new Usuario[0];
        this.Asignaturas = new Asignatura[0];
        this.Examenes = new Examen[0];
    }

    // Constructor con parámetros
    public centroEstudiantil(Usuario[] Usuarios, Asignatura[] Asignaturas, Examen[] Examenes) {
        this.Usuarios = Usuarios;
        this.Asignaturas = Asignaturas;
        this.Examenes = Examenes;
    }

    // Getters y Setters
    public Usuario[] getUsuarios() {
        return Usuarios;
    }
    public void setUsuarios(Usuario[] Usuarios) {
        this.Usuarios = Usuarios;
    }

    public Asignatura[] getAsignaturas() {
        return Asignaturas;
    }
    public void setAsignaturas(Asignatura[] Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

    public Examen[] getExamenes() {
        return Examenes;
    }
    public void setExamenes(Examen[] Examenes) {
        this.Examenes = Examenes;
    }

}

