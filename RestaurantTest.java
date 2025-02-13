import java.util.Scanner;

class Chef 
{
    public void makeSpecialDish() 
    {
        System.out.println("The chef is making a special dish.");
    }
}

class ItalianChef extends Chef 
{
    public void makeSpecialDish() 
    {
        System.out.println("Making pasta.");
    }
}

class ChineseChef extends Chef 
{
    public void makeSpecialDish() 
    {
        System.out.println("Making dumplings.");
    }
}

class MexicanChef extends Chef 
{
    public void makeSpecialDish() 
    {
        System.out.println("Making tacos.");
    }
}

public class RestaurantTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of chefs: ");
        int numChefs = scanner.nextInt();
        scanner.nextLine();

        Chef[] chefs = new Chef[numChefs];

        for (int i = 0; i < numChefs; i++) 
        {
            System.out.println("\nSelect Chef Type for Chef " + (i + 1) + ":");
            System.out.println("1. Italian Chef");
            System.out.println("2. Chinese Chef");
            System.out.println("3. Mexican Chef");
            System.out.print("Enter choice (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) 
            {
                case 1:
                    chefs[i] = new ItalianChef();
                    break;
                case 2:
                    chefs[i] = new ChineseChef();
                    break;
                case 3:
                    chefs[i] = new MexicanChef();
                    break;
                default:
                    System.out.println("Invalid choice. Assigning default Chef.");
                    chefs[i] = new Chef();
                    break;
            }
        }
        System.out.println("\nChefs are preparing special dishes:");
        for (Chef chef : chefs) 
        {
            chef.makeSpecialDish();
        }

        scanner.close();
    }
}