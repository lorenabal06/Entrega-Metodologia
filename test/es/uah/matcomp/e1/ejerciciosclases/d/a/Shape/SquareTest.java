package es.uah.matcomp.e1.ejerciciosclases.d.a.Shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square s1 = new Square(5.0);
        assertEquals(5.0, s1.getSide());
    }

    @Test
    void setSide() {
        Square s1 = new Square();
        s1.setSide(7.0);
        assertEquals(7.0, s1.getSide());
    }

    @Test
    void setWidth() {
        Square s1 = new Square();
        s1.setWidth(6.0);
        assertEquals(6.0, s1.getSide());
    }

    @Test
    void setLength() {
        Square s1 = new Square();
        s1.setLength(4.0);
        assertEquals(4.0, s1.getSide());
    }

    @Test
    void testToString() {
        Square s1 = new Square(3.0, "cyan", true);
        assertEquals("Square[Rectangle[Shape[color=cyan,filled=true]],width=3.0,length=3.0]]", s1.toString());
    }
}