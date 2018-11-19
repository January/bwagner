import java.util.Scanner;

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    print("Enter a number: ")
    val num = input.nextInt()

    for (i in 0 until num) {
        for (j in 0 until i) {
            print("*")
        }
        println()
    }
    for (i in num downTo 1) {
        for (j in 0 until i) {
            print("*")
        }
        println()
    }
}