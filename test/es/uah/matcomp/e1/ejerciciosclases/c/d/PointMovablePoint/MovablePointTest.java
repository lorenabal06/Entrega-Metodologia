package es.uah.matcomp.e1.ejerciciosclases.c.d.PointMovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MovablePointTest {

    @Test
    void getXSpeed() {
        MovablePoint m = new MovablePoint();
        assertEquals(0.0f, m.getXSpeed() );
    }

    @Test
    void setXSpeed() {
        MovablePoint m = new MovablePoint(1.1f, 2.5f);
        m.setXSpeed(0.0f);
        assertEquals(0.0f, m.getXSpeed() );
    }

    @Test
    void getYSpeed() {
        MovablePoint m = new MovablePoint(8.4f, -1.3f, 1.1f, 2.5f);
        assertEquals(2.5f, m.getYSpeed() );
    }

    @Test
    void setYSpeed() {
        MovablePoint m = new MovablePoint(8.4f, -1.3f, 1.1f, 2.5f);
        m.setYSpeed(0.0f);
        assertEquals(0.0f, m.getYSpeed() );
    }

    @Test
    void setSpeed() {
        MovablePoint m = new MovablePoint(8.4f, -1.3f, 1.1f, 2.5f);
        m.setSpeed(0.0f, 0.0f);
        assertArrayEquals(new float[]{0.0f, 0.0f}, m.getSpeed() );
    }

    @Test
    void getSpeed() {
        MovablePoint m = new MovablePoint();
        assertArrayEquals(new float[]{0.0f, 0.0f}, m.getSpeed() );
    }

    @Test
    void testToString() {
        MovablePoint m = new MovablePoint(8.4f, -1.3f, 1.1f, 2.5f);
        assertEquals("(8.4, -1.3),speed=(1.1, 2.5)", m.toString());
    }

    @Test
    void move() {
        MovablePoint m = new MovablePoint(8.4f, -1.3f, 1.1f, 2.5f);
        m.move();
        m.move();
        assertEquals("(10.6, 3.7),speed=(1.1, 2.5)", m.toString());
    }
}