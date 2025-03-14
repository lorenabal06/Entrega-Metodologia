package es.uah.matcomp.e1.ejerciciosclases.d.e.ResizableGeometricObject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle c1 = new Circle(3.0);
        assertEquals(Math.PI * 3.0 * 3.0, c1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle(3.0);
        assertEquals(2 * Math.PI * 3.0, c1.getPerimeter());
    }

    @Test
    void testToString() {
        Circle c1 = new Circle(3.0);
        assertEquals("Circle[radius=3.0]", c1.toString());
    }
}