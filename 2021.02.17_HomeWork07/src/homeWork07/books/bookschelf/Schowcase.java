package homeWork07.books.bookschelf;

import homeWork07.books.data.Book;

public class Schowcase {
    private Book[] books;
    private int size;

    public Schowcase(int capacity) {
        books = new Book[capacity];
        size = 0;

    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

//забыла передать массив, запустила - а оно работает! Это как? То есть если метод в том же классе, то предавать не обязательно?

    public void booksSort() {
        int start = 0;
        int end = books.length - 1;
        while (start <= end) {
            boolean swap = false;
            for (int i = start; i < end; i++) {
                if (books[i].getPrice() > books[i + 1].getPrice()) {
                    double temp = books[i].getPrice();
                    books[i].setPrice(books[i + 1].getPrice());
                    books[i + 1].setPrice(temp);
                    swap = true;
                }
            }

            end--;
            for (int i = end; i > start; i--) {
                if (books[i].getPrice() < books[i - 1].getPrice()) {
                    double temp = books[i - 1].getPrice();
                    books[i - 1].setPrice(books[i].getPrice());
                    books[i].setPrice(temp);
                    swap = true;
                }
            }
            start++;
            if (!swap) {
                break;
            }
        }
    }


    public String printBooks() {
        for (int i = 0; i < books.length; i++) {
            books[i].toDisplay();
        }
        return "Распечатано в порядке возрастания цены";
    }

}
