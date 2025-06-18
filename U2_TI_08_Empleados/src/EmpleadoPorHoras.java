public class EmpleadoPorHoras extends Empleado{

    private int horas;

    public EmpleadoPorHoras( String id, String nombre, double salarioBase, int horas){
        super(id, nombre, salarioBase);
        this.horas = horas;
    }

    @Override
    public double calcularSalario() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Salario base por hora: " + getSalarioBase());
        System.out.println("Salario:" + (getSalarioBase() * horas));
        return (getSalarioBase() * horas);
    }

}
