package ec.edu.uce.dominio;

public class Usuario {
    private String nombre;
    private String email;
    private String contraseña;
    private String tipoUsuario;
    private boolean sesionIniciada;

    // Constructor por defecto
    public Usuario() {
        this.nombre = null;
        this.email = null;
        this.contraseña = null;
        this.tipoUsuario = null;
    }

    // Constructor con parámetros
    public Usuario(String Nombre, String Email, String Contraseña, String tipoUsuario) {
        this.nombre = Nombre;
        this.email = Email;
        this.contraseña = Contraseña;
        this.tipoUsuario = tipoUsuario;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            throw new IllegalArgumentException("El email no tiene un formato válido.");
        }
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        if (contraseña == null || contraseña.length() < 8 || !contraseña.matches(".*\\d.*")) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres y contener un número.");
        }
        this.contraseña = contraseña;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        if (tipoUsuario == null || tipoUsuario.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de usuario no puede estar vacío.");
        }
        // Validación para tipos de usuario predefinidos
        if (!tipoUsuario.equals("Admin") && !tipoUsuario.equals("Estudiante") && !tipoUsuario.equals("Profesor") && !tipoUsuario.equals("Invitado")) {
            throw new IllegalArgumentException("Tipo de usuario inválido.");
        }
        this.tipoUsuario = tipoUsuario;
    }



    //validar la sesion
    public void iniciarSesion(String nombre, String contrasena) {
        // Simulación de verificación de credenciales
        if (this.nombre.equals(nombre) && this.contraseña.equals(contrasena)) {
            this.sesionIniciada = true;
            System.out.println("Sesion iniciada correctamente.");
        } else {
            System.out.println("Nombre de usuario o contrasena incorrectos.");
        }
    }
    // Método para validar usuario
    public boolean validarUsuario(String email, String contraseña) {
        return this.email.equals(email) && this.contraseña.equals(contraseña);
    }

    // metodo Crud

}

