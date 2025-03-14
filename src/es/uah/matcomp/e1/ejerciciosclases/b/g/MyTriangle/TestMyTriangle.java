package es.uah.matcomp.e1.ejerciciosclases.b.g.MyTriangle;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Test MyTriangle class
        MyTriangle t1 = new MyTriangle (0, 0, 10, 12, 20, 0);
        System.out.println(t1); // Test toString()
        MyPoint p1 = new MyPoint(5, 7);
        MyPoint p2 = new MyPoint(8, 2);
        MyPoint p3 = new MyPoint(6, 3);
        MyTriangle t2 = new MyTriangle (p1, p2, p3);
        System.out.println(t2);

        // Test getters
        System.out.printf ("el perímetro del triángulo t1 %s es: %.2f%n", t1, t1.getPerimeter());
        System.out.printf ("el perímetro del triángulo t2 %s es: %.2f%n", t2, t2.getPerimeter());
        System.out.printf ("el triángulo t1 %s es: %s%n", t1, t1.getType());
        System.out.printf ("el triángulo t1 %s es: %s%n", t2, t2.getType());
    }
}
