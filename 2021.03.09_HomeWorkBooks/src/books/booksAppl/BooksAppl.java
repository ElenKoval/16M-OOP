package books.booksAppl;

import books.booksData.Book;

public class BooksAppl {
    public static void main(String[] args) {
        Book foundation = new Book(2344322, "Asim0v", " Foundation", 289, 0.34);
        Book dune = new Book(5677653, "Herbert", "Children of Dune", 345, 0.89);
        Book cookingBook = new Book(4566535, "Kieffer", "100 Cookies", 304, 0.18);
        Book hyperion = new Book(3334456, "Simmons", "Hyperion", 512, 0.56);
        Book odyssey = new Book(7809987, "Clarke", "2001: A Space Odyssey", 256, 0.43);
        Book city = new Book(7899873, "Simak", "City", 438, 0.48);
        Book[] books = new Book[]{foundation, dune, cookingBook, hyperion, odyssey, city};
        printBooks(books);
        getTotalPrice(books);

    }

    public static void getTotalPrice(Book[] ar) {
        double sumPrice = 0;
        for (int i = 0; i < ar.length; i++) {
            sumPrice = (double)Math.round((ar[i].getPage() * ar[i].getPricePerPage())*100)/100;
        }
        System.out.println("Total sum = " + sumPrice);
    }


    public static void printBooks(Book[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
