package testeo;

import modelo.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void testNuevo(){
        Producto p = new Producto("pan", 0.50f, 1);
        assertEquals("pan", p.getNombre());
        assertEquals(0.50f, p.getPrecio());
        assertEquals(1, p.getCantidad());
    }

    @Test
    void precioTotal() {
        Producto prod = new Producto("gasolina", 1.92f, 67);
        float total = prod.getPrecio() * prod.getCantidad();
        assertEquals(total, prod.precioTotal());
    }
}