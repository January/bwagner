package Unit20;

import java.util.*;

public class RectangleManager
{
   // instance variables
   private MyRectangle rect;
   private Scanner keyboard;

   public RectangleManager()
   {
      keyboard = new Scanner(System.in);
   }

   public void inputDimensions()
   {
       int l,w;
       System.out.print("Please input your width --> ");
       w = keyboard.nextInt();
       System.out.print("Please input your length --> ");
       l = keyboard.nextInt();
       rect = new MyRectangle(l,w);
   }

   public void changeDimensions()
   {
       int l,w;
       System.out.print("Input your new width --> ");
       w = keyboard.nextInt();
       System.out.print("Input your new lehgth --> ");
       l = keyboard.nextInt();
       rect.setLength(l);
       rect.setWidth(w);
   }

   public void print()
   {
       System.out.println(rect.toStr());
   }

   public static void main(String[] args)
   {
       RectangleManager app = new RectangleManager();

       System.out.println("*************************************");
       System.out.println("  Test Constructor and Input Method");
       System.out.println("*************************************");
       app.inputDimensions();
       app.print();

       System.out.println("************************");
       System.out.println("  Test Mutator Method");
       System.out.println("************************");
       app.changeDimensions();
       app.print();
   }
}
