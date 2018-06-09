import java.util.Scanner

private var largest = 0   // stores current largest number
private val keyboard = Scanner(System.`in`)

/* This method compares parameter num1 to parameter num2. If num1 is
     * greater than num2 the method returns num1; otherwise it returns
     * num2.
     * @ return the larger of num1 and num2
     * @ param num1 first number in comparison
     * @ param num2 second number in comparison
     */
fun compare(num1: Int, num2: Int): Int {
    return if (num1 > num2)
        num1
    else
        num2
}

/* This method prompts the user to enter 10 numbers. As each number
     * is read the method makes a call to compare method so the new input
     * number can be compared to the current largest number. The number
     * returned by the compare method is stored in the instance variable
     * largest.
     */
fun findLargest() {
    var cnt = 0

    println("Enter ten numbers: ")
    do {
        largest = compare(largest, keyboard.nextInt())
        cnt++
    } while (cnt < 10)
}

/* This method displays the instance variable largest.
     */
fun printLargest() {
    println("The largest number is " + largest)
}

fun main(args: Array<String>) {
    val app = Largest()
    app.findLargest()
    app.printLargest()
}