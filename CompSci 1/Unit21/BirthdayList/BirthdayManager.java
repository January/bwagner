package Unit21;
import java.util.*;

public class BirthdayManager 
{
    int birthCount;
    private String n, b;
    Birthday[] birth;
    
    BirthdayManager() {
        birth = new Birthday[20];
    }
    
    public void addBirthdays (){
        
        Scanner keyboard = new Scanner(System.in);
        
        birthCount = 0;
        boolean x = true;
        while (x == true) {
            System.out.print("Add a name --> ");
            n = keyboard.nextLine();
            System.out.print("Add a birthday --> ");
            b = keyboard.nextLine();
            System.out.println("");
            
            birth[birthCount] = new Birthday(n,b);
            birthCount++;
            
            System.out.print("Would you like to add more names? (y/n) --> ");
            if (keyboard.nextLine().toLowerCase().equals("n")) {
                x = false;
            }
        }
        
    }
    public void printBirthdays() {
        System.out.println("\n\n");
        int x = 0;
        do {
            System.out.println("Name: " + birth[x].getName());
            System.out.println("Name: " + birth[x].getBday());
            System.out.println("");
            x++;
        } while (birthCount > x);
    }
    
    
    public static void main(String[] args) 
    {
        BirthdayManager app = new BirthdayManager();
        app.addBirthdays();
        app.printBirthdays();
    }
}
