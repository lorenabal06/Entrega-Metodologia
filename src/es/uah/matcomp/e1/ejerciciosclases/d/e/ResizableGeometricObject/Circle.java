package es.uah.matcomp.e1.ejerciciosclases.d.e.ResizableGeometricObject;

public class Circle implements GeometricObject {
    // Variables
    protected double radius = 1.0;

    // Programa
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}