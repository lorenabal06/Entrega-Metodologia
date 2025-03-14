package es.uah.matcomp.e1.ejerciciosclases.b.g.MyTriangle;

public class MyTriangle {
    // Variables
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    // Programa
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setX(x1);
        v1.setY(y1);
        v2.setX(x2);
        v2.setY(y2);
        v3.setX(x3);
        v3.setY(y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString() {
        return ("MyTriangle[v1=" + v1 + ", " + v2 + ", " + v3 + "]");
    }
    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        if (v2.distance(v3) == v2.distance(v1) || v3.distance(v1) == v3.distance(v2)) {
            return "Isósceles";
        }
        else {
            return "Escaleno";
        }
    }
}
