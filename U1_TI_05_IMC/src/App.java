public class App {
    public static void main(String[] args) throws Exception {
    //Calcular el IMC de una persona
        Model.Persona persona = new Model.Persona();
    
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        persona.setNombre(nombre);
        System.out.print("Ingrese su peso (kg): ");
        double peso = scanner.nextDouble();
        persona.setPeso(peso);
        System.out.print("Ingrese su altura (m): ");
        double altura = scanner.nextDouble();
        persona.setAltura(altura);
        double imc = persona.CalcularIMC(peso, altura);
        String clasificacion = persona.ClasificacionIMC(imc);
        System.out.println("Hola " + persona.getNombre() + ", tu IMC es " + String.format("%.2f", imc) + " y tu clasificación es: " + clasificacion);
        //System.out.printf("Hola %s, tu IMC es %.2f y tu clasificación es: %s%n", persona.getNombre(), imc, clasificacion);
        scanner.close();

    }
}
