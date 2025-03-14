package es.uah.matcomp.e1.ejerciciosclases.a.a.Circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle c = new Circle(2.00);
        assertEquals(2.00, c.getRadius());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle c = new Circle();
        c.setRadius(2.00);
        assertEquals(2.00, c.getRadius());
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle c = new Circle();
        assertEquals(Math.PI, c.getArea());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle c = new Circle();
        assertEquals("Circle: 1.0", c.toString());
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        Circle c = new Circle();
        assertEquals(2 * Math.PI, c.getCircumference());
    }
}