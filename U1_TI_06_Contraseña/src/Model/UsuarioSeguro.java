package Model;

public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.trim().isEmpty()) {
            System.out.println("Error: El nombre de usuario no puede estar vacío");
            return;
        }
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        if (password == null) {
            System.out.println("Error: La contraseña no puede ser nula");
            return;
        }
        if (password.length() < 8) {
            System.out.println("Error: La contraseña debe tener al menos 8 caracteres");
            return;
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Error: La contraseña debe contener al menos una mayúscula");
            return;
        }
        if (!password.matches(".*[a-z].*")) {
            System.out.println("Error: La contraseña debe contener al menos una minúscula");
            return;
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("Error: La contraseña debe contener al menos un dígito");
            return;
        }
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public boolean autenticar(String intentPassword) {
        if (this.password == null) {
            System.out.println("Error: No hay contraseña configurada");
            return false;
        }
        return this.password.equals(intentPassword);
    }
}