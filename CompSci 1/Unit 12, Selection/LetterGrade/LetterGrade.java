import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a numerical grade --> ");
        double n = sc.nextDouble();
        System.out.print("\nLetter grade = ");

        if (n >= 97) {
            System.out.println("A+");
        }
        else if (n >= 94) {
            System.out.println("A");
        }
        else if (n >= 90) {
            System.out.println("A-");
        }
        else if (n >= 87) {
            System.out.println("B+");
        }
        else if (n >= 84) {
            System.out.println("B");
        }
        else if (n >= 80) {
            System.out.println("B-");
        }
        else if (n >= 77) {
            System.out.println("C+");
        }
        else if (n >= 74) {
            System.out.println("C");
        }
        else if (n >= 70) {
            System.out.println("C-");
        }
        else {
            System.out.println("F");
        }
    }
}
