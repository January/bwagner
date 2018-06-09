import java.util.*

private val keyboard = Scanner(System.`in`)

/* This method prompts the user to input an integer value which
     * represents the number of rows in a table.
     * @ return number of rows entered by the user
     */
fun inputNumRows(): Int {
    print("Enter the number of rows: ")
    return keyboard.nextInt()
}

/* This method displays a table of values from 1 up to the value
     * of parameter rows. On each row of the table the method
     * displays the product of 10 times the row number, the product of 100
     * times the row number, and the product of 1000 times the row
     * number.
     * @param rows the number of rows in the table
     */
fun displayTable(rows: Int) {
    println(" N  10*N   100*N   1000*N")
    println("----------------------------")
    var i = 1
    do {
        println(" " + i + "  " + 10 * i + "     " + 100 * i + "     " + 1000 * i)
        i++
    } while (i <= rows)
}

fun main(args: Array<String>) {
    val app = Table()
    app.displayTable(app.inputNumRows())
}