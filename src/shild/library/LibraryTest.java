package shild.library;

public class LibraryTest {
    public static void main(String[] args) {
        Autor1 autor1 =new Autor1("Hexinak","Azganun",54);
        Book1 book1 =new Book1("ananun",44, 45, autor1);

        System.out.println(book1.autor1.surname);
    }
}
