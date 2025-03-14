package es.uah.matcomp.e1.ejerciciosclases.a.e.Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account lore = new Account("8", "Lorena");
        assertEquals("8", lore.getId());
    }

    @Test
    void getName() {
        Account lore = new Account("8", "Lorena");
        assertEquals("Lorena", lore.getName());
    }

    @Test
    void getBalance() {
        Account lore = new Account("8", "Lorena", 500);
        assertEquals(500, lore.getBalance());
    }

    @Test
    void credit() {
        Account lore = new Account("8", "Lorena", 500);
        lore.credit(500);
        assertEquals(1000, lore.getBalance());
    }

    @Test
    void debit() {
        Account lore = new Account("8", "Lorena", 500);
        lore.debit(150);
        assertEquals(350, lore.getBalance());
    }

    @Test
    void debit1() {
        Account lore = new Account("8", "Lorena", 500);
        lore.debit(600);
        assertEquals(500, lore.getBalance());
    }
    @Test
    void transferTo() {
        Account lore = new Account("8", "Lorena", 500);
        Account marina = new Account("7", "Marina", 200);
        lore.transferTo(marina, 150);
        assertEquals(350, lore.getBalance());
        assertEquals(350, marina.getBalance());
    }

    @Test
    void transferTo1() {
        Account lore = new Account("8", "Lorena", 500);
        Account marina = new Account("7", "Marina", 200);
        lore.transferTo(marina, 700);
        assertEquals(500, lore.getBalance());
        assertEquals(200, marina.getBalance());
    }

    @Test
    void testToString() {
        Account lore = new Account("8", "Lorena", 500);
        assertEquals("Account[id=8, name=Lorena, balance=500]", lore.toString());
    }
}