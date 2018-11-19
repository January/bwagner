import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val nums = IntArray(20)

    println("Enter 20 integers: ")
    for (i in 0..19) {
        print("Num " + (i + 1) + ": ")
        nums[i] = input.nextInt()
    }

    for (i in nums) {
        print(i.toString() + " ")
    }

    println()
    println()

    for (i in nums.indices.reversed()) {
        print(nums[i].toString() + " ")
    }
}