package es.uah.matcomp.e1.ejerciciosclases.c.e.Shape;

public class Rectangle extends Shape {
    // Variables
    private double width = 1.0;
    private double length = 1.0;

    //Programa
    public Rectangle() {}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return width * 2 + length * 2;
    }
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + width + ",length" + length + "]";
    }
}
