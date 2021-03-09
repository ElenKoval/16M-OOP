package books.booksData;

public class Book {
    private long isbn;
    private String author;
    private String title;
    private int page;
    private double pricePerPage;

    public Book(long isbn, String author, String title, int page, double pricePerPage) {
        if (isbn > 999999 && isbn < 10000000)
            this.isbn = isbn;
        if ((author != null && !author.trim().isEmpty() && checkString(author))) {
            this.author = author;
        } else {
            this.author = "Incorrect! Please,check spelling";
        }
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            this.author = "Incorrect! Please,check spelling";
        }
        if (page > 0) {
            this.page = page;
        }
        if (pricePerPage > 0) {
            this.pricePerPage = pricePerPage;
        }
    }

    static boolean checkString(String input) {
        for (int i = 0; i < input.length() - 1; i++) {
            boolean l;
            l = Character.isLetter(input.charAt(i));
            if (!l) {
                return false;
            }
        }
        return true;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty() && checkString(author)) {
            this.author = author;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if ((title != null && !title.trim().isEmpty())) {
            this.title = title;
        } else {
            this.author = "Incorrect! Please,check spelling";
        }
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if (page > 0) {
            this.page = page;
        }
    }

    public double getPricePerPage() {
        return pricePerPage;
    }

    public void setPricePerPage(double pricePerPage) {
        if (pricePerPage > 0) {
            this.pricePerPage = pricePerPage;
        } else {
            this.author = "Incorrect! Please,check spelling";
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", page=" + page +
                ", pricePerPage=" + pricePerPage +
                '}';
    }
}
