import java.util.*
import java.awt.*
import javax.swing.*
import java.awt.event.*

class GUI01 : JFrame() {
    // constructor
    init {
        // set frame attributes
        layout = null                                 // no layout will be used
        setSize(500, 500)                               // sets size of frame window
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE  // activate close icon
        contentPane.background = Color(50, 120, 200)     // set background color
        isVisible = true                                // show frame
    }
}

// main method
fun main(args: Array<String>) {
    val app = GUI01()    // run program
}