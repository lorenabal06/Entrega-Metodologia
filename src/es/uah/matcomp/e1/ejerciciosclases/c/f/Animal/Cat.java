package es.uah.matcomp.e1.ejerciciosclases.c.f.Animal;

import es.uah.matcomp.e1.ejerciciosclases.c.f.Animal.Mammal;

public class Cat extends Mammal {
    // Programa
    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
