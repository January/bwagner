import java.awt.*
import javax.swing.*

class GUI03 : JFrame() {
    private val dont: JLabel
    private val mess: JLabel
    private val with: JLabel
    private val texas: JLabel

    // constructor
    init {

        dont = JLabel("Don't")
        dont.setLocation(150, 20)
        dont.setSize(200, 60)
        dont.foreground = Color.BLACK
        dont.font = Font("Arial", Font.PLAIN, 72)

        mess = JLabel("Mess")
        mess.setLocation(150, 100)
        mess.setSize(200, 60)
        mess.foreground = Color.BLACK
        mess.font = Font("Arial", Font.PLAIN, 72)

        with = JLabel("With")
        with.setLocation(160, 180)
        with.setSize(200, 60)
        with.foreground = Color.BLACK
        with.font = Font("Arial", Font.PLAIN, 72)

        texas = JLabel("Texas")
        texas.setLocation(140, 260)
        texas.setSize(200, 60)
        texas.foreground = Color.BLACK
        texas.font = Font("Arial", Font.PLAIN, 72)

        contentPane.add(dont)
        contentPane.add(mess)
        contentPane.add(with)
        contentPane.add(texas)

        layout = null
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        contentPane.background = Color.white
        isVisible = true
    }
}

fun main(args: Array<String>) {
    val app = GUI03()   // run program
}
