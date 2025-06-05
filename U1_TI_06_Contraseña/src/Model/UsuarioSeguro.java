package Model;

public class UsuarioSeguro {

    private String nombreUsuario;
    private String contraseña;

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
            System.out.println("El nombre de usuario no puede estar vacío");
        }
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
        if (contraseña == null || contraseña.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
        } else 
        if (!contraseña.matches(".*[A-Z].*")) {
            System.out.println("La contraseña debe contener al menos una letra mayúscula");
        } else if (!contraseña.matches(".*[a-z].*")) {
            System.out.println("La contraseña debe contener al menos una letra minúscula");
        } else if (!contraseña.matches(".*\\d.*")) {
            System.out.println("La contraseña debe contener al menos un dígito");
        }
    }

    public boolean Autenticar(String contrasena) {
        setContraseña(contraseña);
        return contraseña.equals(contrasena);
    }
}

