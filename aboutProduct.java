import java.util.Scanner;

class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;
    
    private static int totalProducts = 0;

    public Product() 
    {
        this.productId = 101;
        this.productName = "Unknown";
        this.category = "General";
        this.price = 0.0;
        totalProducts++;
    }

    public Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        totalProducts++;
    }

    public double getPrice() 
    {
        return price;
    }

    public void displayProductInfo() 
    {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
    }

    public static void displayTotalProducts() 
    {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public double calculateStockValue(int quantity) 
    {
        return price * quantity;
    }

    public double calculateStockValue(int quantity, double discountRate) 
    {
        double totalValue = price * quantity;
        return totalValue - (totalValue * discountRate / 100);
    }
}

public class aboutProduct
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine();

        Product[] products = new Product[numProducts];

        for (int i = 0; i < numProducts; i++) 
        {
            System.out.println("\nEnter details for Product " + (i + 1));
            System.out.print("Enter product ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter product category: ");
            String category = scanner.nextLine();
            System.out.print("Enter product price: ");

            double price = scanner.nextDouble();
            scanner.nextLine();

            products[i] = new Product(productId, productName, category, price);
        }

        Product.displayTotalProducts();

        for (int i = 0; i < numProducts; i++) 
        {
            System.out.println("\nProduct " + (i + 1) + " Details:");
            products[i].displayProductInfo();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            System.out.println("Stock Value (without discount): $" + products[i].calculateStockValue(quantity));

            System.out.print("Enter discount rate (0 for no discount): ");
            double discountRate = scanner.nextDouble();
            if (discountRate > 0)
            {
                System.out.println("Stock Value (with " + discountRate + "% discount): $" + 
                products[i].calculateStockValue(quantity, discountRate));
            }
        }
        scanner.close();
    }
}
