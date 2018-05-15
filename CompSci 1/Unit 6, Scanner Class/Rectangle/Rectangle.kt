import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Enter the Length --> ")
    val length = sc.nextInt()

    print("Enter the Width --> ")
    val width = sc.nextInt()

    println("Perimeter = " + (2 * length + 2 * width))
    println("Area = " + length * width)
}