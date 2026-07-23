package assignment;

public class Book {
    int bookId;
    String title;
    String author;
    int price;

    static String libName;
    static int totalBook = 0;

    Book(int Id, String title, String author, int price){
        this.bookId = Id;
        this.title = title;
        this.author = author;
        this.price = price;
        totalBook ++;
    }
    void displayBook(){

        System.out.println("\nbookId: " + this.bookId);
        System.out.println("Title: " + this.title);
        System.out.println("author: " + this.author);
        System.out.println("Price: " + this.price);
        // System.out.println();

    }

    static void displayLibraryName(){
        System.out.println("lib name :" + libName);
    }
    static void displayBookCount(){
        System.out.println("total book :" + totalBook);
    }
    public static void main(String[] args) {
        Book.libName = "City Central Library";
        
        Book.displayLibraryName();

        // This works perfectly now because the constructor accepts double values
        Book b1 = new Book(101, "Java Programming", "James Gosling", 650);
        Book b2 = new Book(102, "Clean Code", "Robert C. Martin", 799);
        Book b3 = new Book(103, "Effective Java", "Joshua Bloch", 890);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();

        Book.displayBookCount();

    }

    
}
