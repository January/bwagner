import java.util.Scanner;

public class Largest
{
    private int largest = 0;   // stores current largest number
    private Scanner keyboard = new Scanner(System.in);

    /* This method compares parameter num1 to parameter num2. If num1 is
     * greater than num2 the method returns num1; otherwise it returns
     * num2.
     * @ return the larger of num1 and num2
     * @ param num1 first number in comparison
     * @ param num2 second number in comparison
     */
    public int compare(int num1, int num2)
    {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /* This method prompts the user to enter 10 numbers. As each number 
     * is read the method makes a call to compare method so the new input
     * number can be compared to the current largest number. The number
     * returned by the compare method is stored in the instance variable
     * largest.
     */
    public void findLargest()
    {
        int cnt = 0;

        System.out.println("Enter ten numbers: ");
        do {
            largest = compare(largest, keyboard.nextInt());
            cnt++;
        }while(cnt < 10);
    }

    /* This method displays the instance variable largest.
     */
    public void printLargest()
    {
        System.out.println("The largest number is " + largest);
    }

    public static void main(String[] args)
    {
        Largest app = new Largest();
        app.findLargest();
        app.printLargest();
    }
}