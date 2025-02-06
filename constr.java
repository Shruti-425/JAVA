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

public class constr 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Book book1=new Book();
        
        System.out.println("Enter book title: ");
        String usertitle=sc.nextLine();

        System.out.print("Enter author name: ");
        String userauthor=sc.nextLine();


        
        Book book2=new Book(usertitle,userauthor);
        System.out.println("Enter another book title: ");
        String usertitle2=sc.nextLine();

        System.out.println("Enter another author name: ");
        String userauthor2=sc.nextLine();
        
        System.out.print("Enter publication Year: ");
        int userYear=sc.nextInt();
        sc.nextLine();



        Book book3=new Book(usertitle2,userauthor2,userYear);


        System.out.println("Print the details:");
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();

        sc.close();

    }
}