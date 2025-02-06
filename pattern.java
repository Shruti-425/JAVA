//static:no need to create object , static can call only static
import java.util.Scanner;
public class pattern 
{
    public void tripattern(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = 0; k < n - i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("rows: ");
        int n = sc.nextInt();
        
        pattern p = new pattern();
        p.tripattern(n);

        sc.close();
    }
}