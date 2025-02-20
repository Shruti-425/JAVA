package experiment6.Ecommerce;

public final class Product 
{
    private String productName;
    private double price;
    private int stock;

    public Product(String productName, double price, int stock) 
    {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public void getProductDetails()
    {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }

    protected void applyDiscount(double discountPercentage)
    {
        price -= price * (discountPercentage / 100);
        System.out.println("New Price: " + price);
    }

    //default
    void updateStock(int newStock)
    {
        this.stock = newStock;
        System.out.println("Stock updated to " + stock);
    }

    private double calculateProfit()
    {
        return price * 0.2;
    }

    public void showProfit()
    {
        System.out.println("Profit Calculation: " + calculateProfit());
    }
}