import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Animal> inventario;

    public Tienda(int capacidad) {
        this.inventario = new ArrayList<>();
        for (int i = 0; i < capacidad; i++) {
            inventario.add(null);
        }
    }

    public boolean venderAnimal(Cliente c, Animal a) {
    for (int i = 0; i < inventario.size(); i++) {
        if (inventario.get(i) != null && inventario.get(i).equals(a)) {
            if (c.tieneMascota(a)) {
                System.out.println("El cliente ya tiene esta mascota.");
                return false;
            }
            if (c.agregarMascota(a)) {
                inventario.set(i, null);
                System.out.println("Venta Exitosa: " + a.getNombre() + " vendido a " + c.getNombre());
                return true;
            } else {
                System.out.println("El cliente no tiene espacio para más mascotas.");
                return false;
            }
        }
    }
        System.out.println("Animal no encontrado en inventario.");
        return false;
    }

    public boolean reabastecer(Animal a) {
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i) == null) {
                inventario.set(i, a);
                System.out.println("Reabastecimiento exitoso: " + a.getNombre() + " agregado al inventario.");
                return true;
            }
        }
        System.out.println("No hay espacio para reabastecer: " + a.getNombre());
        return false;
    }

    public List<Animal> getInventario() {
        return inventario;
    }

    public void setInventario(List<Animal> inventario) {
        this.inventario = inventario;
    }    
}