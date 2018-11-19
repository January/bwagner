import java.util.Scanner;

public class WordList
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[10];

        System.out.println("Enter 10 words: ");
        for(int i = 0; i < 10; i++)
        {
            words[i] = input.next();
        }

        for(String s : words)
        {
            System.out.println(s);
        }
    }
}
