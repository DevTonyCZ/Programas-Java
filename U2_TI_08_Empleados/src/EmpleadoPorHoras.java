public class EmpleadoPorHoras extends Empleado{

    private int horasTrabajadas;

    public EmpleadoPorHoras( String id, String nombre, double salarioBase, int horasTrabajadas){
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Salario base por hora: " + getSalarioBase());
        System.out.println("Salario: " + (getSalarioBase() * horasTrabajadas));
        return (getSalarioBase() * horasTrabajadas);
    }

}
