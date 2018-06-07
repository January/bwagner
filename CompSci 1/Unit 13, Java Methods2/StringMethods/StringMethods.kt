/** Prints the parameter name followed by the phrase
 * " have a nice day!"
 * @param name the name to be displayed
 */
fun greeting(name: String) {
    println(name + ", have a nice day!")
}

/** @return the first letter from parameter str
 * @param str string used to extract first letter from
 */
fun firstLetter(str: String): String {
    return str.substring(0, 1)
}

/** @return a string with str1, str2, and str3 merged together
 * @param str1 first string to be merged
 * @param str2 second string to be merged
 * @param str3 third string to be merged
 */
fun merge(str1: String, str2: String, str3: String): String {
    return str1 + str2 + str3
}

/** @return a string that is the first letter of parameter
 * str repeated three times.
 * @param str string used to extract first letter from
 */
fun repeatFirst(str: String): String {
    return str.substring(0, 1) + str.substring(0, 1) + str.substring(0, 1)
}

/** @return compares the lengths of str1 and str2 and returns
 * true if they are the same length; otherwise returns false
 * @param str1 first string to determine length of
 * @param str2 second string to determine length of
 */
fun sameLength(str1: String, str2: String): Boolean {
    return str1.length == str2.length
}

fun main(args: Array<String>) {
    val app = StringMethods()

    println("Test greeting method")
    println("====================")
    app.greeting("John")
    app.greeting("Sarah")

    println()
    println("Test firstLetter method")
    println("=======================")
    println("The first letter of honor is " + app.firstLetter("honor"))
    println("The first letter of courage is " + app.firstLetter("courage"))

    println()
    println("Test merge method")
    println("=================")
    println("The merge of faith, hope, love is " + app.merge("faith", "hope", "love"))
    println("The merge of forgiveness, compassion, mercy is " + app.merge("forgiveness", "compassion", "mercy"))

    println()
    println("Test repeatFirst method")
    println("=======================")
    println("Repeat first letter of sacrifice is " + app.repeatFirst("sacrifice"))
    println("Repeat first letter of commitment is " + app.repeatFirst("commitment"))

    println()
    println("Test sameLength method")
    println("======================")
    println("Charity and selfless are same length - " + app.sameLength("charity", "selfless"))
    println("Liberty and freedom are same length - " + app.sameLength("liberty", "freedom"))


}