package es.uah.matcomp.e1.ejerciciosclases.d.g.AnimalAlternative;

public class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Wooof");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooof");
    }
}