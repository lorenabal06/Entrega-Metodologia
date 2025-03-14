package es.uah.matcomp.e1.ejerciciosclases.b.e.MyLineMyPoint;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLineTest {

    @Test
    void getBegin() {
        MyLine l1 = new MyLine(0, 0, 2, 2);
        assertEquals("(0, 0)", l1.getBegin().toString());
    }

    @Test
    void setBegin() {
        MyLine l1 = new MyLine(0, 0, 2, 2);
        l1.setBegin(new MyPoint(1, 1));
        assertEquals("(1, 1)", l1.getBegin().toString());
    }

    @Test
    void getEnd() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(3, 3);
        MyLine l1 = new MyLine(p1, p2);
        assertEquals("(3, 3)", l1.getEnd().toString());
    }

    @Test
    void setEnd() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(3, 3);
        MyLine l1 = new MyLine(p1, p2);
        l1.setEnd(new MyPoint(2, 2));
        assertEquals("(2, 2)", l1.getEnd().toString());
    }

    @Test
    void getBeginX() {
        MyLine l1 = new MyLine(0, 0, 2, 2);
        assertEquals(0, l1.getBeginX());
    }

    @Test
    void setBeginX() {
        MyLine l1 = new MyLine(0, 0, 2, 2);
        l1.setBeginX(1);
        assertEquals(1, l1.getBeginX());

    }

    @Test
    void getBeginY() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(3, 3);
        MyLine l1 = new MyLine(p1, p2);
        assertEquals(1, l1.getBeginY());
    }

    @Test
    void setBeginY() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(3, 3);
        MyLine l1 = new MyLine(p1, p2);
        l1.setBeginY(2);
        assertEquals(2, l1.getBeginY());
    }

    @Test
    void getEndX() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(3, 3);
        MyLine l1 = new MyLine(p1, p2);
        assertEquals(3, l1.getEndX());
    }

    @Test
    void setEndX() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(3, 3);
        MyLine l1 = new MyLine(p1, p2);
        l1.setEndX(2);
        assertEquals(2, l1.getEndX());
    }

    @Test
    void getEndY() {
        MyLine l1 = new MyLine(0, 0, 2, 2);
        assertEquals(2, l1.getEndY());
    }

    @Test
    void setEndY() {
        MyLine l1 = new MyLine(0, 0, 2, 2);
        l1.setEndY(3);
        assertEquals(3, l1.getEndY());
    }

    @Test
    void getBeginXY() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(3, 3);
        MyLine l1 = new MyLine(p1, p2);
        assertEquals("[1, 1]", Arrays.toString(l1.getBeginXY()));
    }

    @Test
    void setBeginXY() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(3, 3);
        MyLine l1 = new MyLine(p1, p2);
        l1.setBeginXY(0, 8);
        assertEquals("[0, 8]", Arrays.toString(l1.getBeginXY()));
    }

    @Test
    void getEndXY() {
        MyLine l1 = new MyLine(0, 0, 2, 2);
        assertEquals("[2, 2]", Arrays.toString(l1.getEndXY()));
    }

    @Test
    void setEndXY() {
        MyLine l1 = new MyLine(0, 0, 2, 2);
        l1.setEndXY(8, 0);
        assertEquals("[8, 0]", Arrays.toString(l1.getEndXY()));
    }

    @Test
    void getLength() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(3, 3);
        MyLine l1 = new MyLine(p1, p2);
        assertEquals((Math.sqrt(8)), l1.getLength());
    }

    @Test
    void getGradient() {
        MyLine l1 = new MyLine(0, 0, 2, 2);
        assertEquals((45 * (Math.PI / 180)), l1.getGradient());
    }

    @Test
    void testToString() {
        MyLine l1 = new MyLine(0, 0, 2, 2);
        assertEquals("MyLine[begin=(0, 0),end=(2, 2)]", l1.toString());
    }
}