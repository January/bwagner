import java.util.Scanner;

public class LastLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("\nThe last letter is: " + s.substring(s.length() - 1));
    }
}