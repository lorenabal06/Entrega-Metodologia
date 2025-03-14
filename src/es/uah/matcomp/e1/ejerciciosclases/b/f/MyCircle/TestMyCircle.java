package es.uah.matcomp.e1.ejerciciosclases.b.f.MyCircle;

import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args) {
        // Test MyCircle class
        MyCircle c1 = new MyCircle(); // Test MyCircle()
        System.out.println ("c1: " + c1); // Test MyCircle toString
        MyCircle c2 = new MyCircle(1, 1, 2); // Test MyCircle(int, int, radius)
        System.out.println ("c2: " + c2);
        MyPoint p4 = new MyPoint(2, 2);
        MyCircle c3 = new MyCircle(p4, 3); // Test MyCircle(MyPoint, radius)
        System.out.println ("c3: " + c3);

        // Test MyCircle getters
        System.out.println ("el radio del círculo c2 es: " + c2.getRadius());
        System.out.println ("el centro del círculo c2 es en el punto: " + c2.getCenter().toString());
        System.out.println ("la coordenada X del centro del círculo c3 es: " + c3.getCenterX());
        System.out.println ("la coordenada Y del centro del círculo c3 es: " + c3.getCenterY());
        System.out.println ("el centro del círculo c1 es en el punto: " + Arrays.toString(c1.getCenterXY()));
        System.out.printf ("el área del círculo c1 es: %.2f%n", c1.getArea());
        System.out.printf ("el perímetro del círculo c1 es: %.2f%n", c1.getCircumference());

        // Test MyCircle setters
        c1.setRadius(4);
        System.out.println ("c1 tras setRadius(): " + c1);
        MyPoint p5 = new MyPoint(2, 2);
        c2.setCenter(p5);
        System.out.println ("c2 tras setCenter(): " + c2);
        c1.setCenterX(6);
        c1.setCenterY(6);
        System.out.println ("c1 tras setCenterX() y setCenterY(): " + c1);
        c2.setCenterXY(3, 3);
        System.out.println ("c2 tras setCenterXY(): " + c2);

        // Test MyCircle distance
        System.out.printf("la distancia desde el círculo c2 %s hasta el círculo c1 %s es de: %.2f%n", c2, c1, c1.distance(c2));
    }
}
