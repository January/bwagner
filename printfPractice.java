public class Main
{
   public void method1()
   {
      int benchPress = 280;
      int squats = 395;
 
      // insert code below this line     
      System.out.printf("%-14s%d%n","bench press", benchPress);
      System.out.printf("%-14s%d%n","squats", squats);
   }
   
   public void method2()
   {
      double width = 10.74829;
      double length = 5.125;
       
      // insert code below this line 
      System.out.printf("width = %-9.2f%n", width); 
      System.out.printf("length = %-9.2f%n", length); 
   }
 
   public void method3()
   {
      int rand = 0;
      for(int i = 0; i < 15; i++)
        {
          rand = (int)(Math.random() * 200);
          System.out.printf("%10d%n", rand);
        }
      

	   
   }
   
   public static void main(String[] args)
   {
      Main app = new Main();

      System.out.println("    Method 1");
      System.out.println("----------------");
      System.out.println();
      app.method1();          // call Method1
      System.out.println();
      System.out.println("    Method 2");
      System.out.println("----------------");
      System.out.println();
      app.method2();         // call Method2
      System.out.println();
      System.out.println("    Method 3");
      System.out.println("----------------");
      System.out.println();
      app.method3();        // call Method3
   }
}  
