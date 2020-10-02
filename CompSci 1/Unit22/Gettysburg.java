package Unit22;

import java.util.*;
import java.io.*;

public class Gettysburg {
    Scanner scan;
    
    
    public static void main(String[] args ) throws IOException {
        int num = 0, sum = 0;
        Scanner scan = new Scanner(new File("Gettysburg.txt"));
        while (scan.hasNextLine() == true) {
            String line;
            line = scan.nextLine();
            System.out.println(line);
        }
    }
}
