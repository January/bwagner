import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Enter a magnitude on the Richter scale --> ")
    val n = sc.nextDouble()
    print("\nDamage = ")

    if (n >= 8) {
        println("Most structures fall")
    } else if (n >= 7) {
        println("Most buildings destroyed")
    } else if (n >= 6) {
        println("Many buildings considerably damaged; some collapse")
    } else if (n >= 4.5) {
        println("Damage to poorly constructed buildings")
    } else if (n >= 3.5) {
        println("Felt by many people, no destruction")
    } else if (n >= 0) {
        println("Generally not felt by people")
    } else {
        println("Invalid number.")
    }
}
