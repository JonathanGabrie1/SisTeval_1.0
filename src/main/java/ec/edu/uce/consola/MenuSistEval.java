package ec.edu.uce.consola;
import java.util.Scanner;

public class MenuSistEval {

    private final Scanner teclado = new Scanner(System.in);
    private final SubMenuUsuario subMenuUsuario;
    private final SubMenuAsignatura subMenuAsignatura;
    private final SubMenuExamen subMenuExamen;
    private final SubMenuSesiones SubMenuSesiones;
    private final SubMenuPreguntas SubMenuPreguntas;
    private final SubMenuRespuestas SubMenuRespuestas;

    public MenuSistEval() {
        this.subMenuAsignatura = new SubMenuAsignatura();
        this.subMenuUsuario = new SubMenuUsuario();
        this.subMenuExamen = new SubMenuExamen();
        this.SubMenuSesiones = new SubMenuSesiones();
        this.SubMenuPreguntas = new SubMenuPreguntas();
        this.SubMenuRespuestas = new SubMenuRespuestas();
    }

    void MenuSistEval() {
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("             ¡SISTEVAL¡");
            System.out.println("====================================");
            System.out.println("¿que desea hacer hoy?");
            System.out.println("1. Gestionar Perfil");
            System.out.println("2. Gestionar Examen");
            System.out.println("3. Gestionar Asignatura");
            System.out.println("4. Gestionar Preguntas");
            System.out.println("5. Gestionar Respuestas");
            System.out.println("6. Gestionar Sesiones De Examen");
            System.out.println("7. salir");
            System.out.println("====================================");
            System.out.print("Seleccione una opción (1-7): ");

            while (!teclado.hasNextInt()) {
                System.out.println("Por favor ingrese un numero valido");
                teclado.next();
            }
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    subMenuUsuario.procesarOpcionUsuario();
                    break;
                case 2:
                    subMenuExamen.procesarOpcionExamen();
                    break;
                case 3:
                    subMenuAsignatura.procesarOpcionAsignatura();
                    break;
                case 4:
                    SubMenuPreguntas.procesarOpcionPreguntas();
                    break;
                case 5:
                    SubMenuRespuestas.procesarOpcionRespuestas();
                    break;
                case 6:
                    SubMenuSesiones.procesarOpcionSesion();
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 7);
    }

    public static void main(String[] args) {
        new MenuSistEval();
    }
}
