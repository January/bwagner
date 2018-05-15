import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    var quarters = 0
    var dimes = 0
    var nickels = 0
    var pennies = 0
    var totalCents = 0
    var dollars = 0
    var cents = 0

    print("How many pennies do you have? --> ")
    pennies = sc.nextInt()

    print("How many nickels do you have? --> ")
    nickels = sc.nextInt()

    print("How many dimes do you have? --> ")
    dimes = sc.nextInt()

    print("How many quarters do you have? --> ")
    quarters = sc.nextInt()

    totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies
    dollars = totalCents / 100
    cents = totalCents % 100

    println("\nTotal value = $dollars dollars and $cents cents")
}