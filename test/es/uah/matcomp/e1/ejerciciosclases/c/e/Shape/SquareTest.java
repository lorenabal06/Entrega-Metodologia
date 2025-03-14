package es.uah.matcomp.e1.ejerciciosclases.c.e.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void getSide() {
        Square s = new Square();
        assertEquals(1.0, s.getSide());
    }

    @Test
    void setSide() {
        Square s = new Square();
        s.setSide(2.0);
        assertEquals(2.0, s.getSide());
    }

    @Test
    void setWidth() {
        Square s = new Square(2.5);
        s.setWidth(1.0);
        assertEquals(1.0, s.getSide());
    }

    @Test
    void setLength() {
        Square s = new Square();
        s.setLength(8.4);
        assertEquals(8.4, s.getSide());
    }

    @Test
    void testToString() {
        Square s = new Square(3.25, "blue", false);
        assertEquals("Square[Rectangle[Shape[color=blue,filled=false],width=3.25,length3.25]]", s.toString());
    }
}