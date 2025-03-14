package es.uah.matcomp.e1.ejerciciosclases.b.c.CustomerAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void getId() {
        Customer cliente = new Customer(26, "Martín", 'm');
        Account martin = new Account(2, cliente, 635.75);
        assertEquals(2, martin.getId());
    }

    @Test
    void getCustomer() {
        Customer cliente = new Customer(26, "Martín", 'm');
        Account martin = new Account(2, cliente, 635.75);
        assertEquals(cliente, martin.getCustomer());
    }

    @Test
    void getBalance() {
        Customer cliente = new Customer(26, "Martín", 'm');
        Account martin = new Account(2, cliente, 635.75);
        assertEquals(635.75, martin.getBalance());
    }

    @Test
    void setBalance() {
        Customer cliente = new Customer(26, "Martín", 'm');
        Account martin = new Account(2, cliente, 635.75);
        martin.setBalance(700);
        assertEquals(700, martin.getBalance());
    }

    @Test
    void testToString() {
        Customer cliente = new Customer(26, "Martín", 'm');
        Account martin = new Account(2, cliente, 635.75);
        assertEquals("Martín(26)balance=$635.75", martin.toString());
    }

    @Test
    void getCustomerName() {
        Customer cliente = new Customer(26, "Martín", 'm');
        Account martin = new Account(2, cliente, 635.75);
        assertEquals("Martín(26)", martin.getCustomerName());
    }

    @Test
    void deposit() {
        Customer cliente = new Customer(26, "Martín", 'm');
        Account martin = new Account(2, cliente, 635.75);
        martin.deposit(114.25);
        assertEquals(750, martin.getBalance());
    }

    @Test
    void withdraw() {
        Customer cliente = new Customer(26, "Martín", 'm');
        Account martin = new Account(2, cliente, 635.75);
        martin.withdraw(15.75);
        assertEquals(620, martin.getBalance());
    }

    @Test
    void withdraw1() {
        Customer cliente = new Customer(26, "Martín", 'm');
        Account martin = new Account(2, cliente, 635.75);
        martin.withdraw(700);
        assertEquals(635.75, martin.getBalance());
    }
}