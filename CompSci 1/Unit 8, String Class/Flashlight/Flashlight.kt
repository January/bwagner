 fun main(args: Array<String>) {
     val s = "flashlight"

     println("Part 1:\n==============")
     println(s.substring(0, 5)) // flash
     println(s.substring(5)) // light
     println(s.substring(2, 5)) // ash
     println(s.substring(0, 1) + s.substring(5)) // flight
     println(s.substring(0, 3) + s.substring(7, 8)) // flag
     println(s.substring(0, 1) + s.substring(6, 7) + s.substring(9, 10)) // fit
     println(s.substring(4, 5) + s.substring(6, 9)) // high
     println(s.substring(7, 8) + s.substring(2, 4)) // gas
     println(s.substring(0, 1) + s.substring(2, 4) + s.substring(9, 10)) // fast
     println(s.substring(3, 5) + s.substring(2, 3) + s.substring(0, 1) + s.substring(9, 10) + "\n") // shaft

     println("Part 2:\n==============")
     println(s.substring(5) + "s") // lights
     println(s.substring(5) + "er") // lighter
     println(s.substring(5) + "ning") // lightning
     println("en" + s.substring(5) + "ened") // enlightened
 }