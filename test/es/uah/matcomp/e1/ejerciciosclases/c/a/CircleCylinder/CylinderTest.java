package es.uah.matcomp.e1.ejerciciosclases.c.a.CircleCylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder cy1 = new Cylinder();
        assertEquals(1.0, cy1.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder cy1 = new Cylinder(5.0 );
        assertEquals (Math.PI*5.0, cy1.getVolume());
    }

    @Test
    void testToString() {
        Cylinder cy1 = new Cylinder(2.0,5.0 );
        assertEquals("Cylinder: subclass of Circle[radius=2.0,color=red] height=5.0", cy1.toString());
    }
}