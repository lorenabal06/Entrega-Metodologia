package es.uah.matcomp.e1.ejerciciosclases.d.f.Animal;

public class Dog extends Animal {
    // Programa
    public Dog(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
}
