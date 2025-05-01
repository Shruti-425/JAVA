package experiment6;

import experiment6.StudentRecords.Student;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(studentId, name, grade);

        System.out.println("\nStudent Details:");
        student.displayStudentInfo();

        scanner.close();
    }
}