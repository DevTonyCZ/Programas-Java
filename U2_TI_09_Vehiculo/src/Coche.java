public class Coche extends Vehiculo {
    private int numPuertas;
    
    public Coche(String placa, String marca, int numPuertas) {
        super(placa, marca);
        this.numPuertas = numPuertas;
    }
    
    @Override
    public String toString() {
        return "Coche placa: " + placa + ", marca: " + marca + ", numPuertas: " + numPuertas;
    }
}