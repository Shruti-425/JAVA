package experiment6.Security;

public final class SecuritySystem 
{
    public boolean authenticateUser(String username, String password) 
    {
        String correctUsername = "admin";
        String correctPassword = "password123";

        if (username.equals(correctUsername) && password.equals(correctPassword)) 
        {
            System.out.println("valid");
            return true;
        }
        else
        {
            System.out.println("invalid");
            return false;
        }
    }
}