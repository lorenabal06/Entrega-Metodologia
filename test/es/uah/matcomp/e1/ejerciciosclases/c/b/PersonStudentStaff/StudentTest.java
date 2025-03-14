package es.uah.matcomp.e1.ejerciciosclases.c.b.PersonStudentStaff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void getProgram() {
        Student s1 = new Student("Lorena Ballesteros", "Calle Miralrío, nº 12", "Matemáticas y Computación", 2024, 423.5);
        assertEquals("Matemáticas y Computación", s1.getProgram());
    }

    @Test
    void setProgram() {
        Student s1 = new Student("Lorena Ballesteros", "Calle Miralrío, nº 12", "Matemáticas y Computación", 2024, 423.5);
        s1.setProgram("Enfermería");
        assertEquals("Enfermería", s1.getProgram());
    }

    @Test
    void getYear() {
        Student s1 = new Student("Lorena Ballesteros", "Calle Miralrío, nº 12", "Matemáticas y Computación", 2024, 423.5);
        assertEquals(2024, s1.getYear());
    }

    @Test
    void setYear() {
        Student s1 = new Student("Lorena Ballesteros", "Calle Miralrío, nº 12", "Matemáticas y Computación", 2024, 423.5);
        s1.setYear(2025);
        assertEquals(2025, s1.getYear());
    }

    @Test
    void getFee() {
        Student s1 = new Student("Lorena Ballesteros", "Calle Miralrío, nº 12", "Matemáticas y Computación", 2024, 423.5);
        assertEquals(423.5, s1.getFee());
    }

    @Test
    void setFee() {
        Student s1 = new Student("Lorena Ballesteros", "Calle Miralrío, nº 12", "Matemáticas y Computación", 2024, 423.5);
        s1.setFee(438.7);
        assertEquals(438.7, s1.getFee());
    }

    @Test
    void testToString() {
        Student s1 = new Student("Lorena Ballesteros", "Calle Miralrío, nº 12", "Matemáticas y Computación", 2024, 423.5);
        assertEquals("Student[Person [name=Lorena Ballesteros, adress=Calle Miralrío, nº 12]],program=Matemáticas y Computación,year=2024, fee=423.5]", s1.toString());
    }
}