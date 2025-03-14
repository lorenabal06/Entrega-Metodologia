package es.uah.matcomp.e1.ejerciciosclases.d.e.ResizableGeometricObject;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }
    @Override
    public String toString(){
        return "Resizable Circle[Circle[radius=" + radius + "]]";
    }
    @Override
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }
}
