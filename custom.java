import java.util.Scanner;

class Customer 
{
    private double balance;

    public Customer() 
    {
        this.balance = 0.0;
    }

    public void addBalance(int amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Added: " + amount);
        } 
        else 
        {
            System.out.println("Invalid amount");
        }
    }

    public void deductBalance(int amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Deducted: " + amount);
        } 
        else 
        {
            System.out.println("Invalid amount");
        }
    }

    void showBalance() 
    {
        System.out.println("Balance: " + balance);
    }
}

public class custom
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Customer cust = new Customer();

        cust.addBalance(100); 
        cust.addBalance(50);
        cust.showBalance();

        cust.deductBalance(30);
        cust.showBalance();

        sc.close();
    }
}