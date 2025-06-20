public abstract class Vehiculo {
    protected String placa;
    protected String marca;
    
    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}