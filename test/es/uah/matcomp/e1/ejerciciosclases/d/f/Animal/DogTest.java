package es.uah.matcomp.e1.ejerciciosclases.d.f.Animal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class DogTest {

    @Test
    void greets() {
        Dog dog = new Dog("Ika");

        // Capturar la salida de la consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog.greets();

        // Restaurar la salida estándar
        System.setOut(System.out);

        assertEquals("Woof\n", outContent.toString());
    }

    @Test
    void testGreets() {
        Dog dog1 = new Dog("Ika");
        Dog dog2 = new Dog("Suly");

        // Capturar la salida de la consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        dog1.greets(dog2);

        // Restaurar la salida estándar
        System.setOut(System.out);

        assertEquals("Woooof\n", outContent.toString());
    }
}