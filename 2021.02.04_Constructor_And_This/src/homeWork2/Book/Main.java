package homeWork2.Book;

public class Main {
    public static void main(String[] args) {

        Book alphabetBook = new Book("Alphabet", "Chris Harris", "978-1787460973",
                2020, 48, "kids books", 16.55);
        Book cookingBook = new Book("100 Cookies", "Sarah Kieffer", "97814521",
                2020, 304, "cooking", 25.30);
        Book warandpeace = new Book("War and Peace", "Leo Tolstoy",
                "9780143039990", 2006, 1424, "Classic",21.99);
        Book foundation = new Book("Foundation", "Asimov", 17.99);
        Book dune = new Book("Children of Dune", "Frank Herbert",
                " Science Fiction", 18.99);
        Book booksSchop[] = new Book[]{alphabetBook, cookingBook, warandpeace, foundation, dune};
        bookLowPrice(booksSchop);
        bookSort(booksSchop);


    }

    private static void bookLowPrice(Book[] booksSchop) {
        System.out.println("Успейте купить по выгодной цене до 20$ следующие книги: ");
        for (Book book :
                booksSchop) {
            if (book.price < 20) {
                System.out.println("Автор: " + book.authors + " Название: " + book.titles + " цена: " + book.price);
            }
        }
    }

    public static void bookSort(Book booksSchop[]) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < booksSchop.length - 1; i++) {
                if (booksSchop[i].price > booksSchop[i + 1].price) {
                    double temp = booksSchop[i].price;
                    booksSchop[i].price = booksSchop[i + 1].price;
                    booksSchop[i + 1].price = temp;
                    unsorted = true;
                }
            }
        }
        System.out.print('[');
        for (int i = 0; i < booksSchop.length - 1; i++) {
            System.out.print(booksSchop[i].price + ", ");
        }
        System.out.println(booksSchop[booksSchop.length - 1].price + "]");
    }
}










