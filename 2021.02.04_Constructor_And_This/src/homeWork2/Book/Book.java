package homeWork2.Book;

public class Book {
    String titles;
    String authors;
    String ISBN;
    int publicationYear;
    int pages;
    String type;
    double price;

    public Book(String titles, String authors, String ISBN, int publicationYear, int pages,
                String type, double price) {
        this.titles = titles;
        this.authors = authors;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.pages = pages;
        this.type = type;
        this.price = price;
    }

    public Book(String titles, String authors, String ISBN, int publicationYear, int pages,
                double price) {
        this(titles, authors, ISBN, publicationYear, pages, "", price);
    }

    public Book(String titles, String authors, double price) {
        this(titles, authors, "", 0, 0, price);
    }

    public Book(String titles, String authors, String type, double price) {
        this(titles, authors, "", 0, 0, price);
    }

    public Book(String titles, String authors, int publicationYear) {
        this(titles, authors, "", publicationYear, 0, "", 0.0);
    }

    public Book(String titles, String authors, int pages, double price) {
        this(titles, authors, "", 0, pages, "", price);
    }

    public Book(String titles, String authors, String type) {
        this(titles, authors, "", 0, 0, type, 0.0);
    }


}
