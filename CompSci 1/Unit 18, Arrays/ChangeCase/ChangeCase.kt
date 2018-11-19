import java.util.*

// instance variables
private val words = arrayOfNulls<String>(50)  // array's physical size
private var size = 0 // array's logical size
private val keyboard = Scanner(System.`in`)

/* Reads strings input from the keyboard and stores them in the array words.
 * Input continues until the user types "stop".
 * The logical size of the array is. incremented each time a new string
 *    is added to the array.
 */
fun readWords() {
    var str = ""
    while (!str.equals("stop", ignoreCase = true)) {
        words[size] = str
        size++
        str = keyboard.nextLine()
    }
}

/* Prints each word in the array three times. Once in its original form,
 * once in all capital letters, and once in all lowercase letters.
 */
fun printWords() {
    for (i in 0 until size) {
        println(words[i] + " " + words[i]!!.toUpperCase() + " " + words[i]!!.toLowerCase())
    }
}

fun main(args: Array<String>) {
    readWords()
    printWords()
}