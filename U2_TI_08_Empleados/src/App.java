public class App {
    public static void main(String[] args) throws Exception {
        
        EmpleadoTiempoCompleto tony = new EmpleadoTiempoCompleto("TO1", "Tony", 100, "Descanso");
        EmpleadoPorHoras david = new EmpleadoPorHoras("DO1", "David", 1000, 10);

        tony.calcularSalario();
        System.out.println("---------------------");
        david.calcularSalario();

        
    }
}
