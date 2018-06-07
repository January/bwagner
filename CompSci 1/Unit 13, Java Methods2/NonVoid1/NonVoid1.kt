/** @return the average of num1 and num2
 * @param num1 first number in average
 * @param num2 second number in average
 */
fun average(num1: Double, num2: Double): Double {
    return (num1 + num2) / 2
}

/** @return an integer random number in the range of [1..range] inclusive
 * @param range the upper bounds of generated random number
 */
fun randomInt(range: Int): Int {
    return (Math.random() * range).toInt() + 1
}

/** Determines if ch is a vowel. If ch is a vowel it
 * returns true; otherwise it returns false.
 * @return true or false
 * @param ch the string to be tested
 */
fun isVowel(ch: String): Boolean {
    return ch.equals("a", ignoreCase = true) || ch.equals("e", ignoreCase = true) ||
            ch.equals("i", ignoreCase = true) || ch.equals("o", ignoreCase = true) ||
            ch.equals("u", ignoreCase = true)
}

/** Returns a response depending upon temp's value.
 * If temp >= 85 it returns the string "It's hot".
 * If temp >= 65 it returns the string "It's warm".
 * If temp >= 45 it returns the string "It's cool".
 * If temp < 45 it returns the string "It's cold".
 * @return a string response
 * @param temp the temperature input
 */
fun weather(temp: Int): String {
    return if (temp >= 85)
        "It's hot"
    else if (temp >= 65)
        "It's warm"
    else if (temp >= 45)
        "It's cool"
    else
        "It's cold"
}

/** Determines the letter grade for grade
 * @return a string value of "A", "B", "C", or "F"
 * @param grade the grade that needs to be converted into a letter grade
 */
fun getLetterGrade(grade: Int): String {
    if (grade >= 90 && grade <= 100)
        return "A"
    if (grade >= 80 && grade < 90)
        return "B"
    return if (grade >= 70 && grade < 80) "C" else "F"
}

/** Determines if num is a whole number. If num is a whole number it
 * returns true; otherwise it returns false.
 * @return true or false
 * @param num the number in the comparison
 */
fun isWholeNumber(num: Int): Boolean {
    return num >= 0
}

fun main(args: Array<String>) {
    val app = NonVoid1()

    println("\nTest average method")
    println("===================")
    println("The average of 50 and 100 is " + app.average(50.0, 100.0))
    println("The average of 1271 and 5446 is " + app.average(1271.0, 5446.0))

    println("\nTest randomInt method")
    println("=====================")
    println("An integer random number in range of [1..3] = " + app.randomInt(3))
    println("An integer random number in range of [1..50] = " + app.randomInt(50))

    println("\nTest isVowel method")
    println("===================")
    println("The letter e is a vowel = " + app.isVowel("e"))
    println("The letter k is a vowel = " + app.isVowel("k"))
    println("The letter A is a vowel = " + app.isVowel("A"))

    println("\nTest weather method")
    println("==========================")
    println(app.weather(32) + " when the temperature is 32 degrees")
    println(app.weather(78) + " when the temperature is 78 degrees")
}