import java.util.Scanner;

public class GradeNeeded {
    Scanner sc = new Scanner(System.in);
    int goal, sixWeeks1, sixWeeks2, sixWeeks3;
    double gradeNeeded;

    public void getData() {
        System.out.println("-----------------");
        System.out.println("     getData");
        System.out.println("-----------------\n");

        System.out.print("Enter desired semester average --> ");
        goal = sc.nextInt();

        System.out.print("Enter 1st six weeks average --> ");
        sixWeeks1 = sc.nextInt();

        System.out.print("Enter 2nd six weeks average --> ");
        sixWeeks2 = sc.nextInt();

        System.out.print("Enter 3rd six weeks average --> ");
        sixWeeks3 = sc.nextInt();
    }

    public void calculateGradeNeeded() {
        System.out.println("\n----------------------");
        System.out.println(" calculateGradeNeeded");
        System.out.println("----------------------\n");

        gradeNeeded = (goal - (0.8 * (sixWeeks1 + sixWeeks2 + sixWeeks3) / 3)) / 0.2;
    }

    public void printResults() {
        System.out.println("\n-----------------");
        System.out.println("  printResults");
        System.out.println("-----------------\n");

        System.out.println("Semester Average Goal = " + goal);
        System.out.println("Grade Needed to Achieve Goal = " + gradeNeeded);

    }

    public static void main(String[] args) {
        GradeNeeded app =  new GradeNeeded();
        app.getData();
        app.calculateGradeNeeded();
        app.printResults();
    }
}
