import java.util.Scanner;
public class FindMaxMin {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = scanner.nextInt();
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < n; i++) 
        {
            if (nums[i] > max) 
            {
                max = nums[i];
            }
            if (nums[i] < min) 
            {
                min =nums[i];
            }
        }
        System.out.println("Max:"+ max+", Min:"+min);
    }
}