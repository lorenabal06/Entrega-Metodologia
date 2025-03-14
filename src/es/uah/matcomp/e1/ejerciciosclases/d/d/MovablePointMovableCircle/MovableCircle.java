package es.uah.matcomp.e1.ejerciciosclases.d.d.MovablePointMovableCircle;

public class MovableCircle implements Movable {
    // Variables
    private int radius;
    private MovablePoint center;

    // Programa
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "(" + center.x + "," + center.y + ") speed=( " + center.xSpeed + "," + center.ySpeed + "),radius=" + radius;
    }
    @Override
    public void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown(){
        center.moveDown();
    }
    @Override
    public void moveLeft(){
        center.moveLeft();
    }
    @Override
    public void moveRight(){ center.moveRight(); }
}
