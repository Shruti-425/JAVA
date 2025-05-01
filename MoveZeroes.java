import java.util.Scanner;
public class MoveZeroes 
{
    public static void moveZeroes(int[] nums) 
    {
        int position = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] != 0) 
            {
                nums[position] = nums[i];
                if (i != position) 
                {
                    nums[i] = 0;
                }
                position++;
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = scanner.nextInt();
        }
        moveZeroes(nums);
        System.out.println("Array after moving zeros: ");
        for (int i = 0; i < nums.length; i++) 
        {
            int num = nums[i];
            System.out.print(num + " ");
        }
        scanner.close();
    }
}