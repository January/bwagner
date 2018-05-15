import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length --> ");
        int length = sc.nextInt();

        System.out.print("Enter the Width --> ");
        int width = sc.nextInt();

        System.out.println("Perimeter = " + (2 * length + 2 * width));
        System.out.println("Area = " + length * width);
    }
}
