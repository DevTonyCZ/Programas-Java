package Model;

public class Inventario {
    private Producto[] productos;
    private int cantidad;

    public Inventario() {
        productos = new Producto[3]; // Capacidad fija para 3 productos
        cantidad = 0;
    }

    public boolean agregarProducto(Producto p) {
        if (cantidad < 3) {
            productos[cantidad] = p;
            cantidad++;
            return true;
        }
        return false;
    }

    public boolean eliminarProducto(String codigo) {
        for (int i = 0; i < cantidad; i++) {
            if (productos[i] != null && productos[i].getCodigo().equals(codigo)) {
                // Mover el último elemento a la posición eliminada
                productos[i] = productos[cantidad-1];
                productos[cantidad-1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }

    public Producto[] getProductos() {
        Producto[] copia = new Producto[cantidad];
        System.arraycopy(productos, 0, copia, 0, cantidad);
        return copia;
    }

    public int total() {
        int total = 0;
        for (int i = 0; i < cantidad; i++) {
            if (productos[i] != null) {
                total += productos[i].getCantidad();
            }
        }
        return total;
    }

    public void mostrarProductos() {
        System.out.println("\n--- PRODUCTOS REGISTRADOS ---");
        Producto[] productos = this.getProductos();
        if (productos.length == 0) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                System.out.println("- Código: " + p.getCodigo() + ", Cantidad: " + p.getCantidad());
            }
        }
    }
}