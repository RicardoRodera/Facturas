package modelo;

public class Producto {
    private String nombre;
    private float precio;
    private int cantidad;

    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public float precioTotal() {
        return this.cantidad * this.precio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("modelo.Producto[");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", cantidad=").append(cantidad);
        sb.append(']');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
