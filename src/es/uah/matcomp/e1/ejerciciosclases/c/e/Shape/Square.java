package es.uah.matcomp.e1.ejerciciosclases.c.e.Shape;

import es.uah.matcomp.e1.ejerciciosclases.c.e.Shape.Rectangle;

public class Square extends Rectangle {
    // Programa
    public Square() {}
    public Square (double side){
        super(side, side);
    }
    public Square (double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
