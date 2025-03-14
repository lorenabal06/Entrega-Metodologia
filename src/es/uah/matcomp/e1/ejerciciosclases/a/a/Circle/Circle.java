package es.uah.matcomp.e1.ejerciciosclases.a.a.Circle;

public class Circle {
    private double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public String toString() {
        return "Circle: " + radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
