import java.util.Scanner;

public class Acronym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String word1 = sc.next().substring(0,1);
        String word2 = sc.next().substring(0,1);
        String word3 = sc.next().substring(0,1);


        System.out.println("Your acronym is: " + word1 + word2 + word3);
    }
}