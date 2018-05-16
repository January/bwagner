import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Enter a season --> ")
    val s = sc.next()

    if (s.equals("winter", ignoreCase = true)) {
        println("\nSeason: Winter")
        println("  Meteorological:")
        println("    December 20 - March 20")
        println("  Astronomical:")
        println("    Winter Solstice - Vernal Equinox")
    }
    if (s.equals("spring", ignoreCase = true)) {
        println("\nSeason: Spring")
        println("  Meteorological:")
        println("    March 20 - June 21")
        println("  Astronomical:")
        println("    Vernal Equinox - Summer Solstice")
    }
    if (s.equals("summer", ignoreCase = true)) {
        println("\nSeason: Summer")
        println("  Meteorological:")
        println("    June 21 - September 22")
        println("  Astronomical:")
        println("    Summer Solstice - Autumnal Equinox")
    }
    if (s.equals("fall", ignoreCase = true)) {
        println("\nSeason: Fall")
        println("  Meteorological:")
        println("    September 22 - November 30")
        println("  Astronomical:")
        println("    Autumnal Equinox - Winter Solstice ")
    }
}
