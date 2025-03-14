package es.uah.matcomp.e1.ejerciciosclases.b.g.MyTriangle;

import java.util.Arrays;

public class TestMyPoint {
    public static void main(String[] args) {
        // Test MyPoint class
        MyPoint p1 = new MyPoint(4, 8);
        System.out.println (p1); // Test MyPoint toString
        MyPoint p3 = new MyPoint();
        System.out.println (p3);

        System.out.println ("la coordenada x es: " + p1.getX());
        System.out.println ("la coordenada y es: " + p1.getY());
        System.out.printf ("el punto 1 es: %s%n", Arrays.toString(p1.getXY()));

        // Test MyPoint setters
        p1.setX(6);
        p1.setY(2);
        System.out.println ("el nuevo punto 1 es: " + p1);
        p1.setXY(4, 4);
        System.out.println ("el nuevo punto 1  es: " + p1);

        // Test distances p2
        MyPoint p2 = new MyPoint(8, 8);
        System.out.println (p2);
        // From this point to the given point
        System.out.printf("la distancia desde el punto p2 %s hasta el punto dado es de: %.2f%n", p2, p2.distance(2, 2));
        // From this point to the given instance of MyPoint
        System.out.printf("la distancia desde el punto p2 %s hasta el punto p1 %s es de: %.2f%n", p2, p1, p2.distance(p1));
        // From this point to (0,0)
        System.out.printf("la distancia desde el punto p2 %s hasta el punto (0,0) es de: %.2f%n", p2, p2.distance());
    }
}
