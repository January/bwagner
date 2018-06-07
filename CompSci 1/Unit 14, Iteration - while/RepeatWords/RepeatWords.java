import java.util.Scanner;

public class RepeatWords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String word = "";
        int count = 0;

        System.out.println("Enter words, type 'stop' or 'exit' to stop: \n");
        while(!word.equalsIgnoreCase("stop") && (!word.equalsIgnoreCase("exit"))) {
            word = sc.next();
            count++;
        }

        System.out.println("You entered " + (count - 1) + " words.");
    }
}
