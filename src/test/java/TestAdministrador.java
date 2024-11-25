import ec.edu.uce.dominio.*;

public class TestAdministrador {

    public static void main(String[] args) {
        testConstructorPorDefecto();
        testConstructorConParametros();
        testSetters();
        testIdAdministradorInvalido();
    }

    private static void testConstructorPorDefecto() {
        System.out.println("Prueba del constructor por defecto:");

        Administrador administrador = new Administrador();

        if (administrador.getNombre() == null &&
                administrador.getEmail() == null &&
                administrador.getContraseña() == null &&
                administrador.getTipoUsuario() == null &&
                administrador.getIdAdministrador() == 0) {
            System.out.println("Constructor por defecto: PASADO");
        } else {
            System.out.println("Constructor por defecto: FALLIDO");
        }

        System.out.println();
    }

    private static void testConstructorConParametros() {
        System.out.println("Prueba del constructor con parámetros:");

        Administrador administrador = new Administrador(
                "Ana López",
                "ana.lopez@example.com",
                "Ana2024*",
                "Administrador",
                1001
        );

        if (administrador.getNombre().equals("Ana López") &&
                administrador.getEmail().equals("ana.lopez@example.com") &&
                administrador.getContraseña().equals("Ana2024*") &&
                administrador.getTipoUsuario().equals("Administrador") &&
                administrador.getIdAdministrador() == 1001) {
            System.out.println("Constructor con parámetros: PASADO");
        } else {
            System.out.println("Constructor con parámetros: FALLIDO");
        }

        System.out.println();
    }

    private static void testSetters() {
        System.out.println("Prueba de setters:");

        Administrador administrador = new Administrador();
        administrador.setNombre("Carlos Morales");
        administrador.setEmail("carlos.morales@example.com");
        administrador.setContraseña("Carlos2024*");
        administrador.setTipoUsuario("Administrador");
        administrador.setIdAdministrador(1002);

        boolean nombreCorrecto = administrador.getNombre().equals("Carlos Morales");
        boolean emailCorrecto = administrador.getEmail().equals("carlos.morales@example.com");
        boolean contraseñaCorrecta = administrador.getContraseña().equals("Carlos2024*");
        boolean tipoUsuarioCorrecto = administrador.getTipoUsuario().equals("Administrador");
        boolean idCorrecto = administrador.getIdAdministrador() == 1002;

        if (nombreCorrecto && emailCorrecto && contraseñaCorrecta && tipoUsuarioCorrecto && idCorrecto) {
            System.out.println("Setters: PASADO");
        } else {
            System.out.println("Setters: FALLIDO");
        }

        System.out.println();
    }

    private static void testIdAdministradorInvalido() {
        System.out.println("Prueba de idAdministrador inválido:");

        Administrador administrador = new Administrador();
        boolean idInvalido = false;

        try {
            administrador.setIdAdministrador(-1); // Intentamos asignar un ID inválido
        } catch (IllegalArgumentException e) {
            idInvalido = true;
        }

        if (idInvalido) {
            System.out.println("IdAdministrador inválido: PASADO");
        } else {
            System.out.println("IdAdministrador inválido: FALLIDO");
        }

        System.out.println();
    }
}
