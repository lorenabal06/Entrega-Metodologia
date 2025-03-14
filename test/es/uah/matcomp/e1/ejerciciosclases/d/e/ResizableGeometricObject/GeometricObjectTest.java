package es.uah.matcomp.e1.ejerciciosclases.d.e.ResizableGeometricObject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeometricObjectTest {

    @Test
    void getArea() {
        GeometricObject obj = new Circle(3.0); // Usamos Circle como implementación
        assertEquals(Math.PI * 3.0 * 3.0, obj.getArea());
    }

    @Test
    void getPerimeter() {
        GeometricObject obj = new Circle(3.0); // Usamos Circle como implementación
        assertEquals(2 * Math.PI * 3.0, obj.getPerimeter());
    }
}