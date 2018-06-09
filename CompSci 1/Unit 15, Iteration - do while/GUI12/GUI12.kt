import java.awt.*
import javax.swing.*
import java.awt.event.*

class GUI12 : JFrame(), ActionListener {
    // instance variables
    private val okButton: JButton
    private val cancelButton: JButton
    private val usernameTextField: JTextField
    private val passwordTextField: JTextField
    private val usernameLabel: JLabel
    private val passwordLabel: JLabel
    private val welcomeLabel: JLabel

    // constructor
    init {
        // create button
        okButton = JButton("OK")
        cancelButton = JButton("Cancel")

        // set button attributes
        okButton.setLocation(250, 200)
        okButton.setSize(80, 25)
        cancelButton.setLocation(150, 200)
        cancelButton.setSize(80, 25)

        // add button to frame
        contentPane.add(okButton)
        contentPane.add(cancelButton)

        // register listener with button
        okButton.addActionListener(this)
        cancelButton.addActionListener(this)

        // create textfields
        usernameTextField = JTextField()
        passwordTextField = JTextField()

        // set textfield attributes
        usernameTextField.setLocation(200, 100)
        usernameTextField.setSize(150, 25)
        passwordTextField.setLocation(200, 150)
        passwordTextField.setSize(150, 25)

        // add textfield to frame
        contentPane.add(usernameTextField)
        contentPane.add(passwordTextField)

        // create labels
        usernameLabel = JLabel("Username")
        passwordLabel = JLabel("Password")
        welcomeLabel = JLabel("Welcome")

        // set label attributes
        usernameLabel.setLocation(125, 100)
        usernameLabel.setSize(100, 25)
        passwordLabel.setLocation(125, 150)
        passwordLabel.setSize(100, 25)
        welcomeLabel.setLocation(150, 170)
        welcomeLabel.setSize(250, 40)
        welcomeLabel.isVisible = false
        welcomeLabel.font = Font("Arial", Font.BOLD, 48)

        // add labels to frame
        contentPane.add(usernameLabel)
        contentPane.add(passwordLabel)
        contentPane.add(welcomeLabel)

        // set frame attributes
        layout = null
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
    }

    override fun actionPerformed(event: ActionEvent) {
        val myUsername = "drew"
        val myPassword = "what-the-heck-is-a-password"

        if (event.source === okButton)
        // ok button pressed
        {
            if (usernameTextField.text == myUsername && passwordTextField.text == myPassword) {
                usernameLabel.isVisible = false
                passwordLabel.isVisible = false
                welcomeLabel.isVisible = true
                usernameTextField.isVisible = false
                passwordTextField.isVisible = false
                cancelButton.isVisible = false
                okButton.isVisible = false
            } else {
                usernameTextField.text = ""
                passwordTextField.text = ""
            }
        }
        if (event.source === cancelButton)
        // cancel button pressed
        {
            System.exit(0)

        }
    }
}

fun main(args: Array<String>) {
    GUI12()  // run program
}