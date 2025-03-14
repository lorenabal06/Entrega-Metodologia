package es.uah.matcomp.e1.ejerciciosclases.c.d.PointMovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void getX() {
        Point p1 = new Point();
        assertEquals(0.0f, p1.getX());
    }

    @Test
    void setX() {
        Point p1 = new Point();
        p1.setX(1.2f);
        assertEquals(1.2f, p1.getX());
    }

    @Test
    void getY() {
        Point p1 = new Point(1.2f, 6.0f);
        assertEquals(6.0f, p1.getY());
    }

    @Test
    void setY() {
        Point p1 = new Point(1.2f, 6.0f);
        p1.setY(0.0f);
        assertEquals(0.0f, p1.getY());
    }

    @Test
    void setXY() {
        Point p1 = new Point(1.2f, 6.0f);
        p1.setXY(6.0f, 1.2f);
        assertArrayEquals(new float[] {6.0f, 1.2f}, p1.getXY());
    }

    @Test
    void getXY() {
        Point p1 = new Point(1.2f, 6.0f);
        assertArrayEquals(new float[] {1.2f, 6.0f}, p1.getXY());
    }

    @Test
    void testToString() {
        Point p1 = new Point(1.2f, 6.0f);
        assertEquals("(1.2, 6.0)", p1.toString());
    }
}