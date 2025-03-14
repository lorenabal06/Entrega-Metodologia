package es.uah.matcomp.e1.ejerciciosclases.b.e.MyLineMyPoint;

import java.util.Arrays;

public class TestMyPointMyLine {
    public static void main(String[] args) {
        // Test MyPoint class
        MyPoint p1 = new MyPoint(4, 8);
        System.out.println (p1); // Test MyPoint toString
        MyPoint p3 = new MyPoint();
        System.out.println (p3);

        // Test MyPoint gets
        System.out.println ("la coordenada x es: " + p1.getX());
        System.out.println ("la coordenada y es: " + p1.getY());
        System.out.printf ("el punto 1 es: %s%n", Arrays.toString(p1.getXY()));

        // Test MyPoint setters
        p1.setX(6);
        p1.setY(2);
        System.out.println ("el nuevo punto 1 es: " + p1);
        p1.setXY(4, 4);
        System.out.println ("el nuevo punto 1  es: " + p1);

        // Test MyPoint distances p2
        MyPoint p2 = new MyPoint(8, 8);
        System.out.println (p2);
        // From this point to the given point
        System.out.printf("la distancia desde el punto p2 %s hasta el punto dado es de: %.2f%n", p2, p2.distance(2, 2));
        // From this point to the given instance of MyPoint
        System.out.printf("la distancia desde el punto p2 %s hasta el punto p1 %s es de: %.2f%n", p2, p1, p2.distance(p1));
        // From this point to (0,0)
        System.out.printf("la distancia desde el punto p2 %s hasta el punto (0,0) es de: %.2f%n", p2, p2.distance());

        // Test MyLine class
        MyLine l1 = new MyLine (1, 2, 4, 8); // Test MyLine with 4 coordinates
        System.out.println ("l1: " + l1); // Test MyLine toString
        MyLine l2 = new MyLine (p1, p2); // Test MyLine with 2 points
        System.out.println ("l2: " + l2);

        // Test MyLine getters
        System.out.printf ("el principio de la recta l2 es en el punto: %s%n", Arrays.toString(l2.getBeginXY()));
        System.out.printf ("el final de la recta l2 es en el punto: %s%n", Arrays.toString(l2.getEndXY()));
        System.out.printf ("el principio de la recta l1 es en el punto: %s%n", Arrays.toString(l2.getBegin().getXY()));
        System.out.printf ("el final de la recta l1 es en el punto: %s%n", Arrays.toString(l2.getEnd().getXY()));
        System.out.printf ("la coordenada x del principio de la recta l1 es: %s%n", l1.getBeginX());
        System.out.printf ("la coordenada y del principio de la recta l1 es: %s%n", l1.getBeginY());
        System.out.printf ("la coordenada x del final de la recta l1 es: %s%n", l1.getEndX());
        System.out.printf ("la coordenada y del final de la recta l1 es: %s%n", l1.getEndY());

        // Test MyLine setters
        l1.setBegin (p1);
        l1.setEnd (p2);
        System.out.println ("l1 tras setBegin() y setEnd(): " + l1);
        l2.setBeginX (2);
        l2.setBeginY (2);
        l2.setEndX (4);
        l2.setEndY (4);
        System.out.println ("l2 tras setX() y setY(): " + l2);
        l2.setBeginXY(2, 0);
        l2.setEndXY(4, 8);
        System.out.println ("l2 tras setXY(): " + l2);

        // Test Length
        System.out.printf ("El tamaño de la recta l1 es: %.2f%n", l1.getLength());
        System.out.printf ("El tamaño de la recta l2 es: %.2f%n", l2.getLength());

        // Test Gradient
        System.out.printf ("La inclinación de la recta l1 es de %.2f radianes %n", l1.getGradient());
        System.out.printf ("La inclinación de la recta l2 es de %.2f radianes %n", l2.getGradient());
    }
}