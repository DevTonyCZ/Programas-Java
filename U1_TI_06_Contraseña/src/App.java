
import java.util.Scanner;

import Model.UsuarioSeguro;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        UsuarioSeguro usuario = new UsuarioSeguro();

        System.out.println("REGISTRO DE USUARIO");
        
        while(usuario.getNombreUsuario() == null) {
            System.out.print("Ingrese nombre de usuario: ");
            usuario.setNombreUsuario(scanner.nextLine());
        }
        
        while(usuario.getPassword() == null) {
            System.out.print("Ingrese contraseña: ");
            usuario.setPassword(scanner.nextLine());
        }

        System.out.println("\nAUTENTICACIÓN");
        System.out.print("Ingrese su contraseña: ");
        String intento = scanner.nextLine();
        
        if(usuario.autenticar(intento)) {
            System.out.println("Acceso concedido");
            System.out.println("Bienvenido: " + usuario.getNombreUsuario());
            System.out.print("Su nombre de usuario en código ASCII: ");
            for (int i = 0; i < usuario.getNombreUsuario().length(); i++) {              
            char letra = usuario.getNombreUsuario().charAt(i);
            int codigoAscii = (int) letra;
            System.out.print(" (" + codigoAscii + ")");
            }
        } else {
            System.out.println("Acceso denegado");
        }

        scanner.close();
    }
}
