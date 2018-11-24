package shild.authorbook;

public class DynamicArrayForBook {
    private Book[] arrayBook = new Book[16];
    private Author[] arrayAuthor = new Author[16];
    private int booksize = 0;
    private int authorSize = 0;

    public void add(Book value) {
        if (booksize == arrayBook.length) {
            extend();
        }
        arrayBook[booksize] = value;
        booksize++;
    }

    public void add(Author value) {
        if (authorSize == arrayAuthor.length) {
            extendAuthor();
        }
        arrayAuthor[authorSize] = value;
        authorSize++;
    }
public void extendBook(){
        Book[]tmp=new Book[arrayBook.length+10];
    for (int i = 0; i <arrayBook.length ; i++) {
        tmp[i]=arrayBook[i];

    }
    arrayBook=tmp;
}

    private void extendAuthor() {
        Author[] tmp = new Author[arrayAuthor.length + 10];
        for (int i = 0; i < arrayAuthor.length; i++) {
            tmp[i] = arrayAuthor[i];
        }
        arrayAuthor = tmp;

    }

    public Book get(int index) {
        return arrayBook[index];
    }

    private void extend() {
        Book[] tmp = new Book[arrayBook.length + 10];
        for (int i = 0; i < arrayBook.length; i++) {
            tmp[i] = arrayBook[i];

        }
        arrayBook = tmp;
    }

    public Author getAuthorByName(String authorname) {
        for (int i = 0; i <authorSize; i++) {
            if (arrayAuthor[i].getName().equals(authorname)) {
                return arrayAuthor[i];
            }

        }
        return null;

    }
    public Book getBookByName(String bookName) {
        for (int i = 0; i <booksize; i++) {
            if (arrayBook[i].getName().equals(bookName)) {
                return arrayBook[i];
            }
        }
        return null;
}
    public void printBooks() {
        for (int i = 0; i < booksize; i++) {
            System.out.println(arrayBook[i] + " ");
        }
}
           public void printAuthors(){
            for (int i = 0; i < authorSize; i++) {
                System.out.println(arrayAuthor[i] + " ");

            }
        }
    }

