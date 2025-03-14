package es.uah.matcomp.e1.ejerciciosclases.d.d.MovablePointMovableCircle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle c1 = new MovableCircle(3, 4, 2, 1, 5);
        assertEquals("(3,4) speed=( 2,1),radius=5", c1.toString());
    }

    @Test
    void moveUp() {
        MovableCircle c1 = new MovableCircle(3, 4, 2, 1, 5);
        c1.moveUp();
        assertEquals("(3,3) speed=( 2,1),radius=5", c1.toString());
    }

    @Test
    void moveDown() {
        MovableCircle c1 = new MovableCircle(3, 4, 2, 1, 5);
        c1.moveDown();
        assertEquals("(3,5) speed=( 2,1),radius=5", c1.toString());
    }

    @Test
    void moveLeft() {
        MovableCircle c1 = new MovableCircle(3, 4, 2, 1, 5);
        c1.moveLeft();
        assertEquals("(1,4) speed=( 2,1),radius=5", c1.toString());
    }

    @Test
    void moveRight() {
        MovableCircle c1 = new MovableCircle(3, 4, 2, 1, 5);
        c1.moveRight();
        assertEquals("(5,4) speed=( 2,1),radius=5", c1.toString());
    }
}