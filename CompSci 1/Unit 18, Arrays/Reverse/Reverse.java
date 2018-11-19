import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[20];

        System.out.println("Enter 20 integers: ");
        for(int i = 0; i < 20; i++)
        {
            System.out.print("Num " + (i + 1) + ": ");
            nums[i] = input.nextInt();
        }

        for(int i : nums)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        for(int i = nums.length - 1; i >= 0; i--)
        {
            System.out.print(nums[i] + " ");
        }
    }
}
