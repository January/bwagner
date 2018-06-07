import javax.swing.*

class GUI05 : JFrame() {
    // Step 1 : declare JLabel variable
    private val jackLabel: JLabel
    private val queenLabel: JLabel
    private val kingLabel: JLabel

    // constructor
    init {
        // Step 2: create ImageIcon object using an image file as a parameter
        val jack = ImageIcon("jack.gif")
        val queen = ImageIcon("queen.gif")
        val king = ImageIcon("king.gif")

        // Step 3: create label using ImageIcon variable as parameter
        jackLabel = JLabel(jack)
        queenLabel = JLabel(queen)
        kingLabel = JLabel(king)

        // Step 4: set label attributes
        jackLabel.setLocation(75, 0)
        jackLabel.setSize(jack.iconWidth, jack.iconHeight)

        queenLabel.setLocation(175, 0)
        queenLabel.setSize(jack.iconWidth, jack.iconHeight)

        kingLabel.setLocation(275, 0)
        kingLabel.setSize(jack.iconWidth, jack.iconHeight)

        // Step 5: add label to frame
        contentPane.add(jackLabel)
        contentPane.add(queenLabel)
        contentPane.add(kingLabel)


        // set frame attributes
        layout = null
        setSize(450, 400)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
    }
}

fun main(args: Array<String>) {
    GUI05()
}