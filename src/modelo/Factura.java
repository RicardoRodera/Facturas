package modelo;

import java.util.Vector;

public class Factura {
    private Vector<Producto> productos;

    public void meterProducto(Producto p) {
        this.productos.add(p);
    }

    public float totalFactura() {
        float suma = 0f;
        for (Producto p : this.productos) {
            suma += p.precioTotal();
        }
        return suma;
    }

    public float plicariva(float iva) {
        return this.totalFactura() * iva;
    }
}
