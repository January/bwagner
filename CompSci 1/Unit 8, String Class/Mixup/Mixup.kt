import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Enter a string: ")
    val word = sc.nextLine()

    println("Mixed up string: " + word.substring(word.length / 2) + word.substring(0, word.length / 2))
}