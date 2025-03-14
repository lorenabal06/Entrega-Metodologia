package es.uah.matcomp.e1.ejerciciosclases.b.a.AuthorBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    void getIsbn() {
        Author juan = new Author("Juan Gómez Jurado", "juan@gmail.com");
        Book thriller = new Book("9788466664417", "Reina Roja", juan, 20.90);
        assertEquals("9788466664417", thriller.getIsbn());
    }

    @Test
    void getName() {
        Author juan = new Author("Juan Gómez Jurado", "juan@gmail.com");
        Book thriller = new Book("9788466664417", "Reina Roja", juan, 20.90);
        assertEquals("Reina Roja", thriller.getName());
    }

    @Test
    void getAuthor() {
        Author juan = new Author("Juan Gómez Jurado", "juan@gmail.com");
        Book thriller = new Book("9788466664417", "Reina Roja", juan, 20.90);
        assertEquals("Author[name=Juan Gómez Jurado,email=juan@gmail.com]", thriller.getAuthor().toString());
    }

    @Test
    void getPrice() {
        Author juan = new Author("Juan Gómez Jurado", "juan@gmail.com");
        Book thriller = new Book("9788466664417", "Reina Roja", juan, 20.90, 15);
        assertEquals(20.90, thriller.getPrice());
    }

    @Test
    void setPrice() {
        Author juan = new Author("Juan Gómez Jurado", "juan@gmail.com");
        Book thriller = new Book("9788466664417", "Reina Roja", juan, 20.90, 15);
        thriller.setPrice(18.90);
        assertEquals(18.90, thriller.getPrice());
    }

    @Test
    void getQty() {
        Author juan = new Author("Juan Gómez Jurado", "juan@gmail.com");
        Book thriller = new Book("9788466664417", "Reina Roja", juan, 20.90, 15);
        assertEquals(15, thriller.getQty());
    }

    @Test
    void setQty() {
        Author juan = new Author("Juan Gómez Jurado", "juan@gmail.com");
        Book thriller = new Book("9788466664417", "Reina Roja", juan, 20.90, 15);
        thriller.setQty(20);
        assertEquals(20, thriller.getQty());
    }

    @Test
    void getAuthorName() {
        Author juan = new Author("Juan Gómez Jurado", "juan@gmail.com");
        Book thriller = new Book("9788466664417", "Reina Roja", juan, 20.90, 15);
        assertEquals("Juan Gómez Jurado", thriller.getAuthorName());
    }

    @Test
    void testToString() {
        Author juan = new Author("Juan Gómez Jurado", "juan@gmail.com");
        Book thriller = new Book("9788466664417", "Reina Roja", juan, 20.90, 15);
        assertEquals("Book[isbn=9788466664417,name=Reina Roja,Author[name=Juan Gómez Jurado,email=juan@gmail.com,price=20.9,qty=15]", thriller.toString());
    }
}