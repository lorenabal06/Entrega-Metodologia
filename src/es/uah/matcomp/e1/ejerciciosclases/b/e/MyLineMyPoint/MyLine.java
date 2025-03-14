package es.uah.matcomp.e1.ejerciciosclases.b.e.MyLineMyPoint;

import es.uah.matcomp.e1.ejerciciosclases.b.e.MyLineMyPoint.MyPoint;

public class MyLine {
    // Variables
    private MyPoint begin;
    private MyPoint end;

    // Programa
    public MyLine (int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint (x1, y1);
        this.end = new MyPoint (x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = new MyPoint (begin.getX(), begin.getY()); // this.begin = begin CORREGIDO: así no guarda el dato en la definición, si no confunde l1 con l2.
        this.end = new MyPoint (end.getX(), end.getY());// this.end = end CORREGIDO: así no guarda el dato en la definición, si no confunde l1 con l2
    }
    public MyPoint getBegin() {
        return begin;
    }
    public void setBegin(MyPoint begin) {
        this.begin = new MyPoint (begin.getX(), begin.getY());// this.begin = begin CORREGIDO: así no guarda el dato en la definición, si no confunde l1 con l2.
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setEnd(MyPoint end) {
        this.end = new MyPoint (end.getX(), end.getY());// this.end = end CORREGIDO: así no guarda el dato en la definición, si no confunde l1 con l2.
    }
    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int endY) {
        this.end.setY(endY);
    }
    public int[] getBeginXY() {
        return new int[] {getBeginX(), getBeginY()};
    }
    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }
    public int[] getEndXY() {
        return new int[] {getEndX(), getEndY()};
    }
    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }
    public double getLength() {
        return begin.distance(end);
    }
    public double getGradient() {
        return Math.atan2(getEndY() - getBeginY(), getEndX() - getBeginX());
    }
    public String toString() {
        return "MyLine[begin=(" + getBeginX() + ", " + getBeginY() + "),end=(" + getEndX() + ", " + getEndY() + ")]";
    }
}
