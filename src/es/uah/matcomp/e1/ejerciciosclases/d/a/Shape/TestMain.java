package es.uah.matcomp.e1.ejerciciosclases.d.a.Shape;

public class TestMain {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(s1.getArea());          // which version?
        System.out.println(s1.getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //ERROR: System.out.println(s1.getRadius());
        System.out.println(((Circle) s1).getRadius());  //Hacer downcasting a Circle antes de llamar al método

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //ERROR: Shape s2 = new Shape();
        Shape s2 = new Circle(2.0, "blue", true);  //Eliminar esta línea o instanciar una subclase concreta de Shape, como Circle o Rectangle, no se puede instanciar una clase abstracta

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //ERROR: System.out.println(s3.getLength());
        System.out.println(((Rectangle) s3).getLength());  //Downcasting necesario a Rectangle antes de llamar al método

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //ERROR: System.out.println(s4.getSide());
        System.out.println(((Square) s4).getSide());  //Downcasting necesario a Square

// Take note that we downcast Shape s4 to Rectangle,
//  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //ERROR: System.out.println(r2.getSide());
        System.out.println(((Square) r2).getSide());  //Aquí se necesita downcasting a Square porque getSide() no está en Rectangle
        System.out.println(r2.getLength());
        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
