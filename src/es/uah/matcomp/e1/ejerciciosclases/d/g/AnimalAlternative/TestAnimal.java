package es.uah.matcomp.e1.ejerciciosclases.d.g.AnimalAlternative;

public class TestAnimal {
    public static void main(String[] args) {
        // Usando subclases directamente
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Usando polimorfismo
        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();

        // Downcast
        if (animal2 instanceof Dog) {
            Dog dog2 = (Dog) animal2;
            dog2.greeting();
        }

        if (animal3 instanceof BigDog) {
            BigDog bigDog2 = (BigDog) animal3;
            bigDog2.greeting();
        }

        // Evita un ClassCastException
        if (animal2 instanceof Cat) {
            Cat cat2 = (Cat) animal2;
        } else {
            System.out.println("No se puede convertir Dog en Cat.");
        }
    }
}
