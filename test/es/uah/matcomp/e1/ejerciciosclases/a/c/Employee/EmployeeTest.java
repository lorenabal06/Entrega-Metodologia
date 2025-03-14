package es.uah.matcomp.e1.ejerciciosclases.a.c.Employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee prueba = new Employee(22, "Lorena", "Ballesteros", 1500);
        assertEquals(22, prueba.getId());
    }

    @Test
    void getFirstName() {
        Employee prueba = new Employee(22, "Lorena", "Ballesteros", 1500);
        assertEquals("Lorena", prueba.getFirstName());
    }

    @Test
    void getLastName() {
        Employee prueba = new Employee(22, "Lorena", "Ballesteros", 1500);
        assertEquals("Ballesteros", prueba.getLastName());
    }

    @Test
    void getName() {
        Employee prueba = new Employee(22, "Lorena", "Ballesteros", 1500);
        assertEquals("Lorena Ballesteros", prueba.getName());
    }

    @Test
    void getSalary() {
        Employee prueba = new Employee(22, "Lorena", "Ballesteros", 1500);
        assertEquals(1500, prueba.getSalary());
    }

    @Test
    void setSalary() {
        Employee prueba = new Employee(22, "Lorena", "Ballesteros", 1500);
        prueba.setSalary(1600);
        assertEquals(1600, prueba.getSalary());
    }

    @Test
    void getAnnualSalary() {
        Employee prueba = new Employee(22, "Lorena", "Ballesteros", 1500);
        assertEquals(18000, prueba.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        Employee prueba = new Employee(22, "Lorena", "Ballesteros", 1500);
        prueba.raiseSalary(10);
        assertEquals(1650, prueba.getSalary());
    }

    @Test
    void testToString() {
        Employee prueba = new Employee(22, "Lorena", "Ballesteros", 1500);
        assertEquals("Employee [id=22, name=Lorena Ballesteros, salary=1500]", prueba.toString());
    }
}