package es.uah.matcomp.e1.ejerciciosclases.d.c.MovablePoint;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovableTest {

    @Test
    void moveUp() {
        Movable p1 = new MovablePoint(5, 5, 2, 3);
        p1.moveUp();
        assertEquals("(5,2) speed=( 2,3)", p1.toString());
    }

    @Test
    void moveDown() {
        Movable p1 = new MovablePoint(1, 1, 2, 2);
        p1.moveDown();
        assertEquals("(1,3) speed=( 2,2)", p1.toString());
    }

    @Test
    void moveLeft() {
        Movable p1 = new MovablePoint(8, 4, 3, 1);
        p1.moveLeft();
        assertEquals("(5,4) speed=( 3,1)", p1.toString());
    }

    @Test
    void moveRight() {
        Movable p1 = new MovablePoint(0, 0, 4, 5);
        p1.moveRight();
        assertEquals("(4,0) speed=( 4,5)", p1.toString());
    }
}