package es.uah.matcomp.e1.ejerciciosclases.d.a.Shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle r1 = new Rectangle(4.0, 5.0);
        assertEquals(4.0, r1.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r1 = new Rectangle();
        r1.setWidth(6.0);
        assertEquals(6.0, r1.getWidth());
    }

    @Test
    void getLength() {
        Rectangle r1 = new Rectangle(3.0, 7.0);
        assertEquals(7.0, r1.getLength());
    }

    @Test
    void setLength() {
        Rectangle r1 = new Rectangle();
        r1.setLength(8.0);
        assertEquals(8.0, r1.getLength());
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle(3.0, 4.0);
        assertEquals(12.0, r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(2.0, 5.0);
        assertEquals(14.0, r1.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle(6.0, 2.0, "purple", false);
        assertEquals("Rectangle[Shape[color=purple,filled=false]],width=6.0,length2.0]", r1.toString());
    }
}