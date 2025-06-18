public class Motocicleta extends Vehiculo {
    private boolean tieneCaja;
    
    public Motocicleta(String placa, String marca, boolean tieneCaja) {
        super(placa, marca);
        this.tieneCaja = tieneCaja;
    }
    
    @Override
    public String toString() {
        return "Motocicleta placa: " + placa + ", marca: " + marca + ", tieneCaja: " + tieneCaja;
    }
}