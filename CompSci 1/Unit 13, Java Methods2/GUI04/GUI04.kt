import javax.swing.*

class GUI04 : JFrame() {
    // Step 1 : declare JLabel variable
    private val label: JLabel

    // constructor
    init {
        // Step 2: create ImageIcon object using an image file as a parameter
        val image = ImageIcon("bugsdaffy.jpg")

        // Step 3: create label using ImageIcon variable as parameter
        label = JLabel(image)

        // Step 4: set label attributes
        label.setLocation(0, 0)
        label.setSize(image.iconWidth, image.iconHeight)

        // Step 5: add label to frame
        contentPane.add(label)


        // set frame attributes
        layout = null
        setSize(450, 400)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
    }
}

fun main(args: Array<String>) {
    GUI04()
}