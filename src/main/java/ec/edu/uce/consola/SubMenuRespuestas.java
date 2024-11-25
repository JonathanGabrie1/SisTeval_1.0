package ec.edu.uce.consola;

import java.util.Scanner;

public class SubMenuRespuestas {
    private final Scanner scanner = new Scanner(System.in);
    public void mostrarSubMenuRespuestas() {
        System.out.println("------------------------------");
        System.out.println("    Gestion De Respuestas     ");
        System.out.println("------------------------------");
        System.out.println("1. Crear Respuestas");
        System.out.println("2. Modificar Respuestas");
        System.out.println("3. Eliminar Respuestas");
        System.out.println("4. Consultar Respuestas");
        System.out.println("5. Volver al Menu Principal");
        System.out.println("------------------------------");
        System.out.print("Ingresa la opcion deseada: ");
    }

    public void procesarOpcionRespuestas() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            mostrarSubMenuRespuestas();
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingrese un numero valido");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    //crearRespuestas();
                    break;
                case 2:
                    //editarRespuestas();
                    break;
                case 3:
                    //EliminarRespuestas();
                    break;
                case 4:
                    //consultarRespuestas();
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
