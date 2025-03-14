package es.uah.matcomp.e1.ejerciciosclases.c.g.PointLine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    @Test
    void testToString() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        assertEquals("LineSub from Point: (1, 2) to Point: (3, 4)]", l1.toString());
    }

    @Test
    void getBegin() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        assertEquals("LineSub from Point: (1, 2) toPoint: (3, 4)]", "LineSub from " + l1.getBegin() + " toPoint: (3, 4)]");
    }

    @Test
    void getEnd() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        assertEquals("LineSub from Point: (1, 2) toPoint: (3, 4)]", "LineSub from Point: (1, 2) to"+l1.getEnd()+"]");
    }

    @Test
    void setBegin() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        l1.setBegin(new Point(10, 20));
        assertEquals("LineSub from Point: (10, 20) to Point: (3, 4)]", l1.toString());
    }

    @Test
    void setEnd() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        l1.setEnd(new Point(10, 20));
        assertEquals("LineSub from Point: (1, 2) to Point: (10, 20)]", l1.toString());
    }

    @Test
    void getBeginX() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        assertEquals(1, l1.getBeginX());
    }

    @Test
    void getBeginY() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        assertEquals(2, l1.getBeginY());
    }

    @Test
    void getEndX() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        assertEquals(3, l1.getEndX());
    }

    @Test
    void getEndY() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        assertEquals(4, l1.getEndY());
    }

    @Test
    void setBeginX() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        l1.setBeginX(10);
        assertEquals(10, l1.getBeginX());
    }

    @Test
    void setBeginY() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        l1.setBeginY(20);
        assertEquals(20, l1.getBeginY());
    }

    @Test
    void setBeginXY() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        l1.setBeginXY(10, 20);
        assertEquals(10, l1.getBeginX());
        assertEquals(20, l1.getBeginY());
    }

    @Test
    void setEndX() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        l1.setEndX(30);
        assertEquals(30, l1.getEndX());
    }

    @Test
    void setEndY() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        l1.setEndY(40);
        assertEquals(40, l1.getEndY());
    }

    @Test
    void setEndXY() {
        LineSub l1 = new LineSub(1, 2, 3, 4);
        l1.setEndXY(30, 40);
        assertEquals(30, l1.getEndX());
        assertEquals(40, l1.getEndY());
    }

    @Test
    void getLength() {
        LineSub l1 = new LineSub(0, 0, 3, 4);
        assertEquals(5, l1.getLength());
    }

    @Test
    void getGradient() {
        LineSub l1 = new LineSub(0, 0, 1, 1);
        double expectedGradient = Math.PI / 4; // 45 grados en radianes
        assertEquals(expectedGradient, l1.getGradient(), 0.0001);
    }
}
