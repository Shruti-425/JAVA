import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Prompts
{
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.print("Enter the file name (with extension): ");
            String fileName = scanner.nextLine();

            int charCount = 0;
            int wordCount = 0;

            try (FileInputStream fis = new FileInputStream(fileName)) 
            {
                StringBuilder sb = new StringBuilder();
                int byteData;

                while ((byteData = fis.read()) != -1) 
                {
                    char ch = (char) byteData;
                    sb.append(ch);
                }

                String fileContent = sb.toString();

                charCount = fileContent.replaceAll("\\s+", "").length();

                // Count words
                String[] words = fileContent.trim().split("\\s+");
                if (!fileContent.trim().isEmpty()) 
                {
                    wordCount = words.length;
                }

                System.out.println("Total words: " + wordCount);
                System.out.println("Total characters (excluding whitespace): " + charCount);

            } 
            catch (IOException e) 
            {
                System.out.println("Error reading the file: " + e.getMessage());
            }
        }
    }
}