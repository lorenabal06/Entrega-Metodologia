package es.uah.matcomp.e1.ejerciciosclases.d.f.Animal;

public class BigDog extends Dog {
    // Programa
    public BigDog(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Wooof");
    }
    @Override
    public void greets(Dog another) {
        System.out.println("Woooooof");
    }
    public void greets(BigDog another) {
        System.out.println("Wooooooooof");
    }
}
