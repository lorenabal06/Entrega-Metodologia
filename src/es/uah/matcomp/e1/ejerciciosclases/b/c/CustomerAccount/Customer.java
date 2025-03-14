package es.uah.matcomp.e1.ejerciciosclases.b.c.CustomerAccount;

public class Customer {
    private static String info;
    private int id;
    private String name;
    private char gender;
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }

    public String getName() {
            return name;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return name + "(" + id + ")";
    }
}
