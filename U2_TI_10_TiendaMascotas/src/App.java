public class App {
    public static void main(String[] args) {
        // 1. Crear animales
        Perro perro1 = new Perro("Sony", 5, "Guau");
        Gato gato1 = new Gato("Celeste", 3, "Miau");
        Perro perro2 = new Perro("Waos", 2, "Guaa");
        
        // 2. Crear tienda y cliente
        Tienda tienda = new Tienda(2);
        Cliente cliente = new Cliente("Tony", 1);
        
        tienda.reabastecer(perro1);
        tienda.reabastecer(gato1);
        tienda.reabastecer(perro2);
        
        
        System.out.println("--------------------------------------");

        //Mostrar los animales de list
        System.out.println("Animales disponibles en la tienda:");
        for (Animal animal : tienda.getInventario()) {
            if (animal != null) {
                System.out.println(animal.getNombre());
            } else {
                System.out.println("Espacio vacío");
            }
        }

        System.out.println("--------------------------------------");
        tienda.venderAnimal(cliente, perro1);
        tienda.venderAnimal(cliente, perro1);  
        tienda.venderAnimal(cliente, gato1);

        
        System.out.println("--------------------------------------");
        System.out.println("Animales disponibles por el Cliente:");
        for (Animal macotas : cliente.getMascotas()) {
            if (macotas != null) {
                System.out.println(macotas.getNombre());
            } else {
                System.out.println("Espacio vacío");
            }
        }
    }
}