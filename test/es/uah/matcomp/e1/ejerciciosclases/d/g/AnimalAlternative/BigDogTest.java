package es.uah.matcomp.e1.ejerciciosclases.d.g.AnimalAlternative;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greeting() {
        BigDog ika = new BigDog();
        assertDoesNotThrow(() -> ika.greeting()); // Solo verifica que no lance errores
    }

    @Test
    void testGreeting() {
        BigDog ika = new BigDog();
        Dog suly = new BigDog(); // Puede ser un BigDog o un Dog normal
        assertDoesNotThrow(() -> ika.greeting(suly)); // Verifica que no lance errores
    }
}
