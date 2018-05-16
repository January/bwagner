import java.util.Scanner

var sc = Scanner(System.`in`)
var s1Avg: Double = 0.toDouble()
var s2Avg: Double = 0.toDouble()
var s3Avg: Double = 0.toDouble()
var s4Avg: Double = 0.toDouble()
var s5Avg: Double = 0.toDouble()
var s6Avg: Double = 0.toDouble()
var s7Avg: Double = 0.toDouble()
var s8Avg: Double = 0.toDouble()
var s9Avg: Double = 0.toDouble()
var s10Avg: Double = 0.toDouble()
var leslieAvg: Double = 0.toDouble()
var extraPoints: Double = 0.toDouble()

fun getAverages() {
    println("-----------------")
    println("   getAverages")
    println("-----------------\n")

    print("Leslie's average --> ")
    leslieAvg = sc.nextDouble()

    print("Student 1 average --> ")
    s1Avg = sc.nextDouble()

    print("Student 2 average --> ")
    s2Avg = sc.nextDouble()

    print("Student 3 average --> ")
    s3Avg = sc.nextDouble()

    print("Student 4 average --> ")
    s4Avg = sc.nextDouble()

    print("Student 5 average --> ")
    s5Avg = sc.nextDouble()

    print("Student 6 average --> ")
    s6Avg = sc.nextDouble()

    print("Student 7 average --> ")
    s7Avg = sc.nextDouble()

    print("Student 8 average --> ")
    s8Avg = sc.nextDouble()

    print("Student 9 average --> ")
    s9Avg = sc.nextDouble()

    print("Student 10 average --> ")
    s10Avg = sc.nextDouble()
}

fun calculatePoints() {
    println("\n-----------------")
    println(" calculatePoints")
    println("-----------------\n")

    extraPoints += s1Avg - Math.floor(s1Avg)
    extraPoints += s2Avg - Math.floor(s2Avg)
    extraPoints += s3Avg - Math.floor(s3Avg)
    extraPoints += s4Avg - Math.floor(s4Avg)
    extraPoints += s5Avg - Math.floor(s5Avg)
    extraPoints += s6Avg - Math.floor(s6Avg)
    extraPoints += s7Avg - Math.floor(s7Avg)
    extraPoints += s8Avg - Math.floor(s8Avg)
    extraPoints += s9Avg - Math.floor(s9Avg)
    extraPoints += s10Avg - Math.floor(s10Avg)
}

fun printResults() {
    println("\n-----------------")
    println("  printResults")
    println("-----------------\n")

    println("Points = " + extraPoints)
    System.out.printf("New Average = %.1f", leslieAvg + extraPoints)

}

fun main(args: Array<String>) {
    getAverages()
    calculatePoints()
    printResults()
}
