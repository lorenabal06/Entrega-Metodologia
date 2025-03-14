package es.uah.matcomp.e1.ejerciciosclases.c.h.CyrcleCylinderComposición;

public class Cylinder {
    private Circle base;
    private double height;
    // Base circle, an instance of Circle class
    // Constructor with default color, radius and height
    public Cylinder() {
        base = new Circle(); // Call the constructor to construct the Circle
        height = 1.0;
    }  // private variable
    // Constructor with default radius, color but given height
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }
    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }
    // A public method for computing the volume of cylinder
    //  use superclass method getArea() to get the base area
    public double getVolume() {
        return base.getArea()*height;
    }
    @Override
    public String toString() {      // in Cylinder class
        return "Cylinder[base= " + base.toString()  // use Circle's toString()
                + ",height=" + height + "]";
    }
}
