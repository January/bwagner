public class StringMethods
{
    /** Prints the parameter name followed by the phrase
     *  " have a nice day!"
     *  @param name the name to be displayed
     */
    public void greeting(String name)
    {
        System.out.println(name + ", have a nice day!");
    }

    /** @return the first letter from parameter str
     *  @param str string used to extract first letter from
     */
    public String firstLetter(String str)
    {
        return str.substring(0, 1);
    }

    /** @return a string with str1, str2, and str3 merged together
     *  @param str1 first string to be merged
     *  @param str2 second string to be merged
     *  @param str3 third string to be merged
     */
    public String merge(String str1, String str2, String str3)
    {
        return (str1 + str2 + str3);
    }

    /** @return a string that is the first letter of parameter
     *   str repeated three times.
     *  @param str string used to extract first letter from
     */
    public String repeatFirst(String str)
    {
        return (str.substring(0, 1) + str.substring(0, 1) + str.substring(0, 1));
    }

    /** @return compares the lengths of str1 and str2 and returns
     *   true if they are the same length; otherwise returns false
     *  @param str1 first string to determine length of
     *  @param str2 second string to determine length of
     */
    public boolean sameLength(String str1, String str2)
    {
        return (str1.length() == str2.length());
    }

    public static void main(String[] args)
    {
        StringMethods app = new StringMethods();

        System.out.println("Test greeting method");
        System.out.println("====================");
        app.greeting("John");
        app.greeting("Sarah");

        System.out.println();
        System.out.println("Test firstLetter method");
        System.out.println("=======================");
        System.out.println("The first letter of honor is " + app.firstLetter("honor"));
        System.out.println("The first letter of courage is " + app.firstLetter("courage"));

        System.out.println();
        System.out.println("Test merge method");
        System.out.println("=================");
        System.out.println("The merge of faith, hope, love is " + app.merge("faith", "hope", "love"));
        System.out.println("The merge of forgiveness, compassion, mercy is " + app.merge("forgiveness", "compassion", "mercy"));

        System.out.println();
        System.out.println("Test repeatFirst method");
        System.out.println("=======================");
        System.out.println("Repeat first letter of sacrifice is " + app.repeatFirst("sacrifice"));
        System.out.println("Repeat first letter of commitment is " + app.repeatFirst("commitment"));

        System.out.println();
        System.out.println("Test sameLength method");
        System.out.println("======================");
        System.out.println("Charity and selfless are same length - " + app.sameLength("charity", "selfless"));
        System.out.println("Liberty and freedom are same length - " + app.sameLength("liberty", "freedom"));


    }
}
