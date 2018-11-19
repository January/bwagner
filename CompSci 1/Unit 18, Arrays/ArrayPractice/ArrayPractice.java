public class ArrayPractice
{
    public void method1()
    {
        int[] A = new int[5];
        A[0] = 2;
        A[1] = 4;
        A[2] = 6;
        A[3] = 8;
        A[4] = 10;

        for(int i : A)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void method2()
    {
        int[] B = new int[5];
        B[0] = 10;
        B[1] = 20;
        B[2] = 30;
        B[3] = 40;
        B[4] = 50;

        for(int i : B)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void method3()
    {
        double[] C = new double[4];
        C[0] = 5.6;
        C[1] = 9.9;

        for(double i : C)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void method4()
    {
        String[] D = new String[3];
        D[0] = "Dog";
        D[2] = "Cat";

        for(String s : D)
        {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        ArrayPractice app = new ArrayPractice();

        app.method1();
        app.method2();
        app.method3();
        app.method4();
    }
}