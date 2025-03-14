package es.uah.matcomp.e1.ejerciciosclases.a.d.InvoiceItem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem prueba = new InvoiceItem ("15", "plane", 20, 14.50);
        assertEquals("15", prueba.getId());
    }

    @Test
    void getDesc() {
        InvoiceItem prueba = new InvoiceItem ("15", "plane", 20, 14.50);
        assertEquals("plane", prueba.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem prueba = new InvoiceItem ("15", "plane", 20, 14.50);
        assertEquals(20, prueba.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem prueba = new InvoiceItem ("15", "plane", 20, 14.50);
        prueba.setQty(10);
        assertEquals(10, prueba.getQty());
    }

    @Test
    void getUnitPrice() {
        InvoiceItem prueba = new InvoiceItem ("15", "plane", 20, 14.50);
        assertEquals(14.50, prueba.getUnitPrice(), 0);
    }

    @Test
    void setUnitPrice() {
        InvoiceItem prueba = new InvoiceItem ("15", "plane", 20, 14.50);
        prueba.setUnitPrice(12.99);
        assertEquals(12.99, prueba.getUnitPrice(), 0);
    }

    @Test
    void getTotal() {
        InvoiceItem prueba = new InvoiceItem ("15", "plane", 20, 14.50);
        assertEquals(290, prueba.getTotal());
    }

    @Test
    void testToString() {
        InvoiceItem prueba = new InvoiceItem ("15", "plane", 20, 14.50);
        assertEquals("InvoiceItem[id=15, desc=plane, qty=20, unitPrice=14.5]", prueba.toString());
    }
}