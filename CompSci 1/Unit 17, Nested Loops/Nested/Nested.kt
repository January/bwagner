import java.util.*

fun main(args: Array<String>) {
    val keyboard = Scanner(System.`in`)
    val rows: Int

    print("Enter number of rows --> ")
    rows = keyboard.nextInt()

    /*************
     * Example 1 *
     *************/
    for (r in 1..rows) // outer
    {
        for (c in 1..rows) // inner
        {
            print(c.toString() + " ")
        }
        println()
    }
    println()
    println()

    /*************
     * Example 2 *
     *************/
    for (r in 1..rows) // outer
    {
        for (c in 1..r) // inner
        {
            print(c.toString() + " ")
        }
        println()
    }
    println()
    println()

    /*************
     * Example 3 *
     *************/
    for (r in 1..rows) // outer
    {
        for (c in rows downTo 1) // inner
        {
            print(c.toString() + " ")
        }
        println()
    }
    println()
    println()

    /*************
     * Example 4 *
     *************/
    for (r in 1..rows) // outer
    {
        for (c in rows downTo r) // inner
        {
            print(c.toString() + " ")
        }
        println()
    }
    println()
    println()
}