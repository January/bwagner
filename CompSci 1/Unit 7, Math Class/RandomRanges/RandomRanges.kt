 fun main(args: Array<String>) {
        val num1 = (Math.random() * 25).toInt()
        val num2 = (Math.random() * 3 + 1).toInt()
        val num3 = (Math.random() * 51 + 50).toInt()
        val num4 = (Math.random() * -10 - 1).toInt()
        val num5 = (Math.random() * 200 - 100).toInt()
        val num6 = (Math.random() * 26).toInt() + 65
        val num7 = Math.random() * 1 + 0.1
        val num8 = (Math.random() * 10000).toInt() + 1000

        println("1. Range: 0 to 25 = " + num1)
        println("2. Range: 1 to 3 = " + num2)
        println("3. Range: 50 to 100 = " + num3)
        println("4. Range: -1 to -10 = " + num4)
        println("5. Range: -100 to 100 = " + num5)
        println("6. Range: A to Z = " + num6.toChar())
        System.out.printf("7. Range: 0.1 to 1 = %.3f", num7)
        println("\n8. Range: 1000 to 10000 = " + Math.round((num8 / 1000).toFloat()) * 1000)
    }
