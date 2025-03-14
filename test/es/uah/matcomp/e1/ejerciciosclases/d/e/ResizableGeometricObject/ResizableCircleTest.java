package es.uah.matcomp.e1.ejerciciosclases.d.e.ResizableGeometricObject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle rc = new ResizableCircle(10.0);
        assertEquals("Resizable Circle[Circle[radius=10.0]]", rc.toString());
    }

    @Test
    void resize() {
        ResizableCircle rc = new ResizableCircle(10.0);
        rc.resize(50); // Reduce el radio en un 50%
        assertEquals(5.0, rc.radius);

        rc.resize(200); // Duplica el radio
        assertEquals(10.0, rc.radius);
    }
}