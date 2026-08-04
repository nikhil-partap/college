// package assignment;

public class Book {
    int bookId;
    String title;
    String author;
    int price;
    static String libraryName ;
    static int bookCount;

    Book(int bookId, String title, String author, int price){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        
        bookCount ++;
    }

    void displayBook(){
        System.out.println("Book ID: "+ this.bookId + "\n" + "Title: " + this.title + 
        "\n" + "Author: " + this.author + "\n" + "Price: " + this.price  );
        
    }

    static void displayLibraryName(){
        System.out.println("Library Name : " + libraryName);
    }

    static void displayBookCount(){
        System.out.println("Total Books : " + bookCount);
    }

    public static void main(String[] args){
        libraryName = "City Central Library";

        Book b1 = new Book(101, "Java Programming", "James Gosling", 650);
        Book b2 = new Book(102, "Clean Code", "Robert C. Martin", 799);
        Book b3 = new Book(103, "Effective Java", "Joshua Bloch", 899);

        displayLibraryName();

        b1.displayBook();
        System.out.println();

        b2.displayBook();
        System.out.println();

        b3.displayBook();
        System.out.println();

        displayBookCount();


    }
}
