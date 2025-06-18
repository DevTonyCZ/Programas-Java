public class App {
    public static void main(String[] args) {
        Garage garage = new Garage(3);
        
        Coche coche1 = new Coche("ABC123", "Toyota", 4);
        Motocicleta moto1 = new Motocicleta("XYZ789", "Italika", true);
        Coche coche2 = new Coche("DEF456", "Ford", 2);
        Motocicleta moto2 = new Motocicleta("GHI012", "Kawasali", false);
        
        garage.estacionar(coche1);
        garage.estacionar(moto1);
        garage.estacionar(coche2);
        garage.mostrarEstado();
        
        System.out.println("\nIntentando estacionar moto");
        garage.estacionar(moto2);
        garage.mostrarEstado();
        
        garage.retirar("ABC123");
        garage.mostrarEstado();
        
        System.out.println("\nIntentando estacionar moto2 nuevamente");
        garage.estacionar(moto2);
        garage.mostrarEstado();
    }
}