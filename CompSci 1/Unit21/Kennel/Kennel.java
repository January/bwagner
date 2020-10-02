package Unit21;
import java.util.*;

public class Kennel
{
    // instance variable
    private Dog[] dogs;     // declare array variable
    Scanner keyboard = new Scanner(System.in);

    // constructor
    public Kennel()
    {
        dogs = new Dog[5];  // instantiate array with length 5
    }

    /* This method allows a user input information about 5 dogs and
     * stores this information in the array dogs.
     */
    public void addDogs()
    {
        for (int f = 0; f <= 4; f++) {
            String name, breed;
            System.out.print("\nEnter dog name --> ");
            name = keyboard.nextLine();
            System.out.print("\nEnter dog breed --> ");
            breed = keyboard.nextLine();
            dogs[f] = new Dog(name, breed);
        }
    }

    /* This method displays the name and breed for each Dog in the array.
     */
    public void printDogs()
    {
        for (int f = 0; f <= 4; f++) {
            System.out.println(dogs[f].getName());
            System.out.println(dogs[f].getBreed() + "\n");
        }
    }

    public static void main(String[] args)
    {
        Kennel app = new Kennel();
        app.addDogs();
        app.printDogs();
    }
}