import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side 1 --> ");
        int side1 = sc.nextInt();

        System.out.print("Enter Side 2 --> ");
        int side2 = sc.nextInt();

        System.out.print("Enter Side 3 --> ");
        int side3 = sc.nextInt();

        System.out.print("\nThis triangle is a");

        if (side1 == side2 && side1 == side3) {
            System.out.println("n equilateral");
        }
        if (side1 != side2 && side2 != side3 && side1 != side3) {
            System.out.println(" scalene");
        }
        else {
            System.out.println("n isosceles");
        }
    }

}