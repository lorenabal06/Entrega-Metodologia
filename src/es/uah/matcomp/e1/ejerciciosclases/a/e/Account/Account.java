package es.uah.matcomp.e1.ejerciciosclases.a.e.Account;

public class Account {
    private String id;
    private String name;
    private int balance; {
        this.balance = 0;
    }
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        this.balance += amount;
        return balance;
    }
    public int debit(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account another, int amount) {
        if (amount <= balance){
            this.balance -= amount;
            another.balance += amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
