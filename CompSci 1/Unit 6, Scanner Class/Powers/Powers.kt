import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Please enter an integer --> ")
    val n = sc.nextInt()

    println("The Square = " + (n * n))
    println("The Cube = " + (n * n * n))
    println("The Fourth Power = " + (n * n * n * n))
}