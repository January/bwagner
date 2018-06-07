import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    var word = ""
    var count = 0

    println("Enter words, type 'stop' or 'exit' to stop: \n")
    while (!word.equals("stop", ignoreCase = true) && !word.equals("exit", ignoreCase = true)) {
        word = sc.next()
        count++
    }

    println("You entered " + (count - 1) + " words.")
}