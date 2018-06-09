import java.util.Scanner;

public class RepeatMenu
{
    private Scanner keyboard = new Scanner(System.in);

    /* This method displays a menu and waits for the user to make a selection.
     * If the user's selection is not a valid number (not between 1 and 5) 
     * the method displays the menu again and allows user to make another  
     * selection. This process is repeated until a valid selection is made.
     * @ return the number selection made by the user.
     */
    public int displayMenu()
    {
        int s = 0;
        do {
            System.out.println("      Menu");
            System.out.println("   ==========");
            System.out.println("1. Dr. Pepper");
            System.out.println("2. Coke");
            System.out.println("3. Sprite");
            System.out.println("4. 7-Up");
            System.out.println("5. Diet Coke");
            System.out.print("\nSelection: ");
            s = keyboard.nextInt();
        }while (s < 1 || s > 5);
        return s;
    }

    /* This method makes a call to method displayMenu to get the user's
     * number selection. Once user's selection has been retrieved it
     * determines the name of the menu item selected and displays the
     * following message: "You have chosen (selection name)" where
     * selection name is the name of the menu item selected by the user.
     */
    public void printSelection()
    {
        int n = displayMenu();
        System.out.print("\nYou have chosen ");
        if (n == 1) {
            System.out.println("Dr. Pepper.");
        }
        if (n == 2) {
            System.out.println("Coke.");
        }
        if (n == 3) {
            System.out.println("Sprite.");
        }
        if (n == 4) {
            System.out.println("7-Up.");
        }
        if (n == 5) {
            System.out.println("Diet Coke.");
        }
    }

    public static void main(String[] args)
    {
        RepeatMenu app = new RepeatMenu();
        app.printSelection();
    }
}