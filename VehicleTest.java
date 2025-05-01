import java.util.Scanner;

abstract class Vehicle 
{
    protected String make;
    protected String model;

    public Vehicle(String make, String model) 
    {
        this.make = make;
        this.model = model;
    }

    abstract void startEngine();
    abstract void stopEngine();

    public void serviceInfo() 
    {
        System.out.println("Regular service required for " + make + " " + model);
    }
}

class Car extends Vehicle 
{
    public Car(String make, String model) 
    {
        super(make, model);
    }

    void startEngine() 
    {
        System.out.println(make + " " + model + " engine started.");
    }

    void stopEngine() 
    {
        System.out.println(make + " " + model + " engine stopped.");
    }
}

public class VehicleTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Car Make: ");
        String make = scanner.nextLine();

        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine();

        Car userCar = new Car(make, model);

        System.out.println("\nCar Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);

        userCar.startEngine();
        userCar.serviceInfo();
        userCar.stopEngine();

        scanner.close();
    }
}