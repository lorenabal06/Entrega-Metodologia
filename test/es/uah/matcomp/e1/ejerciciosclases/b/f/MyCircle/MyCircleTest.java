package es.uah.matcomp.e1.ejerciciosclases.b.f.MyCircle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyCircleTest {

    @Test
    void getRadius() {
        MyCircle c1 = new MyCircle();
        assertEquals(1, c1.getRadius());
    }

    @Test
    void setRadius() {
        MyCircle c1 = new MyCircle();
        c1.setRadius(2);
        assertEquals(2, c1.getRadius());
    }

    @Test
    void getCenter() {
        MyPoint p1 = new MyPoint(0, 0);
        MyCircle c1 = new MyCircle(p1, 1);
        assertEquals(p1, c1.getCenter());
    }

    @Test
    void setCenter() {
        MyPoint p1 = new MyPoint(1, 1);
        MyCircle c1 = new MyCircle();
        c1.setCenter(p1);
        assertEquals(p1, c1.getCenter());
    }

    @Test
    void getCenterX() {
        MyCircle c1 = new MyCircle(0, 0, 1);
        assertEquals(0, c1.getCenterX());
    }

    @Test
    void setCenterX() {
        MyCircle c1 = new MyCircle(0, 0, 1);
        c1.setCenterX(1);
        assertEquals(1, c1.getCenterX());
    }

    @Test
    void getCenterY() {
        MyCircle c1 = new MyCircle(0, 0, 1);
        assertEquals(0, c1.getCenterY());
    }

    @Test
    void setCenterY() {
        MyCircle c1 = new MyCircle(0, 0, 1);
        c1.setCenterY(1);
        assertEquals(1, c1.getCenterY());
    }

    @Test
    void getCenterXY() {
        MyCircle c1 = new MyCircle(0, 0, 1);
        assertEquals("[0, 0]", Arrays.toString(c1.getCenterXY()));
    }

    @Test
    void setCenterXY() {
        MyCircle c1 = new MyCircle(0, 0, 1);
        c1.setCenterXY(1, 1);
        assertEquals("[1, 1]", Arrays.toString(c1.getCenterXY()));
    }

    @Test
    void testToString() {
        MyCircle c1 = new MyCircle(0, 0, 1);
        assertEquals("MyCircle[radius=1,center=(0, 0)]", c1.toString());
    }

    @Test
    void getArea() {
        MyCircle c1 = new MyCircle(0, 0, 1);
        assertEquals(Math.PI, c1.getArea());
    }

    @Test
    void getCircumference() {
        MyCircle c1 = new MyCircle(0, 0, 1);
        assertEquals(2 * Math.PI, c1.getCircumference());
    }

    @Test
    void distance() {
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(8, 0, 1);
        assertEquals(8.0, c1.distance(c2));
    }
}