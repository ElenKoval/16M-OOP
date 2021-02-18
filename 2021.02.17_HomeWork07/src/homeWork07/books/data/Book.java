package homeWork07.books.data;

import homeWork07.books.bookschelf.Schowcase;

public class Book {
    //очень все тяжело шло, в итоге сделала data and dao без старта, он у меня как-то никуда не прикручивался
    // так вообще можно?
    private String author;
    private String title;
    private String ISBN;
    private String genre;
    private String format;
    private String language;
    private int page;
    private int publicYear;
    private double price;
    private boolean sold;

    Book(String author, String title, String ISBN, String genre, String format, String language,
         int page, int publicYear, int price, boolean sold) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.genre = genre;
        this.format = format;
        this.language = language;
        this.page = page;
        this.publicYear = publicYear;
        this.price = price;
        this.sold = sold;
    }

    Book(String author, String title, int publicYear, int page, double price) {
        this.author = author;
        this.title = title;
        this.publicYear = publicYear;
        this.page = page;
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public String getFormat() {
        return format;
    }

    public String getLanguage() {
        return language;
    }

    public int getPage() {
        return page;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSold() {
        return sold;
    }

    public void toDisplay() {
        System.out.println("Книга на витрине: " + " Название: " + title +
                " Автор: " + author + " Год издания: " + publicYear +
                " количество страниц: " + page + " цена " + price + ";");
    }

}

class StartBook {
    public static void main(String[] args) {
        Schowcase saleShowcase = new Schowcase(4);
        Book alphabetBook = new Book("Chris Harris", "Alphabet",
                2020, 48, 16.55);
        saleShowcase.addBook(alphabetBook);
        Book cookingBook = new Book("100 Cookies", "Sarah Kieffer",
                2020, 304, 25.30);
        saleShowcase.addBook(cookingBook);
        Book warAndPeace = new Book("War and Peace", "Leo Tolstoy",
                2006, 1424, 21.99);
        saleShowcase.addBook(warAndPeace);
        Book foundation = new Book("Foundation", "Asimov", 2019, 289, 17.99);
        saleShowcase.addBook(foundation);
        Book dune = new Book("Children of Dune", "Frank Herbert",
                2018, 345, 18.99);


        saleShowcase.booksSort();
        System.out.println(saleShowcase.printBooks());


    }
}
