fun main(args: Array<String>) {
    var i = 0
    do {
        print(i.toString() + " ")
        i++
    } while (i <= 20)
    println("\n")

    i = 1
    do {
        if (i % 2 != 0)
            print(i.toString() + " ")
        i++
    } while (i <= 50)
    println("\n")

    i = 0
    do {
        print(i.toString() + " ")
        i += 10
    } while (i <= 200)
    println("\n")

    i = 20
    while (i >= 1) {
        print(i.toString() + " ")
        i--
    }
    println("\n")

    i = 97
    do {
        print(i.toChar() + " ")
        i++
    } while (i <= 122)
}
