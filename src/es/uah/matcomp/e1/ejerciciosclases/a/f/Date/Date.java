package es.uah.matcomp.e1.ejerciciosclases.a.f.Date;

public class Date {
    private String cerodia;
    private String ceromes;
    private int day;
    private int month;
    private int year;

    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString() {
        if (day < 10){
            this.cerodia = "0";
        }
        else{
            this.cerodia = "";
        }
        if (month < 10){
            this.ceromes = "0";
        }
        else{
            this.ceromes = "";
        }
        return cerodia + day + "/" + ceromes + month + "/" + year;
    }
}
