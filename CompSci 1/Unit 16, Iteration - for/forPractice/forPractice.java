public class forPractice
{
    public static void main(String[] args)
    {
        for(int i = 0; i <= 25; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        for(int i = 10; i >= 1; i--)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        for(int i = 1; i <= 40; i++)
        {
            if((i % 2) != 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();

        for(int i = 1; i <= 40; i++)
        {
            if((i % 2) == 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();

        for(int i = 0; i <= 200; i += 10)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        for(int i = -10; i >= -20; i--)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        for(int i = 0; i < 10; i++)
        {
            System.out.println("computer");
        }
    }
}
