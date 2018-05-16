import java.util.Scanner;

public class Fraction {
    private Scanner sc = new Scanner(System.in);
    private String problem;    // fraction problem
    private int num1;          // numerator of first fraction
    private int denom1;        // denominator of first fraction
    private String operator;   // arithmetic operator ("+","-","*","/")
    private int num2;          // numerator of second fraction
    private int denom2;        // denominator of second fraction
    private int numAns;        // numerator portion of the answer
    private int denomAns;      // denominator portion of the answer

    public void getProblem() {
        System.out.println("--------------------");
        System.out.println("    getProblem");
        System.out.println("--------------------\n");

        System.out.print("Enter fraction problem. (EX: 2/3 + 3/4) --> ");
        problem = sc.nextLine();
    }

    public void extractData() {
        System.out.println("\n--------------------");
        System.out.println("    extractData");
        System.out.println("--------------------\n");

        num1 = Integer.parseInt(problem.substring(0, 1));
        denom1 = Integer.parseInt(problem.substring(2, 3));

        operator = problem.substring(4, 5);

        num2 = Integer.parseInt(problem.substring(6, 7));
        denom2 = Integer.parseInt(problem.substring(8, 9));
    }

    public void doArithmetic() {
        System.out.println("\n--------------------");
        System.out.println("    doArithmetic");
        System.out.println("--------------------\n");

        if (operator.equals("+")) {
            numAns = (num1 * denom2) + (denom1 * num2);
            denomAns = (denom1 * denom2);
        }

        if (operator.equals("-")) {
            numAns = (num1 * denom2) - (denom1 * num2);
            denomAns = (denom1 * denom2);
        }

        if (operator.equals("*")) {
            numAns = num1 * num2;
            denomAns = denom1 * denom2;
        }

        if (operator.equals("/")) {
            numAns = num1 * denom2;
            denomAns = denom1 * num2;
        }
    }

    public void printResults() {
        System.out.println("\n--------------------");
        System.out.println("    printResults");
        System.out.println("--------------------\n");

        System.out.println(problem + " = " + numAns + "/" + denomAns);
    }

    public static void main(String[] args) {
        Fraction app = new Fraction();
        app.getProblem();
        app.extractData();
        app.doArithmetic();
        app.printResults();
    }
}
