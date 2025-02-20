import java.util.Scanner;
class TaxCalculator 
{
    public static final double GST_RATE = 18.0;

    public final void displayGST() 
    {
        System.out.println("The current GST rate is: " + GST_RATE + "%");
    }
}

class Invoice extends TaxCalculator 
{
    public double calculateTotalWithTax(double amount) 
    {
        double taxAmount = (amount * GST_RATE) / 100;
        return amount + taxAmount;
    }
}

public class TaxationTest 
{
    public static void main(String[] args) 
    {
        Invoice invoice = new Invoice();
        invoice.displayGST();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the invoice amount: ");
        double amount = sc.nextDouble();
        double totalAmount = invoice.calculateTotalWithTax(amount);
        System.out.println("Total amount after applying GST: " + totalAmount);

        sc.close();
    }
}