fun main(args: Array<String>) {
    val num1 = 25
    val num2 = 6

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