import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var a = 0
    var b = 0
    var c = 0.0

    print("Enter side 1 --> ")
    a = sc.nextInt()
    print("Enter side 2 --> ")
    b = sc.nextInt()

    c = Math.sqrt(Math.pow(a.toDouble(), 2.0) + Math.pow(b.toDouble(), 2.0))

    println("\nThe hypotenuse of the triangle = " + Math.round(c))
}
