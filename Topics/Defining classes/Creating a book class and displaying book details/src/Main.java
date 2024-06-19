import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        Book book = new Book();

        // Set the details of the book
        // Implement here
        book.setTitle(title);
        book.setAuthor(author);


        // Print the details of the book
        // Implement here
        System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Pages: 100");
       
    }
}

 class Book {
    private String title;
    private String author;
    private int pages;

    // Getters and setters
    // Implement here
    public void setTitle (String title) {
        this.title = title;    
    }
    
    public void setAuthor (String author) {
        this.author = author;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getAuthor() {
        return this.author;
    }
}
