import java.util.*

// instance variables
private val scores = DoubleArray(8)
private val keyboard = Scanner(System.`in`)

/* This method prompts the user to enter in 8 scores and stores
 * them in the array scores.
 */
fun readScores() {
    println("Enter eight contestant scores: ")

    for (i in 0..7) {
        print("Judge " + (i + 1) + ": ")
        scores[i] = keyboard.nextDouble()
    }
}

/* Determines which score in scores is the lowest
 * @return the lowest score in scores
 */
fun lowest(): Double {
    var lowest = java.lang.Double.MAX_VALUE
    for (i in scores) {
        if (i < lowest) {
            lowest = i
        }
    }
    return lowest
}

/* Determines which score in scores is the highest
 * @return the highest score in scores
 */
fun highest(): Double {
    var highest = java.lang.Double.MIN_VALUE
    for (i in scores) {
        if (i > highest) {
            highest = i
        }
    }
    return highest
}

/* Calculates the average of scores with the lowest and highest scores
 * thrown out.
 * @return the average
 */
fun average(): Double {
    var total = 0.0
    var amount = 0.0

    for (i in scores) {
        if (i == lowest() || i == highest()) {
            continue
        }
        total += i
        amount++
    }

    return total / amount
}

/* This method prints a summary report which includes the original list of
 * scores, the average of the scores, the lowest score, and the highest
 * score.
 */
fun printSummary() {
    println("                      Summary")
    println("-------------------------------------------------")
    print("Scores: ")
    for (i in scores) {
        print(i.toString() + " ")
    }
    println()

    println("Lowest score: " + lowest())
    println("Highest score: " + highest())
    System.out.printf("Average score: %.1f", average())
}

fun main(args: Array<String>) {
    val app = SportsEvent()
    app.readScores()
    app.printSummary()
}