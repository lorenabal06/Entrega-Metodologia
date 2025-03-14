package es.uah.matcomp.e1.ejerciciosclases.c.f.Animal;

import es.uah.matcomp.e1.ejerciciosclases.c.f.Animal.Mammal;

public class Dog extends Mammal {
    // Programa
    public Dog (String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
