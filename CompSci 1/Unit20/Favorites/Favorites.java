package Unit20;

public class Favorites
{
    private final String name;       // The peron's name
    private final String food;       // Favorite food
    private final String color;      // Favorite color
    private final String music;      // Favorite music
    private final String automobile; // Favorite automobile
    private final String sport;      // Favorite sport
    
    Favorites(String n, String f, String c, String m, String a, String s) {
        name = n;
        food = f; 
        color = c;
        music = m;
        automobile = a;
        sport = s;
    }
    
    public String toString() {
        return ("My Favorites:"
                    + "\nName: " + name
                    + "\nFood: " + food
                    + "\nColor: " + color
                    + "\nMusic: " + music
                    + "\nAutomobile: " + automobile
                    + "\nSport: " + sport);
    
    }
    
}