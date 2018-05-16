import java.util.Scanner

var sc = Scanner(System.`in`)
var goal: Int = 0
var sixWeeks1: Int = 0
var sixWeeks2: Int = 0
var sixWeeks3: Int = 0
var gradeNeeded: Double = 0.toDouble()

fun getData() {
    println("-----------------")
    println("     getData")
    println("-----------------\n")

    print("Enter desired semester average --> ")
    goal = sc.nextInt()

    print("Enter 1st six weeks average --> ")
    sixWeeks1 = sc.nextInt()

    print("Enter 2nd six weeks average --> ")
    sixWeeks2 = sc.nextInt()

    print("Enter 3rd six weeks average --> ")
    sixWeeks3 = sc.nextInt()
}

fun calculateGradeNeeded() {
    println("\n----------------------")
    println(" calculateGradeNeeded")
    println("----------------------\n")

    gradeNeeded = (goal - 0.8 * (sixWeeks1 + sixWeeks2 + sixWeeks3) / 3) / 0.2
}

fun printResults() {
    println("\n-----------------")
    println("  printResults")
    println("-----------------\n")

    println("Semester Average Goal = " + goal)
    println("Grade Needed to Achieve Goal = " + gradeNeeded)
}

fun main(args: Array<String>) {
    getData()
    calculateGradeNeeded()
    printResults()
}
