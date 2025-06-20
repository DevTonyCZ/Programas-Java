class Garage {
    private Vehiculo[] espacios;
    
    public Garage(int numEspacios) {
        espacios = new Vehiculo[numEspacios];
    }
    
    public boolean estacionar(Vehiculo v) {
        if (estaLleno()) {
            System.out.println("Garaje lleno - No se puede estacionar " + v.getPlaca());
            return false;
        }
        
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] == null) {
                espacios[i] = v;
                System.out.println("Vehículo estacionado en espacio " + i);
                return true;
            }
        }
        return false;
    }
    
    public boolean retirar(String placa) {
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] != null && espacios[i].getPlaca().equals(placa)) {
                System.out.println("Retirando vehículo" );
                espacios[i] = null;
                return true;
            }
        }
        System.out.println("Vehículo no encontrado");
        return false;
    }
    
    public boolean estaLleno() {
        for (Vehiculo v : espacios) {
            if (v == null) {
                return false;
            }
        }
        return true;
    }
    
    public int contarVehiculos() {
        int count = 0;
        for (Vehiculo v : espacios) {
            if (v != null) {
                count++;
            }
        }
        return count;
    }
    
    public void mostrarEstado() {
        System.out.println("\nEstado actual del garaje:");
        for (int i = 0; i < espacios.length; i++) {
            System.out.println("Espacio " + i + ": " + (espacios[i] != null ? espacios[i] : "Vacío"));
        }
        System.out.println("Total ocupado: " + contarVehiculos() + "/" + espacios.length);
    }
}