import java.util.Scanner;

public class Compare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 --> ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2 --> ");
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        }
        else if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        }
        else if (n1 < n2) {
            System.out.println(n1 + " is less than " + n2);
        }
    }
}
