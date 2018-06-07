import java.util.Scanner;

public class ExamScores {

    private int score = 0;
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int f = 0;
    private Scanner sc = new Scanner(System.in);

    public void inputAndTally() {
        int grade = 0;
        while (grade != -1) {
            grade = sc.nextInt();
            if (grade >= 90) {
                a++;
            } else if (grade >= 80) {
                b++;
            } else if (grade >= 70) {
                c++;
            } else if (grade >= 60) {
                d++;
            } else if (grade >= 0){
                f++;
            }
        }
    }

    public int getTotalScores()
    {
        return (a + b + c + d + f);
    }

    public void printSummary()
    {
        System.out.println("============================");
        System.out.println("       Summary Report");
        System.out.println("============================");
        System.out.println("Total number of grades = " + getTotalScores());
        System.out.println("Number of As = " + a);
        System.out.println("Number of Bs = " + b);
        System.out.println("Number of Cs = " + c);
        System.out.println("Number of Ds = " + d);
        System.out.println("Number of Fs = " + f);
    }

    public static void main(String[] args) {
        ExamScores app = new ExamScores();
        app.inputAndTally();
        app.printSummary();
    }
}
