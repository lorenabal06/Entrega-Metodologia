package es.uah.matcomp.e1.ejerciciosclases.b.a.AuthorBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {

    @Test
    void getName() {
        Author thriller = new Author("Juan Gómez Jurado", "juan@gmail.com");
        assertEquals("Juan Gómez Jurado", thriller.getName());
    }

    @Test
    void getEmail() {
        Author thriller = new Author("Juan Gómez Jurado", "juan@gmail.com");
        assertEquals("juan@gmail.com", thriller.getEmail());
    }

    @Test
    void setEmail() {
        Author thriller = new Author("Juan Gómez Jurado", "juan@gmail.com");
        thriller.setEmail("juangomez@gmail.com");
        assertEquals("juangomez@gmail.com", thriller.getEmail());
    }

    @Test
    void testToString() {
        Author thriller = new Author("Juan Gómez Jurado", "juan@gmail.com");
        assertEquals("Author[name=Juan Gómez Jurado,email=juan@gmail.com]", thriller.toString());
    }
}