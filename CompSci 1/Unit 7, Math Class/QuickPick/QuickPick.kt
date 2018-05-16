fun main(args: Array<String>) {
    println("Texas Lottery - Quick Pick")
    println("===========================")
    for (i in 0..5) {
        print((Math.random() * 50 + 1).toInt().toString() + " ")
    }
}

