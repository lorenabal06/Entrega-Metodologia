package es.uah.matcomp.e1.ejerciciosclases.c.h.CyrcleCylinderComposición;

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
        c1.setRadius(7.5);
        assertEquals(7.5, c1.getRadius());
    }

    @Test
    void getColor() {
        Circle c1 = new Circle(5.0, "blue");
        assertEquals("blue", c1.getColor());
    }

    @Test
    void setColor() {
        Circle c1 = new Circle();
        c1.setColor("green");
        assertEquals("green", c1.getColor());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle(3.0);
        assertEquals(Math.PI * 3.0 * 3.0, c1.getArea(), 0.0001);
    }

    @Test
    void testToString() {
        Circle c1 = new Circle(4.5, "yellow");
        assertEquals("Circle[radius=4.5,color=yellow]", c1.toString());
    }
}