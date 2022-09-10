public class Book {

    private String nane;
    private Author author;
    private  Integer publicationYear;

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
    public String toString() {
        return "Book{" +
                "nane='" + nane + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }
}

