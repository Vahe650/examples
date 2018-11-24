package shild.authorbook;

public class Book {
    public static final String DEFAULT_CURRENCY = "AMD";
    private String name;
    private Author author;
    private double price;
    private int count;
    private String currency;

    public Book(String name, double price, Author author, int count) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.count = count;
        this.currency = DEFAULT_CURRENCY;
    }

    public Book(String name, Author author, double price, int count, String s) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.count = count;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", count=" + count +
                ",currency=" + currency +
                '}';
    }
}









