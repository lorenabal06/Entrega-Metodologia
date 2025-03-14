package es.uah.matcomp.e1.ejerciciosclases.b.d.MyPoint;

public class TestMatriz10por10 {
    public static void main(String[] args) {
        // Crear un array de 10 puntos MyPoint
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Imprimir la matriz de distancias
        System.out.println("Matriz de distancias entre puntos:");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                System.out.printf("%.2f\t", points[i].distance(points[j]));
            }
            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}
