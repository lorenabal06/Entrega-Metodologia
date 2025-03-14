package es.uah.matcomp.e1.ejerciciosclases.c.c.Point2DPoint3D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Point2DTest {

    @Test
    void getX() {
        Point2D p1 = new Point2D();
        assertEquals(0.0, p1.getX());
    }

    @Test
    void setX() {
        Point2D p1 = new Point2D();
        p1.setX(2.5f);
        assertEquals(2.5f, p1.getX());
    }

    @Test
    void getY() {
        Point2D p1 = new Point2D(1.4f, 6.1f);
        assertEquals(6.1f, p1.getY());
    }

    @Test
    void setY() {
        Point2D p1 = new Point2D(1.4f, 6.1f);
        p1.setY(2.5f);
        assertEquals(2.5f, p1.getY());
    }

    @Test
    void setXY() {
        Point2D p1 = new Point2D(1.4f, 6.1f);
        p1.setXY(7.3f, 0.68f);
        assertArrayEquals(new float[]{7.3f, 0.68f}, p1.getXY());
    }

    @Test
    void getXY() {
        Point2D p1 = new Point2D(1.4f, 6.1f);
        assertArrayEquals(new float[]{1.4f, 6.1f}, p1.getXY());
    }

    @Test
    void testToString() {
        Point2D p1 = new Point2D(1.4f, 6.1f);
        assertEquals("(1.4, 6.1)", p1.toString());
    }
}