import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student 
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            String rollno = scanner.nextLine();

            System.out.print("Enter grade: ");
            String grade = scanner.nextLine();

            try (FileWriter writer = new FileWriter("student.txt", true)) 
            {
                writer.write("Name: " + name + ", Roll Number: " + rollno + ", Grade: " + grade + "\n");
            }

            System.out.println("Student information saved successfully.");

        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}