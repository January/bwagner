import java.awt.*
import javax.swing.*

class GUI10 : JFrame() {
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

        var i = 0
        do {
            if (i % 2 == 0) {
                page!!.color = Color.orange
                page.drawLine(250, 250, (Math.random() * 500).toInt(), (Math.random() * 500).toInt())
            } else {
                page!!.color = Color.blue
                page.drawLine(250, 250, (Math.random() * 500).toInt(), (Math.random() * 500).toInt())
            }
            i++
        } while (i < 300)


    }
}

fun main(args: Array<String>) {
    GUI10()  // run program
}
