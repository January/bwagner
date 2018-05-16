import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    print("Enter a string: ")
    val s = sc.nextLine()

    println("\nThe last letter is: " + s.substring(s.length - 1))
}