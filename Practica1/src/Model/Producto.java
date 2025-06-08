package Model;

public class Producto {
        private String codigo;
        private int cantidad;

    public Producto(String codigo, int cantidad) {
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
            return codigo;
        }

        public int getCantidad() {
            return cantidad;
        }
    }
