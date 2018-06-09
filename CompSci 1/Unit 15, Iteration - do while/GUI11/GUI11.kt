import javax.swing.*
import java.awt.*
import java.awt.event.*

class GUI11 : JFrame(), ActionListener {
    // instance variables
    private val button: JButton
    private val redTextField: JTextField
    private val redLabel: JLabel
    private val greenTextField: JTextField
    private val greenLabel: JLabel
    private val blueTextField: JTextField
    private val blueLabel: JLabel
    // Step 1: declare JTextfield variable

    // constructor
    init {
        // create stuff
        button = JButton("Submit")
        redLabel = JLabel("Red")
        greenLabel = JLabel("Green")
        blueLabel = JLabel("Blue")

        // set button attributes
        button.setLocation(50, 200)
        button.setSize(100, 25)

        // set label attributes
        redLabel.setLocation(50, 50)
        redLabel.setSize(50, 25)

        greenLabel.setLocation(50, 100)
        greenLabel.setSize(50, 25)

        blueLabel.setLocation(50, 150)
        blueLabel.setSize(50, 25)

        // add things to frame
        contentPane.add(button)
        contentPane.add(redLabel)
        contentPane.add(greenLabel)
        contentPane.add(blueLabel)

        // register listener with button
        button.addActionListener(this)

        // Step 2 : instantiate JTextField object
        redTextField = JTextField()
        greenTextField = JTextField()
        blueTextField = JTextField()

        // Step 3 : set textfield attributes
        redTextField.setLocation(100, 50)
        redTextField.setSize(50, 25)

        greenTextField.setLocation(100, 100)
        greenTextField.setSize(50, 25)

        blueTextField.setLocation(100, 150)
        blueTextField.setSize(50, 25)

        // Step 4 : add textfield to frame's content pane
        contentPane.add(redTextField)
        contentPane.add(greenTextField)
        contentPane.add(blueTextField)

        // set frame attributes
        layout = null
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
    }

    override fun actionPerformed(event: ActionEvent) {
        if (event.source === button)
        // identify source
        {
            val r = Integer.parseInt(redTextField.text)      // convert text to an integer
            val g = Integer.parseInt(greenTextField.text)    // convert text to an integer
            val b = Integer.parseInt(blueTextField.text)     // convert text to an integer

            contentPane.background = Color(r, g, b)
        }
    }
}

fun main(args: Array<String>) {
    GUI11()  // run program
}