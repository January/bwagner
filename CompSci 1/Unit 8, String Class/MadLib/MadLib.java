import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("[1] Enter a NOUN: ");
        String noun1 = sc.nextLine();
        System.out.print("[2] Enter a type of VEHICLE: ");
        String vehicle2 = sc.nextLine();
        System.out.print("[3] Enter an ADJECTIVE: ");
        String adjective3 = sc.nextLine();
        System.out.print("[4] Enter another ADJECTIVE: ");
        String adjective4 = sc.nextLine();
        System.out.print("[5] Enter a PLURAL NOUN: ");
        String noun5 = sc.nextLine();
        System.out.print("[6] Enter another NOUN: ");
        String noun6 = sc.nextLine();
        System.out.print("[7] Enter an ADJECTIVE: ");
        String adjective7 = sc.nextLine();
        System.out.print("[8] Enter a VERB that ends in 'ed': ");
        String verb8 = sc.nextLine();
        System.out.print("[9] Enter a NOUN: ");
        String noun9 = sc.nextLine();
        System.out.print("[10] Enter another NOUN: ");
        String noun10 = sc.nextLine();
        System.out.print("[11] Enter yet another NOUN: ");
        String noun11 = sc.nextLine();
        System.out.print("[12] Enter a final NOUN: ");
        String noun12 = sc.nextLine();

        System.out.println("Just sit right back and you`ll hear a tale,");
        System.out.println("A tale of a fateful " + noun1 + ",");
        System.out.println("That started from this tropic port,");
        System.out.println("Aboard this tiny " + vehicle2 + ".\n");
        System.out.println("The mate was a " + adjective3 + " sailor man,");
        System.out.println("The skipper " + adjective4 + " and sure.");
        System.out.println("Five " + noun5 + " set sail that day,");
        System.out.println("For a three hour " + noun6 + ", a three hour " + noun6 + ".\n");
        System.out.println("The weather started getting " + adjective7 + ",");
        System.out.println("the tiny " + vehicle2 + " was " + verb8 + ".");
        System.out.println("If not for the " + noun9 + " of the fearless crew,");
        System.out.println("The " + noun10 + " would be lost, the " + noun10 + " would be lost.\n");
        System.out.println("The " + vehicle2 + " set ground on the shore of this uncharted desert isle,");
        System.out.println("With Gilligan, The Skipper too,");
        System.out.println("The millionaire and his " + noun11 + ", the movie " + noun12 + ",");
        System.out.println("And The Rest, Here on Gilligan's Isle.");
    }
}