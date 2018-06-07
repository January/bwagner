public class NonVoid2
{
    /** @return the square of num
     *  @param num the number to be squared
     */
    public int square(int num)
    {
        return (num * num);
    }

    /** @return the sum of num1, num2, and num3
     *  @param num1 first number in the sum
     *  @param num2 second number in the sum
     *  @param num3 third number in the sum
     */
    public int sumThree(int num1, int num2, int num3)
    {
        return (num1 + num2 + num3);
    }

    /** @return the smaller value between num1 and num2
     *  @param num1 first number in minimum comparison
     *  @param num2 second number in minimum comparison
     */
    public int smaller(int num1, int num2)
    {
        return Math.min(num1, num2);
    }

    /** Returns one of five fortune cookie responses chosen at random
     *  If the random number = 0 the method returns "Your future looks bright"
     *  If the random number = 1 the method returns "I see love in your future"
     *  If the random number = 2 the method returns "Maybe you better stay home today"
     *  If the random number = 3 the method returns "You will have fame and fortune"
     *  If the random number = 4 the method returns "Happiness you will have"
     *  @return a string response
     */
    public String fortuneCookie()
    {
        int num = (int)(Math.random() * 5);

        if (num == 0)
            return "Your future looks bright.";
        if (num == 1)
            return "I see love in your future.";
        if (num == 2)
            return "Maybe you'd better stay home today.";
        if (num == 3)
            return "You will have fame and fortune.";
        if (num == 4)
            return "Happiness you will have.";
        else
            return "This will never appear.";
    }

    /** Returns a response depending upon month's value
     *  if month >= 1 && month <= 3 it returns "winter"
     *  if month >= 4 && month <= 6 it returns "spring"
     *  if month >= 7 && month <= 9 it returns "summer"
     *  if month >= 10 && month <= 12 it returns "fall"
     *  @return a string response
     *  @param month the numerical month of the year
     */
    public String season(int month)
    {
        if (month >= 1 && month <= 3)
            return "winter";
        if (month >= 4 && month <= 6)
            return "spring";
        if (month >= 7 && month <= 9)
            return "summer";
        if (month >= 10 && month <= 12)
            return "fall";
        else
            return "Could not be determined.";
    }

    /** Determines if num is odd or even. If num is even it returns the string "even";
     *  otherwise it returns the string "odd"
     *  @return the string "even" or the string "odd"
     *  @param num number used in comparison
     */
    public String evenOdd(int num)
    {
        if (num % 2 == 0)
            return "even";
        else
            return "false";
    }

    public static void main(String[] args)
    {
        NonVoid2 app = new NonVoid2();

        System.out.println("Test square method");
        System.out.println("==================");
        System.out.println("The square of 5 is " + app.square(5));
        System.out.println("The square of 12 is " + app.square(12));

        System.out.println();
        System.out.println("Test sumThree method");
        System.out.println("====================");
        System.out.println("The sum of 10, 20, 30 is " + app.sumThree(10, 20, 30));
        System.out.println("The sum of 15, 100, 75 is " + app.sumThree(15, 100, 75));

        System.out.println();
        System.out.println("Test smaller method");
        System.out.println("====================");
        System.out.println("Which is smaller 10 or 35? " + app.smaller(10, 35));
        System.out.println("Which is smaller 100 or 50? " + app.smaller(100, 50));

        System.out.println();
        System.out.println("Test fortuneCookie method");
        System.out.println("=========================");
        System.out.println("Your fortune cookie says - " + app.fortuneCookie());
        System.out.println("Your fortune cookie says - " + app.fortuneCookie());

        System.out.println();
        System.out.println("Test season method");
        System.out.println("===================");
        System.out.println("The month of March is in the " + app.season(3));
        System.out.println("The month of July is in the " + app.season(7));

        System.out.println();
        System.out.println("Test evenOdd method");
        System.out.println("===================");
        System.out.println("The number 84 is " + app.evenOdd(84));
        System.out.println("The number 27 is " + app.evenOdd(27));
    }
}