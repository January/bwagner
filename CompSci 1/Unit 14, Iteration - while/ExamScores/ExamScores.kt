import java.util.Scanner


private val score = 0
private var a = 0
private var b = 0
private var c = 0
private var d = 0
private var f = 0
private val sc = Scanner(System.`in`)

val totalScores: Int
    get() = a + b + c + d + f

fun inputAndTally() {
    var grade = 0
    while (grade != -1) {
        grade = sc.nextInt()
        if (grade >= 90) {
            a++
        } else if (grade >= 80) {
            b++
        } else if (grade >= 70) {
            c++
        } else if (grade >= 60) {
            d++
        } else if (grade >= 0){
            f++
        }
    }
}

fun printSummary() {
    println("============================")
    println("       Summary Report")
    println("============================")
    println("Total number of grades = $totalScores")
    println("Number of As = $a")
    println("Number of Bs = $b")
    println("Number of Cs = $c")
    println("Number of Ds = $d")
    println("Number of Fs = $f")
}

fun main(args: Array<String>) {
    inputAndTally()
    printSummary()
}