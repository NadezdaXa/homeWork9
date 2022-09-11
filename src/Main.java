import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        var author = new Author("Ivan", "Ivanov");
        var author1 = new Author("Ivan1", "Ivanov1");

        var book = new Book("Book", author, 1988);
        var book1 = new Book("Book1", author, 1989);

        author.equals(book1);

        System.out.println(author);
        System.out.println(author1);
        System.out.println(book);
        System.out.println(book1);

        System.out.println(author.hashCode());
        System.out.println(book.hashCode());

    }
}