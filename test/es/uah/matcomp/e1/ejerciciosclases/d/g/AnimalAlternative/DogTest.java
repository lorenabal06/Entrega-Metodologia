package es.uah.matcomp.e1.ejerciciosclases.d.g.AnimalAlternative;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greeting() {
        Dog ika = new Dog();
        assertDoesNotThrow(() -> ika.greeting()); // Verifica que no lance excepciones
    }

    @Test
    void testGreeting() {
        Dog ika = new Dog();
        Dog suly = new Dog();
        assertDoesNotThrow(() -> ika.greeting(suly)); // Verifica que no lance excepciones al saludar a otro perro
    }
}