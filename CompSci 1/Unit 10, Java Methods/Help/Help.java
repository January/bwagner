import java.util.Scanner;

public class Help {
    Scanner sc = new Scanner(System.in);
    double s1Avg, s2Avg, s3Avg, s4Avg, s5Avg, s6Avg, s7Avg, s8Avg, s9Avg, s10Avg, leslieAvg, extraPoints;

    public void getAverages() {
        System.out.println("-----------------");
        System.out.println("   getAverages");
        System.out.println("-----------------\n");

        System.out.print("Leslie's average --> ");
        leslieAvg = sc.nextDouble();

        System.out.print("Student 1 average --> ");
        s1Avg = sc.nextDouble();

        System.out.print("Student 2 average --> ");
        s2Avg = sc.nextDouble();

        System.out.print("Student 3 average --> ");
        s3Avg = sc.nextDouble();

        System.out.print("Student 4 average --> ");
        s4Avg = sc.nextDouble();

        System.out.print("Student 5 average --> ");
        s5Avg = sc.nextDouble();

        System.out.print("Student 6 average --> ");
        s6Avg = sc.nextDouble();

        System.out.print("Student 7 average --> ");
        s7Avg = sc.nextDouble();

        System.out.print("Student 8 average --> ");
        s8Avg = sc.nextDouble();

        System.out.print("Student 9 average --> ");
        s9Avg = sc.nextDouble();

        System.out.print("Student 10 average --> ");
        s10Avg = sc.nextDouble();
    }

    public void calculatePoints() {
        System.out.println("\n-----------------");
        System.out.println(" calculatePoints");
        System.out.println("-----------------\n");

        extraPoints += s1Avg - Math.floor(s1Avg);
        extraPoints += s2Avg - Math.floor(s2Avg);
        extraPoints += s3Avg - Math.floor(s3Avg);
        extraPoints += s4Avg - Math.floor(s4Avg);
        extraPoints += s5Avg - Math.floor(s5Avg);
        extraPoints += s6Avg - Math.floor(s6Avg);
        extraPoints += s7Avg - Math.floor(s7Avg);
        extraPoints += s8Avg - Math.floor(s8Avg);
        extraPoints += s9Avg - Math.floor(s9Avg);
        extraPoints += s10Avg - Math.floor(s10Avg);
    }

    public void printResults() {
        System.out.println("\n-----------------");
        System.out.println("  printResults");
        System.out.println("-----------------\n");

        System.out.println("Points = " + extraPoints);
        System.out.printf("New Average = %.1f", (leslieAvg + extraPoints));

    }

    public static void main(String[] args) {
        Help app =  new Help();
        app.getAverages();
        app.calculatePoints();
        app.printResults();
    }
}
