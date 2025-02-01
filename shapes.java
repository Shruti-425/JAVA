import java.util.Scanner;

public class shapes 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        shapes shapes = new shapes();
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        double area;
        switch (choice) 
        {
            case 1:
                System.out.println("Rectangle_length:");
                System.out.println("breadth:");
                float l = sc.nextFloat();
                float b = sc.nextFloat();
                area = shapes.area(l, b);
                System.out.println("Rectangle: " + area);
                break;

            case 2:
                System.out.println("Square side:");
                double side = sc.nextDouble();
                area = shapes.areaSquare(side);
                System.out.println("Square: " + area);
                break;

            case 3:
                System.out.print("Circle radius: ");
                double radius = sc.nextDouble();
                area = shapes.areaCircle(radius);
                System.out.println("Circle: " + area);
                break;

            case 4:
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }

    public double area(float length, float breadth) 
    {
        return length * breadth;
    }

    public double areaSquare(double side) 
    {
        return side * side;
    }

    public double areaCircle(double radius) 
    {
        return Math.PI * radius * radius;
    }
}