package es.uah.matcomp.e1.ejerciciosclases.d.a.Shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s1 = new Circle(5.0, "blue", true);
        assertEquals("blue", s1.getColor());
    }

    @Test
    void setColor() {
        Shape s1 = new Circle();
        s1.setColor("green");
        assertEquals("green", s1.getColor());
    }

    @Test
    void isFilled() {
        Shape s1 = new Circle(5.0, "red", false);
        assertFalse(s1.isFilled());
    }

    @Test
    void setFilled() {
        Shape s1 = new Circle();
        s1.setFilled(false);
        assertFalse(s1.isFilled());
    }

    @Test
    void getArea() {
        Shape s1 = new Circle(2.0);
        assertEquals(Math.PI * 4, s1.getArea());
    }

    @Test
    void getPerimeter() {
        Shape s1 = new Circle(3.0);
        assertEquals(2 * Math.PI * 3, s1.getPerimeter());
    }

    @Test
    void testToString() {
        Shape s1 = new Circle(4.0, "yellow", true);
        assertEquals("Circle[Shape[color=yellow,filled=true]],radius=4.0]", s1.toString());
    }
}