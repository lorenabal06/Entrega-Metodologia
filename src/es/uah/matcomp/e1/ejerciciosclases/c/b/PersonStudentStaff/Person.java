package es.uah.matcomp.e1.ejerciciosclases.c.b.PersonStudentStaff;

public class Person {
    // Variables
    private String name;
    private String adress;

    // Programa
    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    public String getName() {
        return name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String toString() {
        return "Person [name=" + name + ", adress=" + adress + "]";
    }
}