import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var a = 0
    var b = 0
    var c = 0

    print("Enter 1st Integer --> ")
    a = sc.nextInt()
    print("Enter 2nd Integer --> ")
    b = sc.nextInt()
    print("Enter 3rd Integer --> ")
    c = sc.nextInt()

    println("\nSmallest = " + Math.min(a, Math.min(b, c)))
    println("Largest = " + Math.max(a, Math.max(b, c)))
}
