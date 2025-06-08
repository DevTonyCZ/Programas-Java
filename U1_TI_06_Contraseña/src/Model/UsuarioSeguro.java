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

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneDigito = true;
            }
    
        if (tieneMayuscula && tieneMinuscula && tieneDigito) {
        break;
        }
    }

        if (!tieneMayuscula) {
            System.out.println("Error waos: La contraseña debe contener al menos una mayúscula");
            return;
        }
        
        if (!tieneMinuscula) {
            System.out.println("Error: La contraseña debe contener al menos una minúscula");
            return;
        }
        
        if (!tieneDigito) {
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