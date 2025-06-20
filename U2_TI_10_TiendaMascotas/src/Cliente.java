import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private List<Animal> mascotas;

    public Cliente(String nombre, int capacidadMascotas){
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
        // Inicializa la lista con 'null' para simular espacios vacíos
        for (int i = 0; i < capacidadMascotas; i++) {
            mascotas.add(null);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarMascota(Animal a) {
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i) == null) {
                mascotas.set(i, a);
                System.out.println("Mascota " + a.getNombre() + " agregada a " + nombre);
                return true;
            }
        }
        System.out.println("No hay espacio para agregar la mascota " + a.getNombre() + " a " + nombre);
        return false;
    }

    public boolean tieneMascota(Animal a) {
       if (a == null) {
            return false;
        }
        for (Animal mascota : mascotas) {
            if (mascota != null && mascota.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public List<Animal> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Animal> mascotas) {
        this.mascotas = mascotas;
    }
}