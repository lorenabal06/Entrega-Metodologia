package es.uah.matcomp.e1.ejerciciosclases.c.e.Shape;

public class Shape {
    // Variables
    private String color = "red";
    private boolean filled = true;

    // Programa
    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
