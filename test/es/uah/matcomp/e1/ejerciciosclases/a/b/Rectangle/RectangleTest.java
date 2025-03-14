package es.uah.matcomp.e1.ejerciciosclases.a.b.Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLenght() {
        Rectangle r = new Rectangle();
        assertEquals(1.0, r.getLenght());
    }

    @Test
    void setLenght() {
        Rectangle r = new Rectangle();
        r.setLenght(2.00f);
        assertEquals(2.00f, r.getLenght());
    }

    @Test
    void getWidth() {
        Rectangle r = new Rectangle();
        assertEquals(1.0, r.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle();
        r.setWidth(2.00f);
        assertEquals(2.00, r.getWidth());
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(6, 4);
        assertEquals(24.00, r.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(6, 4);
        assertEquals(20.00, r.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle();
        assertEquals("Rectangle [lenght=1.0, width=1.0]", r.toString());
    }
}