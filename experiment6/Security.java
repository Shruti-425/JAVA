import java.util.Scanner;

final class SecuritySystem 
{
    public void authenticateUser(String username, String password) 
    {
        String correctUsername = "admin";
        String correctPassword = "shruti";

        if (username.equals(correctUsername) && password.equals(correctPassword)) 
        {
            System.out.println("Proceed");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}

/*
class AdvancedSecurity extends SecuritySystem 
{
    public void authenticateUser(String username, String password) 
    {
        System.out.println("Overridden");
    }
}
*/

/* Compilation Error because:
When trying to extend SecuritySystem, the compiler generates an error: Cannot inherit from final SecuritySystem.
This prevents unauthorized modifications to the authenticateUser method.
*/

public class Security 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        SecuritySystem secure = new SecuritySystem();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter the password: ");
        String password = sc.nextLine();

        secure.authenticateUser(username, password);

        sc.close();
    }
}