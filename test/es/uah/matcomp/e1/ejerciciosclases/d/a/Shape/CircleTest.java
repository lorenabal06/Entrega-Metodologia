package es.uah.matcomp.e1.ejerciciosclases.d.a.Shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1 = new Circle(5.0);
        assertEquals(5.0, c1.getRadius());
    }

    @Test
    void setRadius() {
        Circle c1 = new Circle();
        c1.setRadius(3.0);
        assertEquals(3.0, c1.getRadius());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle(2.0);
        assertEquals(Math.PI * 4, c1.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle(3.0);
        assertEquals(2 * Math.PI * 3, c1.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Circle c1 = new Circle(4.0, "yellow", true);
        assertEquals("Circle[Shape[color=yellow,filled=true]],radius=4.0]", c1.toString());
    }
}