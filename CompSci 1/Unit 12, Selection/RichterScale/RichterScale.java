import java.util.Scanner;

public class RichterScale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a magnitude on the Richter scale --> ");
        double n = sc.nextDouble();
        System.out.print("\nDamage = ");

        if (n >= 8) {
            System.out.println("Most structures fall");
        }
        else if (n >= 7) {
            System.out.println("Most buildings destroyed");
        }
        else if (n >= 6) {
            System.out.println("Many buildings considerably damaged; some collapse");
        }
        else if (n >= 4.5) {
            System.out.println("Damage to poorly constructed buildings");
        }
        else if (n >= 3.5) {
            System.out.println("Felt by many people, no destruction");
        }
        else if (n >= 0) {
            System.out.println("Generally not felt by people");
        }
        else {
            System.out.println("Invalid number.");
        }
    }
}
