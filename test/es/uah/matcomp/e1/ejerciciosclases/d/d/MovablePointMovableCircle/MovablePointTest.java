package es.uah.matcomp.e1.ejerciciosclases.d.d.MovablePointMovableCircle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testToString() {
        MovablePoint p1 = new MovablePoint(2, 3, 1, 1);
        assertEquals("(2,3) speed=( 1,1)", p1.toString());
    }

    @Test
    void moveUp() {
        MovablePoint p1 = new MovablePoint(4, 5, 2, 3);
        p1.moveUp();
        assertEquals("(4,2) speed=( 2,3)", p1.toString());
    }

    @Test
    void moveDown() {
        MovablePoint p1 = new MovablePoint(1, 1, 2, 2);
        p1.moveDown();
        assertEquals("(1,3) speed=( 2,2)", p1.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint p1 = new MovablePoint(6, 7, 3, 2);
        p1.moveLeft();
        assertEquals("(3,7) speed=( 3,2)", p1.toString());
    }

    @Test
    void moveRight() {
        MovablePoint p1 = new MovablePoint(0, 0, 4, 5);
        p1.moveRight();
        assertEquals("(4,0) speed=( 4,5)", p1.toString());
    }
}