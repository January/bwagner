public class dowhilePractice {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        }while (i <= 20);
        System.out.println("\n");

        i = 1;
        do {
            if (i % 2 != 0)
                System.out.print(i + " ");
            i++;
        }while (i <= 50);
        System.out.println("\n");

        i = 0;
        do {
            System.out.print(i + " ");
            i += 10;
        }while (i <= 200);
        System.out.println("\n");

        i = 20;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println("\n");

        i = 97;
        do {
            System.out.print((char)(i) + " ");
            i++;
        }while (i <= 122);
    }
}
