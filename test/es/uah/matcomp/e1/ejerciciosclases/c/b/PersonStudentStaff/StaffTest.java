package es.uah.matcomp.e1.ejerciciosclases.c.b.PersonStudentStaff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaffTest {

    @Test
    void getSchool() {
        Staff s1 = new Staff("Lorena Ballesteros", "Calle Miralrío, nº 12", "Universidad de Alcalá", 1450.7);
        assertEquals("Universidad de Alcalá", s1.getSchool());
    }

    @Test
    void setSchool() {
        Staff s1 = new Staff("Lorena Ballesteros", "Calle Miralrío, nº 12", "Universidad de Alcalá", 1450.7);
        s1.setSchool("Universidad de Almería");
        assertEquals("Universidad de Almería", s1.getSchool());
    }

    @Test
    void getPay() {
        Staff s1 = new Staff("Lorena Ballesteros", "Calle Miralrío, nº 12", "Universidad de Alcalá", 1450.7);
        assertEquals(1450.7, s1.getPay());
    }

    @Test
    void setPay() {
        Staff s1 = new Staff("Lorena Ballesteros", "Calle Miralrío, nº 12", "Universidad de Alcalá", 1450.7);
        s1.setPay(1565.0);
        assertEquals(1565.0, s1.getPay());
    }

    @Test
    void testToString() {
        Staff s1 = new Staff("Lorena Ballesteros", "Calle Miralrío, nº 12", "Universidad de Alcalá", 1450.7);
        assertEquals("Staff[Person [name=Lorena Ballesteros, adress=Calle Miralrío, nº 12]],school=Universidad de Alcalá, pay=1450.7]", s1.toString());
    }
}