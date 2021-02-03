package homeWork01Java;

public class Books {
    String titles;
    String authors;
    String theme;
    int isdn;
    int publicationYear;
    int pages;
    String type;
    double price;
    public  void booksInfo(){
        System.out.println("Best offer of the day! " + authors );
        System.out.println("only " + price + " for "+ pages+ " pages"+ " in "+ type);

    }


}

class BooksShop {
    public static void main(String[] args) {
        Books alphabetBook = new Books();
        Books cookingBook = new Books();
        alphabetBook.authors = "Chris Harris";
        alphabetBook.type = "Hardcover";
        alphabetBook.pages = 48;
        alphabetBook.publicationYear = 2020;
        alphabetBook.isdn = 97803162;
        alphabetBook.price = 16.55;
        alphabetBook.booksInfo();

        cookingBook.authors = "Sarah Kieffer";
        cookingBook.titles = "100 Cookies";
        cookingBook.type = "Hardcover";
        cookingBook.pages = 304;
        cookingBook.publicationYear = 2020;
        cookingBook.isdn = 97814521;
        cookingBook.price = 25.30;

    }
}


