public class NonVoid1
{
    /** @return the average of num1 and num2
     *  @param num1 first number in average
     *  @param num2 second number in average
     */
    public double average(double num1, double num2)
    {
        return (num1 + num2) / 2;
    }

    /** @return an integer random number in the range of [1..range] inclusive
     *  @param range the upper bounds of generated random number
     */
    public int randomInt(int range)
    {
        return (int)(Math.random() * range) + 1;
    }

    /** Determines if ch is a vowel. If ch is a vowel it
     *  returns true; otherwise it returns false.
     *  @return true or false
     *  @param ch the string to be tested
     */
    public boolean isVowel(String ch)
    {
        return ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") ||
                ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") ||
                ch.equalsIgnoreCase("u");
    }

    /** Returns a response depending upon temp's value. 
     *  If temp >= 85 it returns the string "It's hot".
     *  If temp >= 65 it returns the string "It's warm".
     *  If temp >= 45 it returns the string "It's cool".
     *  If temp < 45 it returns the string "It's cold".
     *  @return a string response
     *  @param temp the temperature input
     */
    public String weather(int temp)
    {
        if(temp >= 85)
            return "It's hot";
        else if(temp >= 65)
            return "It's warm";
        else if(temp >= 45)
            return "It's cool";
        else
            return "It's cold";
    }

    /** Determines the letter grade for grade
     *  @return a string value of "A", "B", "C", or "F"
     *  @param grade the grade that needs to be converted into a letter grade
     */
    public String getLetterGrade(int grade)
    {
        if(grade >= 90 && grade <= 100)
            return "A";
        if(grade >= 80 && grade < 90)
            return "B";
        if(grade >= 70 && grade < 80)
            return "C";

        return "F";
    }

    /** Determines if num is a whole number. If num is a whole number it
     *  returns true; otherwise it returns false.
     *  @return true or false
     *  @param num the number in the comparison
     */
    public boolean isWholeNumber(int num)
    {
        return (num >= 0);
    }

    public static void main(String[] args) {
        NonVoid1 app = new NonVoid1();

        System.out.println("\nTest average method");
        System.out.println("===================");
        System.out.println("The average of 50 and 100 is " + app.average(50, 100));
        System.out.println("The average of 1271 and 5446 is " + app.average(1271, 5446));

        System.out.println("\nTest randomInt method");
        System.out.println("=====================");
        System.out.println("An integer random number in range of [1..3] = " + app.randomInt(3));
        System.out.println("An integer random number in range of [1..50] = " + app.randomInt(50));

        System.out.println("\nTest isVowel method");
        System.out.println("===================");
        System.out.println("The letter e is a vowel = " + app.isVowel("e"));
        System.out.println("The letter k is a vowel = " + app.isVowel("k"));
        System.out.println("The letter A is a vowel = " + app.isVowel("A"));

        System.out.println("\nTest weather method");
        System.out.println("==========================");
        System.out.println(app.weather(32) + " when the temperature is 32 degrees");
        System.out.println(app.weather(78) + " when the temperature is 78 degrees");
    }
}