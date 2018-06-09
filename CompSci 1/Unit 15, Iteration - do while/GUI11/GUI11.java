import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI11 extends JFrame implements ActionListener
{
    // instance variables
    private JButton button;
    private JTextField redTextField;
    private JLabel redLabel;
    private JTextField greenTextField;
    private JLabel greenLabel;
    private JTextField blueTextField;
    private JLabel blueLabel;

    // Step 1: declare JTextfield variable

    // constructor
    public GUI11()
    {
        // create stuff
        button = new JButton("Submit");
        redLabel = new JLabel("Red");
        greenLabel = new JLabel("Green");
        blueLabel = new JLabel("Blue");

        // set button attributes
        button.setLocation(50, 200);
        button.setSize(100, 25);

        // set label attributes
        redLabel.setLocation(50, 50);
        redLabel.setSize(50, 25);

        greenLabel.setLocation(50, 100);
        greenLabel.setSize(50, 25);

        blueLabel.setLocation(50, 150);
        blueLabel.setSize(50, 25);

        // add things to frame
        getContentPane().add(button);
        getContentPane().add(redLabel);
        getContentPane().add(greenLabel);
        getContentPane().add(blueLabel);

        // register listener with button
        button.addActionListener(this);

        // Step 2 : instantiate JTextField object
        redTextField = new JTextField();
        greenTextField = new JTextField();
        blueTextField = new JTextField();

        // Step 3 : set textfield attributes
        redTextField.setLocation(100, 50);
        redTextField.setSize(50, 25);

        greenTextField.setLocation(100, 100);
        greenTextField.setSize(50, 25);

        blueTextField.setLocation(100, 150);
        blueTextField.setSize(50, 25);

        // Step 4 : add textfield to frame's content pane
        getContentPane().add(redTextField);
        getContentPane().add(greenTextField);
        getContentPane().add(blueTextField);

        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == button)         // identify source
        {
            int r = Integer.parseInt(redTextField.getText());      // convert text to an integer
            int g = Integer.parseInt(greenTextField.getText());    // convert text to an integer
            int b = Integer.parseInt(blueTextField.getText());     // convert text to an integer

            getContentPane().setBackground(new Color(r, g, b));
        }
    }

    // main method
    public static void main(String[] args)
    {
        GUI11 app = new GUI11();  // run program
    }
}