import java.util.Scanner;

public class verticalString {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String word = input.nextLine();

        for(int i = 0; i < word.length(); i++)
        {
            System.out.println(word.substring(i, i+1));
        }
    }
}
