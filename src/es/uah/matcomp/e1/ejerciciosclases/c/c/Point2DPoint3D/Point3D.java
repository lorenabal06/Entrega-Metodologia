package es.uah.matcomp.e1.ejerciciosclases.c.c.Point2DPoint3D;

public class Point3D  extends Point2D {
    // Variables
    private float z = 0.0f;

    // Programa
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
