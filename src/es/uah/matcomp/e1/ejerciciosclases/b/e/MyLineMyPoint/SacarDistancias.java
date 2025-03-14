package es.uah.matcomp.e1.ejerciciosclases.b.e.MyLineMyPoint;

public class SacarDistancias {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(20, 0);
        MyPoint v2 = new MyPoint(10, 12);
        MyPoint v3 = new MyPoint(0, 0);
        // From this point to the given instance of MyPoint
        System.out.printf("la distancia de v1 %s a v2 %s es: %.2f%n", v1, v2, v2.distance(v1));
        System.out.printf("la distancia de v2 %s a v3 %s es: %.2f%n", v2, v3, v2.distance(v3));
        System.out.printf("la distancia de v1 %s a v3 %s es: %.2f%n", v1, v3, v1.distance(v3));
        MyPoint v4 = new MyPoint(0, 0);
        MyPoint v5 = new MyPoint(20, 0);
        MyPoint v6 = new MyPoint(10, 12);
        // From this point to the given instance of MyPoint
        System.out.printf("la distancia de v4 %s a v5 %s es: %.2f%n", v4, v5, v5.distance(v4));
        System.out.printf("la distancia de v5 %s a v6 %s es: %.2f%n", v5, v6, v5.distance(v6));
        System.out.printf("la distancia de v4 %s a v6 %s es: %.2f%n", v4, v6, v4.distance(v6));
    }
}