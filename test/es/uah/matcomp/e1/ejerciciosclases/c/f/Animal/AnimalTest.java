package es.uah.matcomp.e1.ejerciciosclases.c.f.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    @Test
    void testToString() {
        Animal a1 = new Animal("Maddie");
        assertEquals("Animal[name=Maddie]", a1.toString());
    }
}