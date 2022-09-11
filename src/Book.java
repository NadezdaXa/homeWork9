import java.util.Objects;

public class Book {

    private String nane;
    private Author author;
    private Integer publicationYear;

    public Book(String nane, Author author, Integer publicationYear) {
        this.nane = nane;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nane, book.nane) && Objects.equals(author, book.author) && Objects.equals(publicationYear, book.publicationYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nane, author, publicationYear);
    }


    @Override
    public String toString() {
        return "Book{" +
                "nane='" + nane + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }

}

