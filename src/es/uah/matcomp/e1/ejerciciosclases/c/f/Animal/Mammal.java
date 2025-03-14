package es.uah.matcomp.e1.ejerciciosclases.c.f.Animal;

public class Mammal extends Animal {
    // Programa
    public Mammal(String name){
        super(name);
    }
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
