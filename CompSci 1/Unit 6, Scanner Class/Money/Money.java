import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        int totalCents = 0;
        int dollars = 0;
        int cents = 0;

        System.out.print("How many pennies do you have? --> ");
        pennies = sc.nextInt();

        System.out.print("How many nickels do you have? --> ");
        nickels = sc.nextInt();

        System.out.print("How many dimes do you have? --> ");
        dimes = sc.nextInt();

        System.out.print("How many quarters do you have? --> ");
        quarters = sc.nextInt();

        totalCents = (quarters * 25) + (dimes * 10) + (nickels * 5) + pennies;
        dollars = totalCents / 100;
        cents = totalCents % 100;

        System.out.println("\nTotal value = " + dollars + " dollars and " + cents + " cents");
    }
}