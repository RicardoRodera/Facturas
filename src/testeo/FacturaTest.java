package testeo;

import modelo.Factura;
import modelo.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaTest {

    @Test
    void testTotalFactura() {
        Factura factura = new Factura();
        factura.meterProducto(new Producto("pan", 0.50f, 1));
        factura.meterProducto(new Producto("gasolina", 1.92f, 67));
        float total = 0.5f + 1.92f * 67;
        assertEquals(total, factura.totalFactura());
    }

    @Test
    void testAplicariva() {
        Factura factura = new Factura();
        factura.meterProducto(new Producto("pan", 0.50f, 1));
        factura.meterProducto(new Producto("gasolina", 1.92f, 67));
        float total = 0.5f + 1.92f * 67;
        total *= 1.21;
        assertEquals(total, factura.aplicariva(0.21f));
    }
}