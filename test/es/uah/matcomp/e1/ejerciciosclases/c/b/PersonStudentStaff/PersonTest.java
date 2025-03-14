package es.uah.matcomp.e1.ejerciciosclases.c.b.PersonStudentStaff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void getName() {
        Person p1 = new Person("Lorena Ballesteros", "Calle Miralrío, nº 12");
        assertEquals("Lorena Ballesteros", p1.getName());
    }

    @Test
    void getAdress() {
        Person p1 = new Person("Lorena Ballesteros", "Calle Miralrío, nº 12");
        assertEquals("Calle Miralrío, nº 12", p1.getAdress());
    }

    @Test
    void setAdress() {
        Person p1 = new Person("Lorena Ballesteros", "Calle Miralrío, nº 12");
        p1.setAdress("Avenida de América, nº 4");
        assertEquals("Avenida de América, nº 4", p1.getAdress());
    }

    @Test
    void testToString() {
        Person p1 = new Person("Lorena Ballesteros", "Calle Miralrío, nº 12");
        assertEquals("Person [name=Lorena Ballesteros, adress=Calle Miralrío, nº 12]", p1.toString());
    }
}