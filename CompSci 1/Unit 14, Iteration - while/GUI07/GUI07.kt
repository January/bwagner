import java.awt.*
import javax.swing.*

class GUI07 : JFrame() {
    // Step 1 : create JButton variable
    private val ok: JButton
    private val cancel: JButton

    init {
        // Step 2 : create a JButton object and store its reference in the JButton variable
        ok = JButton("OK")
        cancel = JButton("Cancel")


        // Step 3 : set the attributes for the button (location, size, color, etc.)
        ok.setLocation(100, 400)
        ok.setSize(80, 30)
        cancel.setLocation(300, 400)
        cancel.setSize(80, 30)

        // Step 4: add the JButton to the content pane of the frame
        contentPane.add(ok)
        contentPane.add(cancel)


        // set frame attributes
        layout = null
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        contentPane.background = Color.white
        isVisible = true
    }
}

fun main(args: Array<String>) {
    GUI07()  // run program
}