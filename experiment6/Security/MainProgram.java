import Security;
import java.util.Scanner;

public class MainProgram 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        SecuritySystem security = new SecuritySystem();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        security.authenticateUser(username, password);

        scanner.close();
    }
}