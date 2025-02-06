import java.util.Scanner;

class Book
{
    private String title;
    private String author;
    private int publicationYear;

    public Book() 
    {
        this.title = "Untitled";
        this.author = "Unknown Author";
        this.publicationYear = 0;
    }

    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
        this.publicationYear = 0;
    }

    public Book(String title, String author, int publicationYear) 
    {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public void displayBook() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (publicationYear != 0) 
        {
            System.out.println("Publication Year: " + publicationYear);
        }
        System.out.println();
    }
}

public class BookDemo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book();
        System.out.print("Enter book title: ");
        String userTitle = scanner.nextLine();
        System.out.print("Enter author name: ");
        String userAuthor = scanner.nextLine();
        Book book2 = new Book(userTitle, userAuthor);

        System.out.print("Enter another book title: ");
        String userTitle2 = scanner.nextLine();
        System.out.print("Enter author name: ");
        String userAuthor2 = scanner.nextLine();
        System.out.print("Enter publication year: ");
        int userYear = scanner.nextInt();
        Book book3 = new Book(userTitle2, userAuthor2, userYear);

        System.out.println("\nBook Details:");
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();

        scanner.close();
    }
}+