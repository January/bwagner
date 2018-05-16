public class RandomRanges {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 25);
        int num2 = (int)((Math.random() * 3) + 1);
        int num3 = (int)((Math.random() * 51) + 50);
        int num4 = (int)((Math.random() * -10) - 1);
        int num5 = (int)((Math.random() * 200) - 100);
        int num6 = (int)(Math.random() * 26) + 65;
        double num7 = (Math.random() * 1) + 0.1;
        int num8 = (int)(Math.random() * 10000) + 1000;

        System.out.println("1. Range: 0 to 25 = " + num1);
        System.out.println("2. Range: 1 to 3 = " + num2);
        System.out.println("3. Range: 50 to 100 = " + num3);
        System.out.println("4. Range: -1 to -10 = " + num4);
        System.out.println("5. Range: -100 to 100 = " + num5);
        System.out.println("6. Range: A to Z = " + (char)num6);
        System.out.printf("7. Range: 0.1 to 1 = %.3f", num7);
        System.out.println("\n8. Range: 1000 to 10000 = " + Math.round(num8 / 1000) * 1000);
    }
}
