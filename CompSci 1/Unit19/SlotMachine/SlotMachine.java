package Unit19;
import java.util.*;

public class SlotMachine 
{
    private int roller1, roller2, roller3;
    private int cash = 50;
    public String[] fruits = {"CHERRIES", "APPLE", "ORANGE", "LEMON", "BANANA"};
    
    public void pullLever() {
        cash--;
        roller1 = (int)(Math.random() * 5);
        roller2 = (int)(Math.random() * 5);
        roller3 = (int)(Math.random() * 5);
    }
    public void displayRollers() {
        System.out.print(fruits[roller1] + "   ");
        System.out.print(fruits[roller2] + "   ");
        System.out.print(fruits[roller3] + "   \n");
    }
    private int getPayOff() {
        final int x = (int)(Math.random() * 9);
        if (x >= 0 && x<6) {
            return ((int)(Math.random() * 9) + 1);
        }
        else if (x >= 6 && x < 9) {
            return ((int)(Math.random() * (100-11)) + 11 );
        }
        else
            return 10000;
    }
    public void displayResults()
    {
        int earnings = getPayOff();
        
        
        if (roller1 == roller2 && roller2 == roller3) {
            System.out.println("************************\n" +
        "         Winner\n" +
        "************************\n" +
        "\n" +
        "You won " + earnings + " \n" +
        "cash = $ " + (earnings + cash) );
        cash=cash+earnings;
        }
        else {
            System.out.println("\nYOU SUCK!!! HAHA YOU LOSE!");
        }
    }
    public int getCash() {
        return cash;
    }

}
