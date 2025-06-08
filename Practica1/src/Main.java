import Model.Inventario;
import Model.Producto;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        System.out.println("--- REGISTRO DE PRODUCTOS (Máximo 3) ---");
        for (int i = 0; i < 4; i++) {
            System.out.print("\nIngrese el código del producto " + (i+1) + ": ");
            String codigo = scanner.nextLine();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            Producto producto = new Producto(codigo, cantidad);
            if (!inventario.agregarProducto(producto)) {
                System.out.println("¡Inventario lleno! No se pudo agregar el cuarto producto.");
                break;
            }
        }

        System.out.print("\n¿Desea eliminar un producto? (s/n): ");
        String opcion = scanner.nextLine();

        if (opcion.equalsIgnoreCase("s")) {
            System.out.print("Ingrese el código del producto a eliminar: ");
            String codigoEliminar = scanner.nextLine();

            if (inventario.eliminarProducto(codigoEliminar)) {
                System.out.println("Producto eliminado correctamente.");
                inventario.mostrarProductos();
            } else {
                System.out.println("No se encontró el producto con código: " + codigoEliminar);
            }
        }

        System.out.println("\nTotal de unidades en inventario: " + inventario.total());

        System.out.print("\n¿Desea agregar un producto? (s/n): ");
        String opcion2 = scanner.nextLine();

        if (opcion2.equalsIgnoreCase("s")) {
            System.out.print("\nIngrese el código del nuevo producto: ");
            String codigo = scanner.nextLine();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            Producto producto = new Producto(codigo, cantidad);
            if (!inventario.agregarProducto(producto)) {
                System.out.println("¡Inventario lleno! No se pudo agregar el producto.");
            } else {
                System.out.println("Producto agregado correctamente.");
                inventario.mostrarProductos();
            }
        }

        System.out.println("\nTotal de unidades en inventario: " + inventario.total());
        scanner.close();
    }
}