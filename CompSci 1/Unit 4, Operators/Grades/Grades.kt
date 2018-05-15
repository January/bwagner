fun main(args: Array<String>) {
    val dailyAvg = 88.0
    val quizAvg = 74.0
    val testAvg = 95.0
    var sixWeeksAvg = 0.0

    var roundedAvg = 0

    sixWeeksAvg = dailyAvg * 0.3 + quizAvg * 0.2 + testAvg * 0.5

    roundedAvg = (sixWeeksAvg + 0.5).toInt()

    println("Daily Average = " + dailyAvg)
    println("Quiz Average = " + quizAvg)
    println("Test Average = " + testAvg)
    println("--------------------------")
    println("Six Weeks Average = " + roundedAvg)
}