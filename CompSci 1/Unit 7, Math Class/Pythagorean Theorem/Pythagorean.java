import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        double c = 0;

        System.out.print("Enter side 1 --> ");
        a = sc.nextInt();
        System.out.print("Enter side 2 --> ");
        b = sc.nextInt();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("\nThe hypotenuse of the triangle = " + Math.round(c));
    }
}
