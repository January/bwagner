package Unit19;

import java.util.*;

public class PlaySlots 
{
    public static void main(String[] args) 
    {
        
        SlotMachine slots = new SlotMachine();
        Scanner keyboard = new Scanner(System.in);
        
        boolean x = true;
        while (x = true){
            System.out.print("\nCash: " + slots.getCash() + " \n\n1. Pull Lever\n2. Quit\n\n -->");
            int input = keyboard.nextInt();
            if (input == 1) {
                if (slots.getCash() <= 0) {
                System.out.println("GO HOME YOU'RE DRUNK");
                System.exit(0);
                }
                else {
                slots.pullLever();
                slots.displayRollers();
                slots.displayResults();
                }
            }else if (input == 2) { System.exit(0); }
        }
        
    }
    
}

