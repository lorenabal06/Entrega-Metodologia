package es.uah.matcomp.e1.ejerciciosclases.c.h.CyrcleCylinderComposición;

public class Circle {
    // Variables
    private double radius = 1.0;
    private String color= "red";

    // Programa
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
