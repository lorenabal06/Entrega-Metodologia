package es.uah.matcomp.e1.ejerciciosclases.c.a.CircleCylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1 = new Circle();
        assertEquals(1.0, c1.getRadius());
    }

    @Test
    void setRadius() {
        Circle c1 = new Circle(5.0, "pink");
        c1.setRadius(4.7);
        assertEquals(4.7, c1.getRadius());
    }

    @Test
    void getColor() {
        Circle c1 = new Circle();
        assertEquals("red", c1.getColor());
    }

    @Test
    void setColor() {
        Circle c1 = new Circle(5.0, "pink");
        c1.setColor("yellow");
        assertEquals("yellow", c1.getColor());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle();
        assertEquals(Math.PI , c1.getArea());
    }

    @Test
    void testToString() {
        Circle c1 = new Circle(5.0, "pink");
        assertEquals("Circle[radius=5.0,color=pink]", c1.toString());
    }
}