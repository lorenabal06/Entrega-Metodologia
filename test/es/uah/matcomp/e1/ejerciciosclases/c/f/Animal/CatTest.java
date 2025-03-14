package es.uah.matcomp.e1.ejerciciosclases.c.f.Animal;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    @Test
    void testGreets() {
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(salidaCapturada);
        PrintStream salidaOriginal = System.out;

        System.setOut(printStream); // Redirigir la salida

        Cat cat = new Cat("Maddie");
        cat.greets(); // Debería imprimir

        System.setOut(salidaOriginal); // Restaurar salida

        assertEquals("Meow\r\n", salidaCapturada.toString());
    }

    @Test
    void testToString() {
        Animal c1 = new Cat("Maddie");
        assertEquals("Cat[Mammal[Animal[name=Maddie]]]", c1.toString());
    }
}