// This class is just like Arithmetic1, with num1 and num2 modified to 77 and 32 respectively, per instructions.
fun main(args: Array<String>) {
    val num1 = 77
    val num2 = 32

    val sum: Int
    val difference: Int
    val product: Int
    val quotient: Int
    val remainder: Int

    sum = num1 + num2
    difference = num1 - num2
    product = num1 * num2
    quotient = num1 / num2
    remainder = num1 % num2

    println("        Arithmetic")
    println("============================")
    println(num1.toString() + " + " + num2 + " = " + sum)
    println(num1.toString() + " - " + num2 + " = " + difference)
    println(num1.toString() + " * " + num2 + " = " + product)
    println(num1.toString() + " / " + num2 + " = " + quotient)
    println(num1.toString() + " % " + num2 + " = " + remainder)
}