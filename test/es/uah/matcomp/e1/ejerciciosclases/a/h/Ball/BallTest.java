package es.uah.matcomp.e1.ejerciciosclases.a.h.Ball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        assertEquals(2, balon.getX());
    }

    @Test
    void setX() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        balon.setX(1);
        assertEquals(1, balon.getX());
    }

    @Test
    void getY() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        assertEquals(5, balon.getY());
    }

    @Test
    void setY() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        balon.setY(4);
        assertEquals(4, balon.getY());
    }

    @Test
    void getRadius() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        assertEquals(1, balon.getRadius());
    }

    @Test
    void setRadius() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        balon.setRadius(2);
        assertEquals(2, balon.getRadius());
    }

    @Test
    void getXDelta() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        assertEquals(1, balon.getXDelta());
    }

    @Test
    void setXDelta() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        balon.setXDelta(2);
        assertEquals(2, balon.getXDelta());
    }

    @Test
    void getYDelta() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        assertEquals(1, balon.getYDelta());
    }

    @Test
    void setYDelta() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        balon.setYDelta(2);
        assertEquals(2, balon.getYDelta());
    }

    @Test
    void move() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        balon.move();
        assertEquals(3, balon.getX());
        assertEquals(6, balon.getY());

    }

    @Test
    void reflectHorizontal() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        balon.reflectHorizontal();
        balon.move();
        assertEquals(-1, balon.getXDelta());
        assertEquals(1, balon.getX());
    }

    @Test
    void reflectVertical() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        balon.reflectVertical();
        balon.move();
        assertEquals(-1, balon.getYDelta());
        assertEquals(4, balon.getY());
    }

    @Test
    void testToString() {
        Ball balon = new Ball(2, 5, 1, 1, 1);
        assertEquals("Ball[(2.0,5.0),speed=(1.0,1.0)]", balon.toString());
    }
}