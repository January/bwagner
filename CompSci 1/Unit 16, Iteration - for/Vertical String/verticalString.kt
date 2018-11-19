import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    print("Enter a string: ")

    val word = input.nextLine()

    for (i in 0 until word.length) {
        println(word.substring(i, i + 1))
    }
}
