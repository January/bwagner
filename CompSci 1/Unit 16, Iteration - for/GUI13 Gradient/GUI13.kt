import java.awt.*
import javax.swing.*

class GUI13 : JFrame() {
    // constructor
    init {
        // set frame attributes
        layout = null
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        contentPane.background = Color.white
        isVisible = true
    }

    override fun paint(page: Graphics?) {
        super.paint(page)  // erase background

        var x = 50
        var y = 50
        var width = 400
        var height = 400

        for (i in 0..254) {
            ++x
            ++y
            width -= 2
            height -= 2

            page!!.color = Color(i, 140, 211)
            page.fillOval(x, y, width, height)
        }

    }
}

fun main(args: Array<String>) {
    GUI13()  // run program
}