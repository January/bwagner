import java.awt.*
import javax.swing.*
import java.awt.event.*

class GUI09 : JFrame(), ActionListener {

    private val label: JLabel
    private val onButton: JButton
    private val offButton: JButton

    init {
        label = JLabel("Computers Are Fun")

        onButton = JButton("On")
        offButton = JButton("Off")

        label.setLocation(10, 200)
        label.setSize(450, 50)
        label.font = Font("Arial", Font.BOLD, 48)

        onButton.setLocation(120, 50)
        onButton.setSize(100, 50)

        offButton.setLocation(270, 50)
        offButton.setSize(100, 50)

        contentPane.add(label)
        contentPane.add(onButton)
        contentPane.add(offButton)

        onButton.addActionListener(this)
        offButton.addActionListener(this)

        layout = null
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
    }

    override fun actionPerformed(event: ActionEvent) {
        if (event.source === onButton)
        {
            label.isVisible = true
        }

        if (event.source === offButton)
        {
            label.isVisible = false
        }
    }
}

fun main(args: Array<String>) {
    GUI09()
}