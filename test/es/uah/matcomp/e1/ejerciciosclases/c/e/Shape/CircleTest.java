package es.uah.matcomp.e1.ejerciciosclases.c.e.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle();
        assertEquals(1.0, c.getRadius());
    }

    @Test
    void setRadius() {
        Circle c = new Circle(2.3);
        c.setRadius(0.0);
        assertEquals(0.0, c.getRadius());
    }

    @Test
    void getArea() {
        Circle c = new Circle(2.3, "green", true);
        assertEquals((double)Math.PI*Math.pow(2.3, 2), c.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c = new Circle(2.3, "green", true);
        assertEquals((double)Math.PI*2.3*2, c.getPerimeter());
    }

    @Test
    void testToString() {
        Circle c = new Circle(2.3, "green", true);
        assertEquals("Circle[Shape[color=green,filled=true]],radius=2.3]", c.toString());
    }
}