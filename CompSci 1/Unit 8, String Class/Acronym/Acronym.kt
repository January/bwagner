import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    print("Enter three words: ")
    val word1 = sc.next().substring(0, 1)
    val word2 = sc.next().substring(0, 1)
    val word3 = sc.next().substring(0, 1)


    println("Your acronym is: $word1$word2$word3")
}