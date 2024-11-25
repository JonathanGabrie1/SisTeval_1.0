package ec.edu.uce.consola;
import java.util.Scanner;

public class SubMenuAsignatura {
    private final Scanner scanner = new Scanner(System.in);
    public void mostrarSubMenuAsignatura() {
        System.out.println("------------------------------");
        System.out.println("   Gestion de Asignaturas      ");
        System.out.println("------------------------------");
        System.out.println("1. Crear Asignatura");
        System.out.println("2. Modificar Asignatura");
        System.out.println("3. Eliminar Asignatura");
        System.out.println("4. Consultar Asignatura");
        System.out.println("5. Volver al Menu Principal");
        System.out.println("------------------------------");
        System.out.print("Ingresa la opcion deseada: ");
    }

    public void procesarOpcionAsignatura() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            mostrarSubMenuAsignatura();
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingrese un numero valido");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    //crearAsignatura();
                    break;
                case 2:
                    //modificarAsignatura();
                    break;
                case 3:
                    //eliminarAsignatura();
                    break;
                case 4:
                    //consultarAsignatura();
                    break;
                case 5:
                    System.out.println("Volviendo al Menu SistEval");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }
    //cruds
}
