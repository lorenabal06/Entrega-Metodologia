package es.uah.matcomp.e1.ejerciciosclases.b.e.MyLineMyPoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyPointTest {

    @Test
    void getX() {
        MyPoint p1 = new MyPoint();
        assertEquals(0, p1.getX());
    }

    @Test
    void setX() {
        MyPoint p1 = new MyPoint(2, 2);
        p1.setX(3);
        assertEquals(3, p1.getX());
    }

    @Test
    void getY() {
        MyPoint p1 = new MyPoint(2, 2);
        assertEquals(2, p1.getY());
    }

    @Test
    void setY() {
        MyPoint p1 = new MyPoint(2, 2);
        p1.setY(3);
        assertEquals(3, p1.getY());
    }

    @Test
    void getXY() {
        MyPoint p1 = new MyPoint(2, 2);
        assertArrayEquals(new int[]{2, 2}, p1.getXY());
    }

    @Test
    void setXY() {
        MyPoint p1 = new MyPoint(2, 2);
        p1.setXY(5, 7);
        assertArrayEquals(new int[]{5, 7}, p1.getXY());
    }

    @Test
    void testToString() {
        MyPoint p1 = new MyPoint(2, 2);
        assertEquals("(2, 2)", p1.toString());
    }

    @Test
    void distance() {
        MyPoint p1 = new MyPoint(2, 2);
        assertEquals(1.0, p1.distance(3, 2));
    }

    @Test
    void testDistance() {
        MyPoint p1 = new MyPoint(2, 2);
        MyPoint p2 = new MyPoint(2, 3);
        assertEquals(1.0, p1.distance(p2));
    }

    @Test
    void testDistance1() {
        MyPoint p1 = new MyPoint(2, 2);
        assertEquals((Math.sqrt(8.0)), p1.distance());
    }
}
