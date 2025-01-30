import java.util.Scanner;

public class MajorityElementFinder 
{
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

        int majority = findMajorityElement(nums);//for major
        System.out.println("Majority Element: " + majority);
        scanner.close();
    }

    public static int findMajorityElement(int[] nums) 
    {
        for (int i = 0; i < nums.length; i++) 
        {
            int count = 0;
            for (int j = 0; j < nums.length; j++) 
            {
                if (nums[j] == nums[i]) 
                {
                    count++;
                }
            }
            if (count > nums.length / 2) 
            {
                return nums[i];
            }
        }
        return -1;
    }
}