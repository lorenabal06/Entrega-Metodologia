package es.uah.matcomp.e1.ejerciciosclases.d.g.AnimalAlternative;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greeting() {
        Cat maddie = new Cat();
        assertDoesNotThrow(() -> maddie.greeting()); // Verifica que no lance excepciones
    }
}