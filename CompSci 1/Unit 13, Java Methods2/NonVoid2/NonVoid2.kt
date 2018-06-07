/** @return the square of num
 * @param num the number to be squared
 */
fun square(num: Int): Int {
    return num * num
}

/** @return the sum of num1, num2, and num3
 * @param num1 first number in the sum
 * @param num2 second number in the sum
 * @param num3 third number in the sum
 */
fun sumThree(num1: Int, num2: Int, num3: Int): Int {
    return num1 + num2 + num3
}

/** @return the smaller value between num1 and num2
 * @param num1 first number in minimum comparison
 * @param num2 second number in minimum comparison
 */
fun smaller(num1: Int, num2: Int): Int {
    return Math.min(num1, num2)
}

/** Returns one of five fortune cookie responses chosen at random
 * If the random number = 0 the method returns "Your future looks bright"
 * If the random number = 1 the method returns "I see love in your future"
 * If the random number = 2 the method returns "Maybe you better stay home today"
 * If the random number = 3 the method returns "You will have fame and fortune"
 * If the random number = 4 the method returns "Happiness you will have"
 * @return a string response
 */
fun fortuneCookie(): String {
    val num = (Math.random() * 5).toInt()

    if (num == 0)
        return "Your future looks bright."
    if (num == 1)
        return "I see love in your future."
    if (num == 2)
        return "Maybe you'd better stay home today."
    if (num == 3)
        return "You will have fame and fortune."
    return if (num == 4)
        "Happiness you will have."
    else
        "This will never appear."
}

/** Returns a response depending upon month's value
 * if month >= 1 && month <= 3 it returns "winter"
 * if month >= 4 && month <= 6 it returns "spring"
 * if month >= 7 && month <= 9 it returns "summer"
 * if month >= 10 && month <= 12 it returns "fall"
 * @return a string response
 * @param month the numerical month of the year
 */
fun season(month: Int): String {
    if (month >= 1 && month <= 3)
        return "winter"
    if (month >= 4 && month <= 6)
        return "spring"
    if (month >= 7 && month <= 9)
        return "summer"
    return if (month >= 10 && month <= 12)
        "fall"
    else
        "Could not be determined."
}

/** Determines if num is odd or even. If num is even it returns the string "even";
 * otherwise it returns the string "odd"
 * @return the string "even" or the string "odd"
 * @param num number used in comparison
 */
fun evenOdd(num: Int): String {
    return if (num % 2 == 0)
        "even"
    else
        "false"
}

fun main(args: Array<String>) {
    val app = NonVoid2()

    println("Test square method")
    println("==================")
    println("The square of 5 is " + app.square(5))
    println("The square of 12 is " + app.square(12))

    println()
    println("Test sumThree method")
    println("====================")
    println("The sum of 10, 20, 30 is " + app.sumThree(10, 20, 30))
    println("The sum of 15, 100, 75 is " + app.sumThree(15, 100, 75))

    println()
    println("Test smaller method")
    println("====================")
    println("Which is smaller 10 or 35? " + app.smaller(10, 35))
    println("Which is smaller 100 or 50? " + app.smaller(100, 50))

    println()
    println("Test fortuneCookie method")
    println("=========================")
    println("Your fortune cookie says - " + app.fortuneCookie())
    println("Your fortune cookie says - " + app.fortuneCookie())

    println()
    println("Test season method")
    println("===================")
    println("The month of March is in the " + app.season(3))
    println("The month of July is in the " + app.season(7))

    println()
    println("Test evenOdd method")
    println("===================")
    println("The number 84 is " + app.evenOdd(84))
    println("The number 27 is " + app.evenOdd(27))
}