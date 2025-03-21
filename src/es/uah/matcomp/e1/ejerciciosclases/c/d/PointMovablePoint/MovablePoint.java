package es.uah.matcomp.e1.ejerciciosclases.c.d.PointMovablePoint;

public class MovablePoint extends Point{
    // Variables
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Programa
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint() {}
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + "),speed=(" + getXSpeed() + ", " + getYSpeed() + ")";
    }
    public MovablePoint move(){
        setXY(getX() + xSpeed, getY() + ySpeed);
        return this;
    }
}