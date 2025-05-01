import java.util.Scanner;

class Person 
{
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) 
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() 
    {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

class Staff extends Person 
{
    protected int staffId;
    protected String department;

    public Staff(String name, int age, String address, int staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }
}

class Professor extends Staff 
{
    private String specialization;

    public Professor(String name, int age, String address, int staffId, String department, String specialization) 
    {
        super(name, age, address, staffId, department);
        this.specialization = specialization;
    }

    public void conductLecture() 
    {
        System.out.println(name + " is conducting a lecture on " + specialization);
    }
}

class Student extends Person 
{
    protected int studentId;
    protected String course;

    public Student(String name, int age, String address, int studentId, String course) 
    {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }
}

class GraduateStudent extends Student 
{
    private String researchTopic;

    public GraduateStudent(String name, int age, String address, int studentId, String course, String researchTopic) 
    {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }

    public void submitThesis() 
    {
        System.out.println(name + " is submitting a thesis on " + researchTopic);
    }
}

public class UniversityTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people to add: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        Person[] people = new Person[count];

        for (int i = 0; i < count; i++) 
        {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            System.out.print("Are they a Professor or a Graduate Student? (P/G): ");
            char type = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            if (type == 'P' || type == 'p') 
            {
                System.out.print("Enter Staff ID: ");
                int staffId = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Enter Department: ");
                String department = scanner.nextLine();

                System.out.print("Enter Specialization: ");
                String specialization = scanner.nextLine();

                people[i] = new Professor(name, age, address, staffId, department, specialization);
            } 
            else if (type == 'G' || type == 'g') 
            {
                System.out.print("Enter Student ID: ");
                int studentId = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Course: ");
                String course = scanner.nextLine();

                System.out.print("Enter Research Topic: ");
                String researchTopic = scanner.nextLine();

                people[i] = new GraduateStudent(name, age, address, studentId, course, researchTopic);
            } 
            else 
            {
                System.out.println("Invalid choice. Skipping entry.");
            }
        }

        System.out.println("\nDisplaying University Members:");
        for (Person person : people) 
        {
            if (person != null) 
            {
                person.displayInfo();
                if (person instanceof Professor) 
                {
                    ((Professor) person).conductLecture();
                } 
                else if (person instanceof GraduateStudent) 
                {
                    ((GraduateStudent) person).submitThesis();
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}