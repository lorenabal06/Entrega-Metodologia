package es.uah.matcomp.e1.ejerciciosclases.c.e.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle r = new Rectangle();
        assertEquals(1.0, r.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle();
        r.setWidth(2.0);
        assertEquals(2.0, r.getWidth());
    }

    @Test
    void getLength() {
        Rectangle r = new Rectangle(5.3, 2.2);
        assertEquals(2.2, r.getLength());
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle(5.3, 2.2);
        r.setLength(5.3);
        assertEquals(5.3, r.getLength());
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(5.5, 2.2);
        assertEquals(5.5*2.2, r.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(5.3, 2.2);
        assertEquals(15, r.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(5.3, 2.2);
        assertEquals("Rectangle[Shape[color=red,filled=true],width=5.3,length2.2]", r.toString());
    }
}