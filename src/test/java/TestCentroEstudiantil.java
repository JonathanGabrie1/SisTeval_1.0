import ec.edu.uce.dominio.*;

public class TestCentroEstudiantil {

    public static void main(String[] args) {
        testConstructorPorDefecto();
        testConstructorConParametros();
        testSetters();
    }

    private static void testConstructorPorDefecto() {
        System.out.println("Prueba del constructor por defecto:");

        centroEstudiantil centro = new centroEstudiantil();

        if (centro.getUsuarios().length == 0 &&
                centro.getAsignaturas().length == 0 &&
                centro.getExamenes().length == 0) {
            System.out.println("Constructor por defecto: PASADO");
        } else {
            System.out.println("Constructor por defecto: FALLIDO");
        }

        System.out.println();
    }

    private static void testConstructorConParametros() {
        System.out.println("Prueba del constructor con parámetros:");

        Usuario[] usuarios = {new Usuario("Juan", "juan@example.com", "123456", "Estudiante")};
        Asignatura[] asignaturas = {new Asignatura("Matemáticas", 101)};

        centroEstudiantil centro = new centroEstudiantil();

        boolean usuariosCorrectos = centro.getUsuarios().length == 1 &&
                centro.getUsuarios()[0].getNombre().equals("Juan");
        boolean asignaturasCorrectas = centro.getAsignaturas().length == 1 &&
                centro.getAsignaturas()[0].getNombre().equals("Matemáticas");

        if (usuariosCorrectos && asignaturasCorrectas) {
            System.out.println("Constructor con parámetros: PASADO");
        } else {
            System.out.println("Constructor con parámetros: FALLIDO");
        }

        System.out.println();
    }

    private static void testSetters() {
        System.out.println("Prueba de setters:");

        centroEstudiantil centro = new centroEstudiantil();

        Usuario[] usuarios = {new Usuario("Ana", "ana@example.com", "password123", "Docente")};
        Asignatura[] asignaturas = {new Asignatura("Física", 102)};

        centro.setUsuarios(usuarios);
        centro.setAsignaturas(asignaturas);

        boolean usuariosCorrectos = centro.getUsuarios().length == 1 &&
                centro.getUsuarios()[0].getNombre().equals("Ana");
        boolean asignaturasCorrectas = centro.getAsignaturas().length == 1 &&
                centro.getAsignaturas()[0].getNombre().equals("Física");

        if (usuariosCorrectos && asignaturasCorrectas ) {
            System.out.println("Setters: PASADO");
        } else {
            System.out.println("Setters: FALLIDO");
        }

        System.out.println();
    }
}


