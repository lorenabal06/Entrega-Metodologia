package es.uah.matcomp.e1.ejerciciosclases.c.b.PersonStudentStaff;

import es.uah.matcomp.e1.ejerciciosclases.c.b.PersonStudentStaff.Person;

public class Staff extends Person {
    // Variables
    private String school;
    private double pay;

    // Programa
    public Staff(String name, String adress, String school, double pay) {
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }
    @Override
    public String toString() {
        return "Staff[" + super.toString()  + "],school=" + school + ", pay=" + pay + "]";
    }
}
