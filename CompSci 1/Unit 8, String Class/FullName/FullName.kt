import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Enter first name --> ")
    val first = sc.next()
    print("Enter last name --> ")
    val last = sc.next()

    print("$last, $first")
}
