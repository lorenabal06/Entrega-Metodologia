package es.uah.matcomp.e1.ejerciciosclases.c.g.PointLine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void testToString() {
        Point p1 = new Point(1,2);
        assertEquals("Point: (1, 2)", p1.toString());
    }

    @Test
    void getX() {
        Point p1 = new Point(1,2);
        assertEquals(1,p1.getX());
    }

    @Test
    void getY() {
        Point p1 = new Point(1,2);
        assertEquals(2,p1.getY());
    }

    @Test
    void setX() {
        Point p1 = new Point(1,2);
        p1.setX(3);
        assertEquals(3,p1.getX());
    }

    @Test
    void setY() {
        Point p1 = new Point(1,2);
        p1.setY(3);
        assertEquals(3,p1.getY());
    }

    @Test
    void setXY() {
        Point p1 = new Point(1,2);
        p1.setXY(3,4);
        assertEquals("Point: (3, 4)", p1.toString());
    }
}