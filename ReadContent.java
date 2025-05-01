import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadContent 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter the file name to read:");
            String filename = sc.nextLine();

            try (FileReader fr = new FileReader(filename)) 
            {
                int character;
                System.out.println("Content:" + filename + ":");

                while ((character = fr.read()) != -1) 
                {
                    System.out.print((char) character);
                }

            }
            catch (FileNotFoundException e) 
            {
                System.out.println("File not found.");
            } 
            catch (IOException e) 
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}