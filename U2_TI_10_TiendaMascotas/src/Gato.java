public class Gato extends Animal {

    private String maullar;

    public Gato(String nombre, int edad, String maullar) {
        super(nombre, edad);
        this.maullar = maullar;
    }

    public String getMaullar() {
        return maullar;
    }
    
}
