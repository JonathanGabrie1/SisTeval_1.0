package ec.edu.uce.consola;
import ec.edu.uce.dominio.centroEstudiantil;
import ec.edu.uce.dominio.Usuario;
import ec.edu.uce.util.Validacion;
import java.util.Scanner;

public class  SubMenuUsuario {
    private final Scanner scanner = new Scanner(System.in);
    public void mostrarSubMenuUsuario() {
        System.out.println("------------------------------");
        System.out.println("       MENU DE USUARIO        ");
        System.out.println("------------------------------");
        System.out.println("1. Crear Usuario");
        System.out.println("2. Modificar Usuario");
        System.out.println("3. Eliminar Usuario");
        System.out.println("4. Consultar Usuario");
        System.out.println("5. Volver al Menu Principal");
        System.out.println("------------------------------");
        System.out.print("Ingresa la opcion deseada: ");
    }

    public void procesarOpcionUsuario() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do {
            mostrarSubMenuUsuario();
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingrese un numero valido");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    //crearNuevoUsuario();
                    break;
                case 2:
                    //modificarUsuario();
                    break;
                case 3:
                    //eliminarUsuario();
                    break;
                case 4:
                    //ConsultarUsuario();
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

//    /**
//     * Método para crear un nuevo usuario.
//     */
//    void crearNuevoUsuario() {
//        System.out.println("------------------------------");
//        System.out.println("        CREAR USUARIO         ");
//        System.out.println("------------------------------");
//        String nombreUsuario;
//        do {
//            System.out.print("Ingrese el nombre de usuario: ");
//            nombreUsuario = scanner.nextLine();
//            if (!Validacion.validarNombres(nombreUsuario)) {
//                System.out.println("Nombre de usuario invalido. Debe tener entre 5 y 20 caracteres y solo puede contener letras, numeros y espacios.");
//            }
//        } while (!Validacion.validarNombres(nombreUsuario));
//
//        String contrasena;
//        do {
//            System.out.print("Ingrese la contrasena: ");
//            contrasena = scanner.nextLine();
//            if (!Validacion.validarContrasena(contrasena)) {
//                System.out.println("Contrasena invalida. Debe tener al menos 6 caracteres y contener al menos un numero y una letra.");
//            }
//        } while (!Validacion.validarContrasena(contrasena));
//
//        String correoElectronico;
//        do {
//            System.out.print("Ingrese el correo electronico: ");
//            correoElectronico = scanner.nextLine();
//            if (!Validacion.validarCorreoElectronico(correoElectronico)) {
//                System.out.println("Correo electronico invalido.");
//            }
//        } while (!Validacion.validarCorreoElectronico(correoElectronico));
//
//
//        // Crear un nuevo usuario con los datos proporcionados
//        Usuario nuevoUsuario = new Usuario(nombreUsuario, contrasena, correoElectronico);
//        centroEstudiantil.agregarUsuario(nuevoUsuario);
//        System.out.println("Usuario creado exitosamente");
//    }
//
//    /**
//     * Método para consulta de usuario
//     */
//    private void consultarUsuario() {
//        System.out.println("------------------------------");
//        System.out.println("    CONSULTAR USUARIO         ");
//        System.out.println("------------------------------");
//        System.out.println("Ingresa el nombre a consultar;");
//        System.out.println("2. Volver al Menu de Rutas");
//        System.out.print("Ingresa el numero: ");
//        int opcion = scanner.nextInt();
//        scanner.nextLine(); // Consumir el salto de línea pendiente
//        switch (opcion) {
//            case 1:
//                consultarUsuarioNombre();
//                break;
//            case 2:
//                mostrarSubMenuUsuario();
//                break;
//            default:
//                System.out.println("Opcion no valida");
//                consultarUsuario();
//    }
//
//    /**
//     * Método para consultar un usuario por nombre
//     */
//    private void consultarUsuarioNombre() {
//        System.out.print("Ingresa el nombre del usuario a consultar: ");
//        String nombre = scanner.nextLine();
//        String infoUsuario = centroEstudiantil.consultarUsuarioNombre(nombre);
//        System.out.println(infoUsuario);
//    }
//
//    /**
//     * Método para modificar un usuario existente.
//     */
//    private void modificarUsuario() {
//        System.out.println("------------------------------");
//        System.out.println("      MODIFICAR USUARIO       ");
//        System.out.println("------------------------------");
//        System.out.print("Ingrese el nombre del usuario a modificar: ");
//        String nombre = scanner.nextLine();
//        Usuario usuario = CentroEstudiantil.consultarUsuarioNombre(nombre);
//
//        if (usuario != null) {
//            String nuevoNombreUsuario;
//            do {
//                System.out.print("Ingrese el nuevo nombre de usuario: ");
//                nuevoNombreUsuario = scanner.nextLine();
//                if (!Validacion.validarNombres(nuevoNombreUsuario)) {
//                    System.out.println("Nombre de usuario invalido. Debe tener entre 5 y 20 caracteres y solo puede contener letras, numeros, guiones bajos y espacios.");
//                }
//            } while (!Validacion.validarNombres(nuevoNombreUsuario));
//            usuario.setNombreUsuario(nuevoNombreUsuario);
//
//            String nuevaContrasena;
//            do {
//                System.out.print("Ingrese la nueva contrasena: ");
//                nuevaContrasena = scanner.nextLine();
//                if (!Validacion.validarContrasena(nuevaContrasena)) {
//                    System.out.println("Contrasena invalida. Debe tener al menos 6 caracteres y contener al menos un numero y una letra.");
//                }
//            } while (!Validacion.validarContrasena(nuevaContrasena));
//            usuario.setContrasena(nuevaContrasena);
//
//            String nuevoCorreoElectronico;
//            do {
//                System.out.print("Ingrese el nuevo correo electronico: ");
//                nuevoCorreoElectronico = scanner.nextLine();
//                if (!Validacion.validarCorreoElectronico(nuevoCorreoElectronico)) {
//                    System.out.println("Correo electronico invalido.");
//                }
//            } while (!Validacion.validarCorreoElectronico(nuevoCorreoElectronico));
//            usuario.setCorreoElectronico(nuevoCorreoElectronico);
//
//            // Actualizar el usuario
//            CentroEstudiantil.modificarUsuario(usuario);
//            System.out.println("Usuario modificado correctamente.");
//        } else {
//            System.out.println("Usuario no encontrado.");
//        }
//    }
//
//    /**
//     * Método para eliminar un usuario existente.
//     */
//    private void eliminarUsuario() {
//        System.out.println("------------------------------");
//        System.out.println("       ELIMINAR USUARIO       ");
//        System.out.println("------------------------------");
//        System.out.print("Ingrese el nombre del usuario a eliminar: ");
//        String nombre = scanner.nextLine();
//        Usuario usuario = CentroEstudiantil.consultarUsuarioNombre(nombre);
//
//        if (usuario != null) {
//            // Obtener el arreglo de usuarios
//            Usuario[] usuarios = CentroEstudiantil.getUsuarios();
//
//            // Encontrar la posición del usuario a eliminar
//            int pos = -1;
//            for (int i = 0; i < usuarios.length; i++) {
//                if (usuarios[i].equals(usuario)) {
//                    pos = i;
//                    break;
//                }
//            }
//
//            if (pos != -1) {
//                // Utilizar System.arraycopy para eliminar el usuario del arreglo
//                System.arraycopy(usuarios, pos + 1, usuarios, pos, usuarios.length - pos - 1);
//                usuarios[usuarios.length - 1] = null; // Limpiar la última posición
//                Empresa.setUsuarios(usuarios); // Actualizar la lista de usuarios en la empresa
//                System.out.println("Usuario eliminado correctamente.");
//            } else {
//                System.out.println("Usuario no encontrado.");
//            }
//        } else {
//            System.out.println("Usuario no encontrado.");
//        }
//    }
}
