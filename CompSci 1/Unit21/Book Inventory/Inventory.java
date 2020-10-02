package Unit21;

import java.util.*;

public class Inventory
{
    // instance variables
    private Book[] books;     // declare array variable
    private int numBooks;     // logical size of array

    // constructor
    public Inventory()
    {
        books = new Book[20];  // instantiate array with length 20
        numBooks = 0;          // no books added yet
    }

    /* This method allows a user to input up to 20 books and stores them
       in the array books.
     */
    public void addBooks()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean repeat = true;
        while (repeat == true) {
            System.out.print("Student name --> ");
            String name = keyboard.nextLine();
            System.out.print("Book number -- >");
            String num = keyboard.nextLine();
            
            books[numBooks] = new Book(num, name);
            numBooks++;
            
            System.out.println("Enter another book? (y/n)");
            System.out.print("-->");
            if ("n".equals(keyboard.nextLine().toLowerCase())) {
                repeat = false;
            }
        
        }

    }

    /* This method displays the student name and book number for each 
     * Book in the array.
     */
    public void printBooks()
    {
        System.out.println(numBooks);
        int x = 0;
        do {
            System.out.println("Name: " + books[x].getStudentName() + "   Book #: " + books[x].getBookNumber());
            x++;
        }while (numBooks > x);
    }

    public static void main(String[] args)
    {
        Inventory app = new Inventory();
        app.addBooks();
        app.printBooks();
    }
}
