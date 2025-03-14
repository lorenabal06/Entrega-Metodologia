package es.uah.matcomp.e1.ejerciciosclases.d.b.GeometricObject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle(5.0, 10.0);
        assertEquals(50.0, r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(4.0, 7.0);
        assertEquals(22.0, r1.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle(3.0, 6.0);
        assertEquals("Rectangle[width=3.0,length6.0]", r1.toString());
    }
}