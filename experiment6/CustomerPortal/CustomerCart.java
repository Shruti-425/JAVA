package experiment6.CustomerPortal;

import experiment6.Ecommerce.Product;
import java.util.Scanner;

public class CustomerCart 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Product Stock: ");
        int stock = scanner.nextInt();

        Product product = new Product(productName, price, stock);

        System.out.println("\nCustomer View:");
        product.getProductDetails();

        product.showProfit();

        scanner.close();
    }
}