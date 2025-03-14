package es.uah.matcomp.e1.ejerciciosclases.d.f.Animal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class CatTest {

    @Test
    void greets() {
        Cat cat = new Cat("Maddie");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        cat.greets();

        System.setOut(System.out);

        assertEquals("Meow\n", outContent.toString());
    }
}