package es.uah.matcomp.e1.ejerciciosclases.c.f.Animal;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    @Test
    void greets() {
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(salidaCapturada);
        PrintStream salidaOriginal = System.out;

        System.setOut(printStream); // Redirigir la salida

        Dog dog = new Dog("Suly");
        dog.greets(); // Debería imprimir "Woof"

        System.setOut(salidaOriginal); // Restaurar salida

        assertEquals("Woof\r\n", salidaCapturada.toString());
    }

    @Test
    void testGreets() {
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(salidaCapturada);
        PrintStream salidaOriginal = System.out;

        System.setOut(printStream); // Redirigir la salida

        Dog dog = new Dog("Suly");
        dog.greets(dog); // Debería imprimir "Woooof"

        System.setOut(salidaOriginal); // Restaurar salida

        assertEquals("Woooof\r\n", salidaCapturada.toString());
    }

    @Test
    void testToString() {
        Animal d1 = new Dog("Suly");
        assertEquals("Dog[Mammal[Animal[name=Suly]]]", d1.toString());
    }
}