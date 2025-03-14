package es.uah.matcomp.e1.ejerciciosclases.b.b.CustomerInvoice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    void getId() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        assertEquals(8, lore.getId());
    }

    @Test
    void getName() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        assertEquals("Lorena Ballesteros", lore.getName());
    }

    @Test
    void getDiscount() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        assertEquals(5, lore.getDiscount());
    }

    @Test
    void setDiscount() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        lore.setDiscount(15);
        assertEquals(15, lore.getDiscount());
    }

    @Test
    void testToString() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        assertEquals("Lorena Ballesteros(8)(5%)", lore.toString());
    }
}