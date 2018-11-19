import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val words = arrayOfNulls<String>(10)

    println("Enter 10 words: ")
    for (i in 0..9) {
        words[i] = input.next()
    }

    for (s in words) {
        println(s)
    }
}