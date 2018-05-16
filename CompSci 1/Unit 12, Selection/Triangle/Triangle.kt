import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Enter Side 1 --> ")
    val side1 = sc.nextInt()

    print("Enter Side 2 --> ")
    val side2 = sc.nextInt()

    print("Enter Side 3 --> ")
    val side3 = sc.nextInt()

    print("\nThis triangle is a")

    if (side1 == side2 && side1 == side3) {
        println("n equilateral")
    }
    if (side1 != side2 && side2 != side3 && side1 != side3) {
        println(" scalene")
    } else {
        println("n isosceles")
    }
}