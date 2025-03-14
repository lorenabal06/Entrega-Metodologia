package es.uah.matcomp.e1.ejerciciosclases.a.g.Time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time hora = new Time(18,5,35);
        assertEquals(18, hora.getHour());
    }

    @Test
    void getMinute() {
        Time hora = new Time(18,5,35);
        assertEquals(5,hora.getMinute());
    }

    @Test
    void getSecond() {
        Time hora = new Time(18,5,35);
        assertEquals(35,hora.getSecond());
    }

    @Test
    void setHour() {
        Time hora = new Time(18,5,35);
        hora.setHour(17);
        assertEquals(17, hora.getHour());
    }

    @Test
    void setHour1() {
        Time hora = new Time(18,5,35);
        hora.setHour(34);
        assertEquals(10, hora.getHour());
    }

    @Test
    void setHour2() {
        Time hora = new Time(18,5,35);
        hora.setHour(-5);
        assertEquals(19, hora.getHour());
    }

    @Test
    void setMinute() {
        Time hora = new Time(18,5,35);
        hora.setMinute(4);
        assertEquals(4, hora.getMinute());
    }

    @Test
    void setMinute1() {
        Time hora = new Time(18,5,35);
        hora.setMinute(80);
        assertEquals(20, hora.getMinute());
    }

    @Test
    void setMinute2() {
        Time hora = new Time(18,5,35);
        hora.setMinute(-3);
        assertEquals(57, hora.getMinute());
    }

    @Test
    void setSecond() {
        Time hora = new Time(18,5,35);
        hora.setSecond(34);
        assertEquals(34, hora.getSecond());
    }

    @Test
    void setSecond1() {
        Time hora = new Time(18,5,35);
        hora.setSecond(80);
        assertEquals(20, hora.getSecond());
    }

    @Test
    void setSecond2() {
        Time hora = new Time(18,5,35);
        hora.setSecond(-26);
        assertEquals(34, hora.getSecond());
    }

    @Test
    void setTime() {
        Time hora = new Time(18,5,35);
        hora.setTime(8, 0, 0);
        assertEquals(8, hora.getHour());
        assertEquals(0, hora.getMinute());
        assertEquals(0, hora.getSecond());
    }

    @Test
    void testToString() {
        Time hora = new Time(18,5,35);
        assertEquals("18:05:35", hora.toString());
    }

    @Test
    void testToString1() {
        Time hora = new Time(8,5,35);
        assertEquals("08:05:35", hora.toString());
    }

    @Test
    void testToString2() {
        Time hora = new Time(18,15,5);
        assertEquals("18:15:05", hora.toString());
    }

    @Test
    void testToString3() {
        Time hora = new Time(18,5,35);
        assertEquals("18:05:35", hora.toString());
    }

    @Test
    void nextSecond() {
        Time hora = new Time(18,5,35);
        hora.nextSecond();
        assertEquals("18:05:36",hora.toString());
    }

    @Test
    void nextSecond1() {
        Time hora = new Time(18,5,59);
        hora.nextSecond();
        assertEquals("18:06:00",hora.toString());
    }

    @Test
    void nextSecond2() {
        Time hora = new Time(18,59,59);
        hora.nextSecond();
        assertEquals("19:00:00",hora.toString());
    }

    @Test
    void nextSecond3() {
        Time hora = new Time(23,59,59);
        hora.nextSecond();
        assertEquals("00:00:00",hora.toString());
    }

    @Test
    void previousSecond() {
        Time hora = new Time(18,5,35);
        hora.previousSecond();
        assertEquals("18:05:34",hora.toString());
    }

    @Test
    void previousSecond1() {
        Time hora = new Time(0, 0, 0);
        hora.previousSecond();
        assertEquals("23:59:59",hora.toString());
    }

    @Test
    void previousSecond2() {
        Time hora = new Time(18,5, 0);
        hora.previousSecond();
        assertEquals("18:04:59",hora.toString());
    }

    @Test
    void previousSecond3() {
        Time hora = new Time(18,0,0);
        hora.previousSecond();
        assertEquals("17:59:59",hora.toString());
    }
}