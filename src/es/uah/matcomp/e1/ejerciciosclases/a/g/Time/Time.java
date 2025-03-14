package es.uah.matcomp.e1.ejerciciosclases.a.g.Time;

public class Time {
    private String cerohora;
    private String ceromins;
    private String cerosegs;
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        if (hour > 23) {
            hour -= 24; // Probado
        }
        if (hour < 0) {
            hour += 24; // Probado
        }
        this.hour = hour;
    }
    public void setMinute(int minute) {
        if (minute > 59) {
            minute -= 60; // Probado
        }
        if (minute < 0) {
            minute += 60; // Probado
        }
        this.minute = minute;
    }
    public void setSecond(int second) {
        if (second > 59) {
            second -= 60; // Probado
        }
        if (second < 0) {
            second += 60; // Probado
        }
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString() {
        if (hour < 10){
            this.cerohora = "0"; // Probado
        }
        else{
            this.cerohora = "";
        }
        if (minute < 10){
            this.ceromins = "0";
        }
        else{
            this.ceromins = ""; // Probado
        }
        if (second < 10){
            this.cerosegs = "0"; // Probado
        }
        else{
            this.cerosegs = "";
        }
        return cerohora + hour + ":" + ceromins + minute + ":" + cerosegs + second;
    }
    public Time nextSecond() {
        second += 1;
        if (second == 60){ // Probado
            second = 0;
            minute += 1;
            if (minute == 60){
                minute = 0;
                hour += 1;
                if (hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }
    public Time previousSecond() {
        second -= 1;
        if (second == -1){
            second = 59;
            minute -= 1;
            if (minute == -1){
                minute = 59;
                hour -= 1;
                if (hour == -1){
                    hour = 23;
                }
            }
        }

        return this;
    }
}
