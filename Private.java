import java.util.Scanner;

class SuperClass
{
    private int privateNumber;

    public SuperClass(int number)
    {
        this.privateNumber = number;
    }

    public int getPrivateNumber()
    {
        return privateNumber;
    }
}

class SubClass extends SuperClass
{
    public SubClass(int number)
    {
        super(number);
    }

    public void display()
    {
        System.out.println("Private Number: " + getPrivateNumber());
    }
}

public class Private
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        SubClass obj = new SubClass(userInput);
        obj.display();
        scanner.close();
    }
}