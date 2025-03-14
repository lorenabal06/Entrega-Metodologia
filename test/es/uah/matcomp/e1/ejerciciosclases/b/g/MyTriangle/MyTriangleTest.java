package es.uah.matcomp.e1.ejerciciosclases.b.g.MyTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyTriangleTest {

    @Test
    void testToString() {
        MyPoint v1 = new MyPoint(5, 7);
        MyPoint v2 = new MyPoint(8, 6);
        MyPoint v3 = new MyPoint(2, 13);
        MyTriangle t1 = new MyTriangle (v1, v2, v3);
        assertEquals("MyTriangle[v1=(5, 7), (8, 6), (2, 13)]", t1.toString());
    }

    @Test
    void getPerimeter() {
        MyTriangle t1 = new MyTriangle(0, 0, 10, 12, 20, 0);
        assertEquals((20 + 4 * Math.sqrt(61.0)), t1.getPerimeter());
    }

    @Test
    void getType() {
        MyTriangle t1 = new MyTriangle(0, 0, 10, 12, 20, 0);
        assertEquals("Isósceles", t1.getType());
        MyTriangle t2 = new MyTriangle(20, 0, 20, 0, 10, 12);
        assertEquals("Isósceles", t2.getType());
        MyTriangle t3 = new MyTriangle(0, 50, 17, 10, 20, 7);
        assertEquals("Escaleno", t3.getType());
    }
}