public class Perro extends Animal{

    private String ladrar;

    public Perro(String nombre, int edad, String ladrar) {
        super(nombre, edad);
        this.ladrar = ladrar;
    }

    public String getLadrar() {
        return ladrar;
    }
    
}
