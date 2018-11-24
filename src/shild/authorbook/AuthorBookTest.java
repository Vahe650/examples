package shild.authorbook;
import java.util.Scanner;

public class AuthorBookTest {
    public static void main(String[] args) {
        DynamicArrayForBook da = new DynamicArrayForBook();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun) {
            printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    isRun = false;
                    break;
                case 1:
                    System.out.println("Please input Author's name,email,gender");
                    String authorData = scanner.nextLine();
                    String[] splitAuthor = authorData.split(",");
                    System.out.println("thank you,the authr is added");
                    Author author = new Author(splitAuthor[0], splitAuthor[1], splitAuthor[2]);
                    da.add(author);
                    break;
                case 2:
                    System.out.println("Please input Book's name,price,count,authorName,currency");
                    String bookData = scanner.nextLine();
                    String[] splitBook = bookData.split(",");
                    double price = Double.parseDouble(splitBook[1]);
                    int count = Integer.parseInt(splitBook[2]);
                    Author authorByName = da.getAuthorByName(splitBook[3]);
                    Book book = new Book(splitBook[0], authorByName, price, count, splitBook[4]);
                    System.out.println("Thank you, Book is added to DA");
                    da.add(book);
                    break;
                case 3:
                    System.out.println("please input Author name");
                    String authorName = scanner.nextLine();
                    Author authorByName1 = da.getAuthorByName(authorName);
                    if (authorByName1 == null) {
                        System.out.println("no Aothor by name");
                    } else {
                        System.out.println(authorByName1);
                    }
                    break;

                case 4:
                    System.out.println("Please input Book's name");
                    String bookName = scanner.nextLine();
                    Book bookByName = da.getBookByName(bookName);
                    if (bookByName == null) {
                        System.out.println("no book by name");
                    } else {
                        System.out.println(bookByName);
                    }
                    break;
                case 5:
                    da.printAuthors();
                    break;
                case 6:
                    System.out.println("please input Authors name");
                    String famaleAuthors=scanner.nextLine();


                default:
                    System.out.println("wrong command");

            }
        }
    }

    private static void printCommands() {
        System.out.println("please input 0 for exit");
        System.out.println("please input 1 for add Author");
        System.out.println("please input 2 for add book");
        System.out.println("please input 3 for search Author by name");
        System.out.println("please input 4 for search book by name");
        System.out.println("please input 5 for print authors");
        System.out.println("please input 6 for print famale authors");
        System.out.println("please input 7 for print email by autos name");
        System.out.println("please input 8 for print email by autos name");

    }
}
