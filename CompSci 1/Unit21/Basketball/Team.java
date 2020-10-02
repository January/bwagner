package Unit21;

import java.util.*;

public class Team
{
    // instance variables
    private int numPlayers;
    private Player[] players;
    // constructor
    Team() {
        players = new Player[20];
    }

    /* This method allows a user to input up to 20 basketball players and 
     *  stores them in an array.
     */
    public void addPlayers()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean repeat = true;
        while (repeat == true) {
            System.out.print("Player name --> ");
            String name = keyboard.nextLine();
            System.out.print("Free throws made -- >");
            int ftm = Integer.parseInt(keyboard.nextLine());
            System.out.print("Free throws attempted -- >");
            int fta = Integer.parseInt(keyboard.nextLine());
            System.out.print("2-point field goals made -- >");
            int fgm2 = Integer.parseInt(keyboard.nextLine());
            System.out.print("2-point field goals attempted -- >");
            int fga2 = Integer.parseInt(keyboard.nextLine());
            System.out.print("3-point field goals made -- >");
            int fgm3 = Integer.parseInt(keyboard.nextLine());
            System.out.print("3-point field goals attempted -- >");
            int fga3 = Integer.parseInt(keyboard.nextLine());
            
            players[numPlayers] = new Player(name, ftm, fta,fgm2,fga2,fgm3, fga3);
            numPlayers++;
            
            System.out.println("Enter another player? (y/n)");
            System.out.print("-->");
            if ("n".equals(keyboard.nextLine().toLowerCase())) {
                repeat = false;
            }

        }
    }
    /* This method displays each Player in the array 
     */
    public void printPlayers()
    {
        int x = 0;
        do {
            System.out.println("Name: " + players[x].getPlayerName());
            System.out.println("Free throws %: " + players[x].getFTPercentage());
            System.out.println("2 Field Goals %: " + players[x].getFG2Percentage());
            System.out.println("3 Field Goals %: " + players[x].getFG3Percentage());
            System.out.println("Total Points --> " + players[x].getPointsScored());
            x++;
        }while (numPlayers > x);
    }

    public static void main(String[] args)
    {
        Team app = new Team();
        app.addPlayers();
        app.printPlayers();
    }
}
