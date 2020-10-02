package Unit22;

import java.util.*;
import java.io.*;

public class ReadInts {
    Scanner scan;
    
    
    public static void main(String[] args ) throws IOException {
        int num = 0, sum = 0;
        Scanner scan = new Scanner(new File("Integers.txt"));
        while (scan.hasNext() == true) {
            int next = scan.nextInt();
            System.out.println(next);
            num++;
            sum += next;
            
        }
        System.out.println("");
        System.out.println("Amount of ints: " + num);
        System.out.println("Sum of ints: " + sum);
    }
}
