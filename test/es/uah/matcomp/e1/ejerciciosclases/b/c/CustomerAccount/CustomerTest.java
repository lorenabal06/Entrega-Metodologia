package es.uah.matcomp.e1.ejerciciosclases.b.c.CustomerAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    void getId() {
        Customer cliente = new Customer(26, "Martín", 'm');
        assertEquals(26, cliente.getId());
    }

    @Test
    void getName() {
        Customer cliente = new Customer(26, "Martín", 'm');
        assertEquals("Martín", cliente.getName());
    }

    @Test
    void getGender() {
        Customer cliente = new Customer(26, "Martín", 'm');
        assertEquals('m', cliente.getGender());
    }

    @Test
    void testToString() {
        Customer cliente = new Customer(26, "Martín", 'm');
        assertEquals("Martín(26)", cliente.toString());
    }
}