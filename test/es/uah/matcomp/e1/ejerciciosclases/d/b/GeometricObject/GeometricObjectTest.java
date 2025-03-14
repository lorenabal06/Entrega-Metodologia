package es.uah.matcomp.e1.ejerciciosclases.d.b.GeometricObject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeometricObjectTest {

    @Test
    void getArea() {
        GeometricObject g1 = new Circle(3.0);
        assertEquals(Math.PI * 9, g1.getArea());
    }

    @Test
    void getPerimeter() {
        GeometricObject g1 = new Circle(4.0);
        assertEquals(2 * Math.PI * 4, g1.getPerimeter());
    }
}