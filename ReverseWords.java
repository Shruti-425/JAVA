import java.util.Scanner;
public class ReverseWords 
{
    public static String reverseWords(String s) 
    {
        String[] words = s.split(" ");
        
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) 
        {
            reversed.append(words[i]);
            if (i != 0) 
            {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        String result = reverseWords(s);
        System.out.println("Reversed string: " + result);
        scanner.close();
    }
}