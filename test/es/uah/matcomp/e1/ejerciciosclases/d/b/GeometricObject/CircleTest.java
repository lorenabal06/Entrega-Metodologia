package es.uah.matcomp.e1.ejerciciosclases.d.b.GeometricObject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle c1 = new Circle(2.0);
        assertEquals(Math.PI * 4, c1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle(3.0);
        assertEquals(2 * Math.PI * 3, c1.getPerimeter());
    }

    @Test
    void testToString() {
        Circle c1 = new Circle(5.0);
        assertEquals("Circle[radius=5.0]", c1.toString());
    }
}