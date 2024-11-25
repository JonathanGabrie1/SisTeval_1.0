import ec.edu.uce.dominio.Asignatura;
import ec.edu.uce.dominio.Docente;
import ec.edu.uce.dominio.Examen;

public class TestDocente {

    public static void main(String[] args) {
        testConstructorPorDefecto();
        testConstructorConParametros();
        testSetters();
    }

    private static void testConstructorPorDefecto() {
        System.out.println("Prueba del constructor por defecto:");

        Docente docente = new Docente();

        if (docente.getNombre() == null &&
                docente.getEmail() == null &&
                docente.getContraseña() == null &&
                docente.getTipoUsuario() == null &&
                docente.getAsignatura() == null &&
                docente.getExamenesCreados().length == 0) {
            System.out.println("Constructor por defecto: PASADO");
        } else {
            System.out.println("Constructor por defecto: FALLIDO");
        }

        System.out.println();
    }

    private static void testConstructorConParametros() {
        System.out.println("Prueba del constructor con parámetros:");

        Examen[] examenes = {
                new Examen("Examen Parcial", new Asignatura("Matemáticas", 101)),
                new Examen("Examen Final", new Asignatura("Matemáticas", 101))
        };

        Docente docente = new Docente(
                "Carlos Ramírez",
                "carlos.ramirez@example.com",
                "Carlos2024*",
                "Docente",
                "Matemáticas",
                examenes
        );

        boolean nombreCorrecto = docente.getNombre().equals("Carlos Ramírez");
        boolean emailCorrecto = docente.getEmail().equals("carlos.ramirez@example.com");
        boolean contraseñaCorrecta = docente.getContraseña().equals("Carlos2024*");
        boolean tipoUsuarioCorrecto = docente.getTipoUsuario().equals("Docente");
        boolean asignaturaCorrecta = docente.getAsignatura().equals("Matemáticas");

        if (nombreCorrecto && emailCorrecto && contraseñaCorrecta && tipoUsuarioCorrecto && asignaturaCorrecta) {
            System.out.println("Constructor con parámetros: PASADO");
        } else {
            System.out.println("Constructor con parámetros: FALLIDO");
        }

        System.out.println();
    }

    private static void testSetters() {
        System.out.println("Prueba de setters:");

        Docente docente = new Docente();

        Examen[] nuevosExamenes = {
                new Examen("Quiz 1", new Asignatura("Física", 102)),
                new Examen("Proyecto Final", new Asignatura("Física", 102))
        };

        docente.setNombre("Ana López");
        docente.setEmail("ana.lopez@example.com");
        docente.setContraseña("Ana12345*");
        docente.setTipoUsuario("Docente");
        docente.setAsignatura("Física");
        docente.setExamenesCreados(nuevosExamenes);

        boolean nombreCorrecto = docente.getNombre().equals("Ana López");
        boolean emailCorrecto = docente.getEmail().equals("ana.lopez@example.com");
        boolean contraseñaCorrecta = docente.getContraseña().equals("Ana12345*");
        boolean tipoUsuarioCorrecto = docente.getTipoUsuario().equals("Docente");
        boolean asignaturaCorrecta = docente.getAsignatura().equals("Física");

        if (nombreCorrecto && emailCorrecto && contraseñaCorrecta && tipoUsuarioCorrecto && asignaturaCorrecta) {
            System.out.println("Setters: PASADO");
        } else {
            System.out.println("Setters: FALLIDO");
        }

        System.out.println();
    }
}
