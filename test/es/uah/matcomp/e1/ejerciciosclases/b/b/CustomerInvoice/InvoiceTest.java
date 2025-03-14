package es.uah.matcomp.e1.ejerciciosclases.b.b.CustomerInvoice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {

    @Test
    void getId() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        Invoice invlore = new Invoice(8, lore, 500);
        assertEquals(8, invlore.getId());
    }

    @Test
    void getCustomer() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        Invoice invlore = new Invoice(8, lore, 500);
        assertEquals(lore, invlore.getCustomer());
    }

    @Test
    void setCustomer() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        Customer brianda = new Customer(8, "Brianda García", 5);
        Invoice invlore = new Invoice(8, lore, 500);
        invlore.setCustomer(brianda);
        assertEquals(brianda, invlore.getCustomer());
    }

    @Test
    void getAmount() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        Invoice invlore = new Invoice(8, lore, 500);
        assertEquals(500, invlore.getAmount());
    }

    @Test
    void setAmount() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        Invoice invlore = new Invoice(8, lore, 500);
        invlore.setAmount(1500);
        assertEquals(1500, invlore.getAmount());
    }

    @Test
    void getCustomerId() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        Invoice invlore = new Invoice(8, lore, 500);
        assertEquals(8, invlore.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        Invoice invlore = new Invoice(8, lore, 500);
        assertEquals("Lorena Ballesteros", invlore.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        Invoice invlore = new Invoice(8, lore, 500);
        assertEquals(5, invlore.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        Invoice invlore = new Invoice(8, lore, 500);
        assertEquals(475, invlore.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        Customer lore = new Customer(8, "Lorena Ballesteros", 5);
        Invoice invlore = new Invoice(8, lore, 500);
        assertEquals("Invoice[id=8,customer=Lorena Ballesteros(8)(5%),amount=500.0]", invlore.toString());
    }
}