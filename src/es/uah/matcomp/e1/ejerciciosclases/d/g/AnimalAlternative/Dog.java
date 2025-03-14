package es.uah.matcomp.e1.ejerciciosclases.d.g.AnimalAlternative;

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }
}