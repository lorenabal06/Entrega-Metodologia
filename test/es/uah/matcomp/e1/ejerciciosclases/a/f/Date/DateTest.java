package es.uah.matcomp.e1.ejerciciosclases.a.f.Date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date cumple = new Date(8,12,2006);
        assertEquals(8, cumple.getDay());
    }

    @Test
    void getMonth() {
        Date cumple = new Date(8,12,2006);
        assertEquals(12, cumple.getMonth());
    }

    @Test
    void getYear() {
        Date cumple = new Date(8,12,2006);
        assertEquals(2006, cumple.getYear());
    }

    @Test
    void setDay() {
        Date cumple = new Date(8,12,2006);
        cumple.setDay(7);
        assertEquals(7, cumple.getDay());
    }

    @Test
    void setMonth() {
        Date cumple = new Date(8,12,2006);
        cumple.setMonth(11);
        assertEquals(11, cumple.getMonth());
    }

    @Test
    void setYear() {
        Date cumple = new Date(8,12,2006);
        cumple.setYear(2005);
        assertEquals(2005, cumple.getYear());
    }

    @Test
    void setDate() {
        Date cumple = new Date(8,12,2006);
        cumple.setDate(2, 1, 2013);
        assertEquals(2, cumple.getDay());
        assertEquals(1, cumple.getMonth());
        assertEquals(2013, cumple.getYear());
    }

    @Test
    void testToString() {
        Date cumple = new Date(8,12,2006);
        assertEquals("08/12/2006", cumple.toString());
    }

    @Test
    void testToString1() {
        Date cumple = new Date(18,2,2006);
        assertEquals("18/02/2006", cumple.toString());
    }
}