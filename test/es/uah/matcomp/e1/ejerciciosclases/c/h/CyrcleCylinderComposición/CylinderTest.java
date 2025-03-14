package es.uah.matcomp.e1.ejerciciosclases.c.h.CyrcleCylinderComposición;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c1 = new Cylinder(5.0, 10.0);
        assertEquals(10.0, c1.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder c1 = new Cylinder(3.0, 7.0);
        assertEquals(Math.PI * 3.0 * 3.0 * 7.0, c1.getVolume(), 0.0001);
    }

    @Test
    void testToString() {
        Cylinder c1 = new Cylinder(4.5, 12.0);
        assertEquals("Cylinder[base= Circle[radius=4.5,color=red],height=12.0]", c1.toString());
    }
}
