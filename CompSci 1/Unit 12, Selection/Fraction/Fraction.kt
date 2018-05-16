import java.util.Scanner

class Fraction {
    private val sc = Scanner(System.`in`)
    private var problem: String? = null    // fraction problem
    private var num1: Int = 0          // numerator of first fraction
    private var denom1: Int = 0        // denominator of first fraction
    private var operator: String? = null   // arithmetic operator ("+","-","*","/")
    private var num2: Int = 0          // numerator of second fraction
    private var denom2: Int = 0        // denominator of second fraction
    private var numAns: Int = 0        // numerator portion of the answer
    private var denomAns: Int = 0      // denominator portion of the answer

    fun getProblem() {
        println("--------------------")
        println("    getProblem")
        println("--------------------\n")

        print("Enter fraction problem. (EX: 2/3 + 3/4) --> ")
        problem = sc.nextLine()
    }

    fun extractData() {
        println("\n--------------------")
        println("    extractData")
        println("--------------------\n")

        num1 = Integer.parseInt(problem!!.substring(0, 1))
        denom1 = Integer.parseInt(problem!!.substring(2, 3))

        operator = problem!!.substring(4, 5)

        num2 = Integer.parseInt(problem!!.substring(6, 7))
        denom2 = Integer.parseInt(problem!!.substring(8, 9))
    }

    fun doArithmetic() {
        println("\n--------------------")
        println("    doArithmetic")
        println("--------------------\n")

        if (operator == "+") {
            numAns = num1 * denom2 + denom1 * num2
            denomAns = denom1 * denom2
        }

        if (operator == "-") {
            numAns = num1 * denom2 - denom1 * num2
            denomAns = denom1 * denom2
        }

        if (operator == "*") {
            numAns = num1 * num2
            denomAns = denom1 * denom2
        }

        if (operator == "/") {
            numAns = num1 * denom2
            denomAns = denom1 * num2
        }
    }

    fun printResults() {
        println("\n--------------------")
        println("    printResults")
        println("--------------------\n")

        println("$problem = $numAns/$denomAns")
    }
}
fun main(args: Array<String>) {
    val app = Fraction()
    app.getProblem()
    app.extractData()
    app.doArithmetic()
    app.printResults()
}
