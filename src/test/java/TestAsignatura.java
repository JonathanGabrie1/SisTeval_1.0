import ec.edu.uce.dominio.Asignatura;

public class TestAsignatura {

    public static void main(String[] args) {
        testConstructorConParametros();
        testSetters();
//        testCrearAsignatura();
//        testEditarAsignatura();
//        testEliminarAsignatura();
//        testConsultarAsignatura();
    }

    private static void testConstructorConParametros() {
        System.out.println("Prueba del constructor con parámetros:");

        Asignatura asignatura = new Asignatura("Matemáticas Discretas", 101);

        if (asignatura.getNombre().equals("Matemáticas Discretas") &&
                asignatura.getIdAsignatura() == 101) {
            System.out.println("Constructor con parámetros: PASADO");
        } else {
            System.out.println("Constructor con parámetros: FALLIDO");
        }

        System.out.println();
    }

    private static void testSetters() {
        System.out.println("Prueba de setters:");

        Asignatura asignatura = new Asignatura("Física", 102);

        // Probamos los setters
        asignatura.setNombre("Programación");
        asignatura.setIdAsignatura(103);

        boolean nombreCorrecto = asignatura.getNombre().equals("Programación");
        boolean idCorrecto = asignatura.getIdAsignatura() == 103;

        if (nombreCorrecto && idCorrecto) {
            System.out.println("Setters: PASADO");
        } else {
            System.out.println("Setters: FALLIDO");
        }

        System.out.println();
    }

//    private static void testCrearAsignatura() {
//        System.out.println("Prueba de crear asignatura:");
//
//        Asignatura asignatura = new Asignatura();
//        asignatura.crearAsignatura("Historia", 104);
//
//        if (asignatura.getNombre().equals("Historia") &&
//                asignatura.getIdAsignatura() == 104) {
//            System.out.println("Crear asignatura: PASADO");
//        } else {
//            System.out.println("Crear asignatura: FALLIDO");
//        }
//
//        System.out.println();
//    }
//
//    private static void testEditarAsignatura() {
//        System.out.println("Prueba de editar asignatura:");
//
//        Asignatura asignatura = new Asignatura("Geografía", 105);
//        asignatura.editarAsignatura("Literatura");
//
//        if (asignatura.getNombre().equals("Literatura")) {
//            System.out.println("Editar asignatura: PASADO");
//        } else {
//            System.out.println("Editar asignatura: FALLIDO");
//        }
//
//        System.out.println();
//    }
//
//    private static void testEliminarAsignatura() {
//        System.out.println("Prueba de eliminar asignatura:");
//
//        Asignatura asignatura = new Asignatura("Arte", 106);
//        asignatura.eliminarAsignatura();
//
//        if (asignatura.getNombre() == null && asignatura.getIdAsignatura() == 0) {
//            System.out.println("Eliminar asignatura: PASADO");
//        } else {
//            System.out.println("Eliminar asignatura: FALLIDO");
//        }
//
//        System.out.println();
//    }
//
//    private static void testConsultarAsignatura() {
//        System.out.println("Prueba de consultar asignatura:");
//
//        Asignatura asignatura = new Asignatura("Analisis", 107);
//        String resultadoEsperado = "Asignatura: Analisis, ID: 107";
//        String resultadoConsulta = asignatura.consultarAsignatura();
//
//        if (resultadoConsulta.equals(resultadoEsperado)) {
//            System.out.println("Consultar asignatura: PASADO");
//        } else {
//            System.out.println("Consultar asignatura: FALLIDO");
//        }
//
//        asignatura.eliminarAsignatura();
//        resultadoConsulta = asignatura.consultarAsignatura();
//
//        if (resultadoConsulta.equals("La asignatura no existe.")) {
//            System.out.println("Consultar asignatura después de eliminar: PASADO");
//        } else {
//            System.out.println("Consultar asignatura después de eliminar: FALLIDO");
//        }
//
//        System.out.println();
    }
