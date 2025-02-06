import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double result;

        switch(op) 
        {
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case '/':
            
                if (num2 != 0) 
                {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } 
                else 
                {
                    System.out.println("Error!");
                }
                break;
            case '%':
                if (num2 != 0) 
                {
                    result = num1 % num2;
                    System.out.println("The result is: " + result);
                } 
                else 
                {
                    System.out.println("Error!");
                }
                break;
            default:
                System.out.println("Invalid");
        }
        sc.close();
    }
}