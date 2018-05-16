import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.print("Enter 1st Integer --> ");
        a = sc.nextInt();
        System.out.print("Enter 2nd Integer --> ");
        b = sc.nextInt();
        System.out.print("Enter 3rd Integer --> ");
        c = sc.nextInt();

        System.out.println("\nSmallest = " + Math.min(a, (Math.min(b, c))));
        System.out.println("Largest = " + Math.max(a, (Math.max(b, c))));
    }
}
