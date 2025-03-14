package es.uah.matcomp.e1.ejerciciosclases.c.g.PointLine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineTest {

    @Test
    void testToString() {
        Point p1 = new Point(1,2);
        Point p2 = new Point(5, 3);
        Line l1 =  new Line(p1, p2);
        assertEquals("Line [begin=Point: (1, 2), end=Point: (5, 3)]", l1.toString());
    }

    @Test
    void getBegin() {
        Line l1 = new Line(1,2,5,3);
        assertEquals("Line [begin=Point: (1, 2), end=Point: (5, 3)]", "Line [begin=Point: (1, 2), end="+l1.getEnd()+"]");
    }

    @Test
    void getEnd() {
        Line l1 = new Line(1,2,5,3);
        assertEquals("Line [begin=Point: (1, 2), end=Point: (5, 3)]", "Line [begin=Point: (1, 2), end="+l1.getEnd()+"]");
    }

    @Test
    void setBegin() {
        Line l1 = new Line(1,2,5,3);
        l1.setBegin(new Point(5,3));
        assertEquals("Line [begin=Point: (5, 3), end=Point: (5, 3)]", l1.toString());
    }

    @Test
    void setEnd() {
        Line l1 = new Line(1,2,5,3);
        l1.setEnd(new Point(1,2));
        assertEquals("Line [begin=Point: (1, 2), end=Point: (1, 2)]", l1.toString());
    }

    @Test
    void getBeginX() {
        Line l1 = new Line(1,2,5,3);
        assertEquals(1, l1.getBeginX());
    }

    @Test
    void getBeginY() {
        Line l1 = new Line(1,2,5,3);
        assertEquals(2, l1.getBeginY());
    }

    @Test
    void getEndX() {
        Line l1 = new Line(1,2,5,3);
        assertEquals(5, l1.getEndX());
    }

    @Test
    void getEndY() {
        Line l1 = new Line(1,2,5,3);
        assertEquals(3, l1.getEndY());
    }

    @Test
    void setBeginX() {
        Line l1 = new Line(1,2,5,3);
        l1.setBeginX(4);
        assertEquals(4, l1.getBeginX());
    }

    @Test
    void setBeginY() {
        Line l1 = new Line(1,2,5,3);
        l1.setBeginY(5);
        assertEquals(5, l1.getBeginY());
    }

    @Test
    void setBeginXY() {
        Line l1 = new Line(1,2,5,3);
        l1.setBeginXY(4,5);
        assertEquals("Line [begin=Point: (4, 5), end=Point: (5, 3)]", l1.toString());
    }

    @Test
    void setEndX() {
        Line l1 = new Line(1,2,5,3);
        l1.setEndX(7);
        assertEquals(7, l1.getEndX());
    }

    @Test
    void setEndY() {
        Line l1 = new Line(1,2,5,3);
        l1.setEndY(7);
        assertEquals(7, l1.getEndY());
    }

    @Test
    void setEndXY() {
        Line l1 = new Line(1,2,5,3);
        l1.setEndXY(4,5);
        assertEquals("Line [begin=Point: (1, 2), end=Point: (4, 5)]", l1.toString());
    }

    @Test
    void getLength() {
        Line l1 = new Line(1,2,5,3);
        assertEquals((int) Math.sqrt(Math.pow(4, 2)+Math.pow(1, 2)), l1.getLength());
    }

    @Test
    void getGradient() {
        Line l1 = new Line(1,2,5,3);
        assertEquals(Math.atan2(1, 4), l1.getGradient());
    }
}