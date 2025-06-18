public class EmpleadoTiempoCompleto extends Empleado{

    private String beneficios;

    public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, String beneficios) {
        super(id, nombre, salarioBase);
        this.beneficios = beneficios;
    }

    @Override
    public double calcularSalario() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario: " + getSalarioBase());
        System.out.println("Beneficio: " + beneficios);
        return getSalarioBase();
    }

}
