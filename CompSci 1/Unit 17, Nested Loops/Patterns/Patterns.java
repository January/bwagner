import java.util.Scanner;

public class Patterns {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for(int i = 0; i < num; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num; i > 0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
