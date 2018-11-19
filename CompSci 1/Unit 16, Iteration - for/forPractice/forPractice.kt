fun main(args: Array<String>) {
    for (i in 0..25) {
        print(i.toString() + " ")
    }

    println()
    println()

    for (i in 10 downTo 1) {
        print(i.toString() + " ")
    }

    println()
    println()

    for (i in 1..40) {
        if (i % 2 != 0) {
            print(i.toString() + " ")
        }
    }

    println()
    println()

    for (i in 1..40) {
        if (i % 2 == 0) {
            print(i.toString() + " ")
        }
    }

    println()
    println()

    run {
        var i = 0
        while (i <= 200) {
            print(i.toString() + " ")
            i += 10
        }
    }

    println()
    println()

    for (i in -10 downTo -20) {
        print(i.toString() + " ")
    }

    println()
    println()

    for (i in 0..9) {
        println("computer")
    }
}