import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Enter Number 1 --> ")
    val n1 = sc.nextInt()
    print("Enter Number 2 --> ")
    val n2 = sc.nextInt()

    if (n1 == n2) {
        println(n1.toString() + " is equal to " + n2)
    } else if (n1 > n2) {
        println(n1.toString() + " is greater than " + n2)
    } else if (n1 < n2) {
        println(n1.toString() + " is less than " + n2)
    }
}
