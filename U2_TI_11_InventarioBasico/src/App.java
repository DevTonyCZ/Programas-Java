public class App {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        System.out.println("=== PRUEBA DEL INVENTARIO ===");
        
        // Crear productos
        Producto p1 = new Producto("P001", "Teclado", 15);
        Producto p2 = new Producto("P002", "Mouse", 20);
        Producto p3 = new Producto("P003", "Monitor", -0);
        Producto p4 = new Producto("P004", "USB", 30);
        
        
        System.out.println("\n--- Agregando productos ---");
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4); // No cabrá
        
        System.out.println("\n--- Mostrar total ---");
        inventario.totalItems();
        
        System.out.println("\n--- Buscar productos ---");
        inventario.buscarProducto("P002");
        inventario.buscarProducto("P999");
        
        System.out.println("\n--- Eliminar producto ---");
        inventario.eliminarProducto("P001");
        
        System.out.println("\n--- Mostrar nuevo total ---");
        inventario.totalItems();
        
        System.out.println("\n--- Agregar nuevo producto ---");
        Producto p5 = new Producto("P005", "Altavoces", 10);
        inventario.agregarProducto(p5);
        inventario.totalItems();
    }
}