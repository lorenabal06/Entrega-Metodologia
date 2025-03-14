package es.uah.matcomp.e1.ejerciciosclases.c.b.PersonStudentStaff;

public class Student extends Person {
    // Variables
    private String program;
    private int year;
    private double fee;

    // Programa
    public Student(String name, String adress, String program, int year, double fee) {
        super(name, adress);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString() {
        return "Student[" + super.toString() + "],program=" + program + ",year=" + year + ", fee=" + fee + "]";
    }
}
