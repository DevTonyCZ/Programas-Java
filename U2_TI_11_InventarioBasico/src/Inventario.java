public class Inventario {
    private Producto[] stock;

    public Inventario() {
        this.stock = new Producto[3];
    }

    public boolean agregarProducto(Producto p) {
        for(int i = 0; i < stock.length; i++) {
            if(stock[i] == null) {
                stock[i] = p;
                System.out.println("Producto agregado: " + p.getCodigo() + " - " + p.getNombre() + " - " + p.getCantidad());
                return true;
            }
        }
        System.out.println("No hay espacio para: " + p.getCodigo() + " - " + p.getNombre());
        return false;
    }

    public boolean eliminarProducto(String codigo) {
        for(int i = 0; i < stock.length; i++) {
            if(stock[i] != null && stock[i].getCodigo().equals(codigo)) {
                System.out.println("Producto eliminado: " + codigo);
                stock[i] = null;
                return true;
            }
        }
        System.out.println("Producto no encontrado: " + codigo);
        return false;
    }

    public Producto buscarProducto(String codigo) {
        for(int i = 0; i < stock.length; i++) {
            if(stock[i] != null && stock[i].getCodigo().equals(codigo)) {
                System.out.println("Producto encontrado: " + codigo);
                return stock[i];
            }
        }
        System.out.println("Producto no encontrado: " + codigo);
        return null;
    }
    
    public int totalItems() {
        int total = 0;
        for(int i = 0; i < stock.length; i++) {
            if(stock[i] != null) {
                total += stock[i].getCantidad();
            }
        }
        System.out.println("Total de items: " + total);
        return total;
    }
}