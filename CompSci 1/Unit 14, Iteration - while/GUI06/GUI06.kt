import java.util.*
import java.awt.*
import javax.swing.*
import java.awt.event.*

class GUI06 : JFrame() {
    // constructor
    init {
        // set frame attributes
        layout = null
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        contentPane.background = Color.black
        isVisible = true
    }

    override fun paint(page: Graphics?) {
        super.paint(page)  // erase background
        for (i in 1..500) {
            val r = (Math.random() * 256).toInt()  // random red
            val g = (Math.random() * 256).toInt()  // random green
            val b = (Math.random() * 256).toInt()  // random blue

            val myColor = Color(r, g, b)   // create color
            page!!.color = myColor               // set graphics object to a new color

            val x1 = (Math.random() * 500).toInt()
            val y1 = (Math.random() * 500).toInt()
            val x2 = (Math.random() * 500).toInt()
            val y2 = (Math.random() * 500).toInt()
            page.drawLine(x1, y1, x2, y2)  // draw the line from point (x1, y1) to (x2, y2)
        }

    }
}

fun main(args: Array<String>) {
    GUI06()  // run program
}