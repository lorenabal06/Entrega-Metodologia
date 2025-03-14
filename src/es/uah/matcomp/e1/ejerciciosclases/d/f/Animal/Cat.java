package es.uah.matcomp.e1.ejerciciosclases.d.f.Animal;

public class Cat extends Animal {
    // Programa
    public Cat(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
