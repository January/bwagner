public class Flashlight {
    public static void main(String[] args) {
        String s = "flashlight";

        System.out.println("Part 1:\n==============");
        System.out.println(s.substring(0, 5)); // flash
        System.out.println(s.substring(5)); // light
        System.out.println(s.substring(2, 5)); // ash
        System.out.println(s.substring(0, 1) + s.substring(5)); // flight
        System.out.println(s.substring(0, 3) + s.substring(7, 8)); // flag
        System.out.println(s.substring(0, 1) + s.substring(6, 7) + s.substring(9, 10)); // fit
        System.out.println(s.substring(4, 5) + s.substring(6, 9)); // high
        System.out.println(s.substring(7, 8) + s.substring(2, 4)); // gas
        System.out.println(s.substring(0, 1) + s.substring(2, 4) + s.substring(9, 10)); // fast
        System.out.println(s.substring(3, 5) + s.substring(2,3) + s.substring(0,1) + s.substring(9,10) + "\n"); // shaft

        System.out.println("Part 2:\n==============");
        System.out.println(s.substring(5) + "s"); // lights
        System.out.println(s.substring(5) + "er"); // lighter
        System.out.println(s.substring(5) + "ning"); // lightning
        System.out.println("en" + s.substring(5) + "ened"); // enlightened
    }
}