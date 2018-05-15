fun main(args: Array<String>) {
    val hits = 27
    val atBats = 80
    var battingAvg = 0.0
    var roundedAvg = 0

    battingAvg = hits.toDouble() / atBats

    battingAvg += 0.0005

    battingAvg *= 1000.0
    roundedAvg = battingAvg.toInt()

    println("Hits = " + hits)
    println("At Bats = " + atBats)
    println("-------------------------")
    println("Batting Average = " + roundedAvg)
}