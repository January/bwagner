import javax.swing.*;

public class GUI05 extends JFrame
{
    // Step 1 : declare JLabel variable
    private JLabel jackLabel;
    private JLabel queenLabel;
    private JLabel kingLabel;

    // constructor
    public GUI05()
    {
        // Step 2: create ImageIcon object using an image file as a parameter 
        ImageIcon jack = new ImageIcon("jack.gif");
        ImageIcon queen = new ImageIcon("queen.gif");
        ImageIcon king = new ImageIcon("king.gif");

        // Step 3: create label using ImageIcon variable as parameter
        jackLabel = new JLabel(jack);
        queenLabel = new JLabel(queen);
        kingLabel = new JLabel(king);

        // Step 4: set label attributes
        jackLabel.setLocation(75,0);
        jackLabel.setSize(jack.getIconWidth(), jack.getIconHeight());

        queenLabel.setLocation(175,0);
        queenLabel.setSize(jack.getIconWidth(), jack.getIconHeight());

        kingLabel.setLocation(275,0);
        kingLabel.setSize(jack.getIconWidth(), jack.getIconHeight());

        // Step 5: add label to frame
        getContentPane().add(jackLabel);
        getContentPane().add(queenLabel);
        getContentPane().add(kingLabel);


        // set frame attributes
        setLayout(null);
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // main method
    public static void main(String[] args)
    {
        GUI05 app = new GUI05();
    }
}