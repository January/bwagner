import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an integer --> ");
        int n = sc.nextInt();

        System.out.println("The Square = " + (n * n));
        System.out.println("The Cube = " + (n * n * n));
        System.out.println("The Fourth Power = " + (n * n * n * n));
    }
}