package es.uah.matcomp.e1.ejerciciosclases.d.f.Animal;

abstract class Animal {
    // Variables
    private String name;

    // Programa
    public Animal (String name) {
        this.name = name;
    }
    abstract public void greets();
}
