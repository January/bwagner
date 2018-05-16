import java.util.*
import java.awt.*
import javax.swing.*
import java.awt.event.*

class GUI02 : JFrame() {
    // Step 1 : create JLabel variable
    private val label: JLabel

    // constructor
    init {
        // Step 2 : create JLabel object and store its reference in label
        label = JLabel("Have a nice day!")

        // Step 3 : set label attributes
        label.setLocation(150, 200)
        label.setSize(200, 20)
        label.foreground = Color.RED
        label.font = Font("Arial", Font.PLAIN, 24)

        // Step 4: add label to content pane of frame
        contentPane.add(label)

        // set frame attributes
        layout = null
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        contentPane.background = Color.white
        isVisible = true
    }
}

fun main(args: Array<String>) {
    val app = GUI02()   // run program
}