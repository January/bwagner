import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a season --> ");
        String s = sc.next();

        if (s.equalsIgnoreCase("winter")) {
            System.out.println("\nSeason: Winter");
            System.out.println("  Meteorological:");
            System.out.println("    December 20 - March 20");
            System.out.println("  Astronomical:");
            System.out.println("    Winter Solstice - Vernal Equinox");
        }
        if (s.equalsIgnoreCase("spring")) {
            System.out.println("\nSeason: Spring");
            System.out.println("  Meteorological:");
            System.out.println("    March 20 - June 21");
            System.out.println("  Astronomical:");
            System.out.println("    Vernal Equinox - Summer Solstice");
        }
        if (s.equalsIgnoreCase("summer")) {
            System.out.println("\nSeason: Summer");
            System.out.println("  Meteorological:");
            System.out.println("    June 21 - September 22");
            System.out.println("  Astronomical:");
            System.out.println("    Summer Solstice - Autumnal Equinox");
        }
        if (s.equalsIgnoreCase("fall")) {
            System.out.println("\nSeason: Fall");
            System.out.println("  Meteorological:");
            System.out.println("    September 22 - November 30");
            System.out.println("  Astronomical:");
            System.out.println("    Autumnal Equinox - Winter Solstice ");
        }
    }
}
