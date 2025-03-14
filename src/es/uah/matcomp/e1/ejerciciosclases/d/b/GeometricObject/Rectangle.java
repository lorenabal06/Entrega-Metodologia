package es.uah.matcomp.e1.ejerciciosclases.d.b.GeometricObject;

public class Rectangle implements GeometricObject {
    // Variables
    protected double width;
    protected double length;

    // Programa
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length" + length + "]";
    }
}
