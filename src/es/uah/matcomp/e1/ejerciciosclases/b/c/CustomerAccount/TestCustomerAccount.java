package es.uah.matcomp.e1.ejerciciosclases.b.c.CustomerAccount;

public class TestCustomerAccount {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer (93, "Lorena Balllesteros", 'f');
        System.out.println(c1); // Customer's toString

        System.out.println ("id is: " + c1.getId());
        System.out.println ("name is: " + c1.getName());
        System.out.println ("gender is: " + c1.getGender());

        // Test Account class
        Account a1 = new Account (93, c1, 1560.23);
        System.out.println (a1); // Account toString

        System.out.println ("id is: " + a1.getId());
        System.out.println ("customer is: " + a1.getCustomer());
        System.out.println ("balance is: " + a1.getBalance());
        System.out.println ("customer's name is: " + a1.getCustomerName());
        a1.setBalance(1498.60);
        System.out.printf ("new balance is: %.2f%n", a1.getBalance());
        a1.deposit(82.10);
        System.out.printf ("balance + deposit is: %.2f%n", a1.getBalance());
        a1.withdraw(1000.00); // balance >= amount
        System.out.printf ("balance + withdraw is: %.2f%n", a1.getBalance());
        a1.withdraw(1000.00); // balance < amount
    }
}
