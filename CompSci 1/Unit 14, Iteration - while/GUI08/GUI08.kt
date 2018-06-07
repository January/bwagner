import java.util.*
import java.awt.*
import javax.swing.*
import java.awt.event.*

// Step 1: make frame a listener
class GUI08 : JFrame(), ActionListener {

    // instance variables
    private val button: JButton
    private val circle: JButton

    // constructor
    init {
        // create button
        button = JButton("Change Color")
        circle = JButton("Draw Circle")

        // set button attributes
        button.setLocation(175, 50)
        button.setSize(150, 50)

        circle.setLocation(175, 125)
        circle.setSize(150, 50)

        // add button to frame
        contentPane.add(button)
        contentPane.add(circle)

        // Step 2: register listener with button
        button.addActionListener(this)
        circle.addActionListener(this)

        // set frame attributes
        layout = null
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
    }

    // Step 3: add an actionPerformed method
    override fun actionPerformed(event: ActionEvent) {
        if (event.source === button)
        // identify source
        {
            val r = (Math.random() * 256).toInt()     // red intensity: 0..255
            val g = (Math.random() * 256).toInt()     // green intensity: 0..255
            val b = (Math.random() * 256).toInt()     // blue intensity:0..255
            val color = Color(r, g, b)       // make custom color
            contentPane.background = color  // change background of frame
        }

        if (event.source === circle)
        // identify source
        {
            val page = graphics
            val r = (Math.random() * 256).toInt()     // red intensity: 0..255
            val g = (Math.random() * 256).toInt()     // green intensity: 0..255
            val b = (Math.random() * 256).toInt()     // blue intensity:0..255
            val x = (Math.random() * 500).toInt()
            val y = (Math.random() * 500).toInt()
            page.color = Color(r, g, b)
            page.fillOval(x, y, 100, 100)
        }
    }
}

fun main(args: Array<String>) {
    GUI08()
}