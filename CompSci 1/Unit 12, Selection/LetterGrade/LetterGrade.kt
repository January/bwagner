import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Enter a numerical grade --> ")
    val n = sc.nextDouble()
    print("\nLetter grade = ")

    if (n >= 97) {
        println("A+")
    } else if (n >= 94) {
        println("A")
    } else if (n >= 90) {
        println("A-")
    } else if (n >= 87) {
        println("B+")
    } else if (n >= 84) {
        println("B")
    } else if (n >= 80) {
        println("B-")
    } else if (n >= 77) {
        println("C+")
    } else if (n >= 74) {
        println("C")
    } else if (n >= 70) {
        println("C-")
    } else {
        println("F")
    }
}
