package es.uah.matcomp.e1.ejerciciosclases.c.e.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s  = new Shape("brown", false);
        assertEquals("brown", s.getColor());
    }

    @Test
    void setColor() {
        Shape s  = new Shape("brown", false);
        s.setColor("pink");
        assertEquals("pink", s.getColor());
    }

    @Test
    void isFilled() {
        Shape s  = new Shape();
        assertTrue(s.isFilled());
    }

    @Test
    void setFilled() {
        Shape s  = new Shape();
        s.setFilled(false);
        assertFalse(s.isFilled());
    }

    @Test
    void testToString() {
        Shape s  = new Shape("pink", false);
        assertEquals("Shape[color=pink,filled=false]", s.toString());
    }
}