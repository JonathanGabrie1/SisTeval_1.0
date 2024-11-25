package ec.edu.uce.consola;

import java.util.Scanner;

public class SubMenuPreguntas {
    private final Scanner scanner = new Scanner(System.in);
    public void mostrarSubMenuPreguntas() {
        System.out.println("------------------------------");
        System.out.println("     Gestion De Preguntas     ");
        System.out.println("------------------------------");
        System.out.println("1. Crear Preguntas");
        System.out.println("2. Modificar Preguntas");
        System.out.println("3. Eliminar Preguntas");
        System.out.println("4. Consultar Preguntas");
        System.out.println("5. Volver al Menu Principal");
        System.out.println("------------------------------");
        System.out.print("Ingresa la opcion deseada: ");
    }

    public void procesarOpcionPreguntas() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            mostrarSubMenuPreguntas();
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingrese un numero valido");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    //crearPreguntas();
                    break;
                case 2:
                    //editarPreguntas();
                    break;
                case 3:
                    //eliminarPreguntas();
                    break;
                case 4:
                    //ConsultarPreguntas();
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
    //metodos de sub menu
}
