import java.util.Scanner;

class Employee 
{
    private String name;
    private int empid;
    private double salary;

    public Employee() 
    {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empid, double salary) 
    {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getName() 
    {
        return name;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void increaseSalary(double percentage) 
    {
        salary += salary * (percentage / 100);
    }

    public void displayInfo() 
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee 
{
    private String department;

    public Manager(String name, int empid, double salary, String department) 
    {
        super(name, empid, salary);
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }

    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class EmployeeTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        int empid = scanner.nextInt();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Is this employee a manager? (yes/no): ");
        String isManager = scanner.next();

        if (isManager.equalsIgnoreCase("yes")) 
        {
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            Manager mgr = new Manager(name, empid, salary, department);
            System.out.println("\nManager Details:");
            mgr.displayInfo();

            System.out.print("\nEnter salary increase percentage: ");
            double percentage = scanner.nextDouble();
            mgr.increaseSalary(percentage);
            System.out.println("Updated Salary: " + mgr.getSalary());

        } 
        else 
        {
            Employee emp = new Employee(name, empid, salary);
            System.out.println("\nEmployee Details:");
            emp.displayInfo();

            System.out.print("\nEnter salary increase percentage: ");
            double percentage = scanner.nextDouble();
            emp.increaseSalary(percentage);
            System.out.println("Updated Salary: " + emp.getSalary());
        }
        scanner.close();
    }
}