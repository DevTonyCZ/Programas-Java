
import java.util.Scanner;

import Model.UsuarioSeguro;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        UsuarioSeguro Usuario = new UsuarioSeguro();
        
        System.out.println("REGISTRO DE USUARIO");
        System.out.println("Ingrese su nombre de usuario:");
        Usuario.setNombreUsuario(scanner.nextLine());
        
        System.out.println("Ingrese su contraseña (debe contener 8+ caracteres, mayúscula, minúscula y número):");
        Usuario.setContraseña(scanner.nextLine());
        
        System.out.println("\nAUTENTICACION");
        System.out.println("Ingrese su contraseña para acceder:");
        String intentoContraseña = scanner.nextLine();
        
        if(Usuario.Autenticar(intentoContraseña)) {
            System.out.println("\nAutenticacion exitosa!");
            System.out.println("Bienvenido: " + Usuario.getNombreUsuario());
            System.out.println("Código ASCII de tu nombre:");
            for (int i = 0; i < Usuario.getNombreUsuario().length(); i++) {              
            char letra = Usuario.getNombreUsuario().charAt(i);
            int codigoAscii = (int) letra;
            System.out.print(" (" + codigoAscii + ")");
            }
        } else {
            System.out.println("\nAutenticacion fallida. Contraseña incorrecta.");
        }
        
        scanner.close();
    }

}

