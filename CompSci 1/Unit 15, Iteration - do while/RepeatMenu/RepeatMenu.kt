import java.util.*

private val keyboard = Scanner(System.`in`)

/* This method displays a menu and waits for the user to make a selection.
     * If the user's selection is not a valid number (not between 1 and 5)
     * the method displays the menu again and allows user to make another
     * selection. This process is repeated until a valid selection is made.
     * @ return the number selection made by the user.
     */
fun displayMenu(): Int {
    var s = 0
    do {
        println("      Menu")
        println("   ==========")
        println("1. Dr. Pepper")
        println("2. Coke")
        println("3. Sprite")
        println("4. 7-Up")
        println("5. Diet Coke")
        print("\nSelection: ")
        s = keyboard.nextInt()
    } while (s < 1 || s > 5)
    return s
}

/* This method makes a call to method displayMenu to get the user's
     * number selection. Once user's selection has been retrieved it
     * determines the name of the menu item selected and displays the
     * following message: "You have chosen (selection name)" where
     * selection name is the name of the menu item selected by the user.
     */
fun printSelection() {
    val n = displayMenu()
    print("\nYou have chosen ")
    if (n == 1) {
        println("Dr. Pepper.")
    }
    if (n == 2) {
        println("Coke.")
    }
    if (n == 3) {
        println("Sprite.")
    }
    if (n == 4) {
        println("7-Up.")
    }
    if (n == 5) {
        println("Diet Coke.")
    }
}

fun main(args: Array<String>) {
    val app = RepeatMenu()
    app.printSelection()
}