fun method1() {
    val A = IntArray(5)
    A[0] = 2
    A[1] = 4
    A[2] = 6
    A[3] = 8
    A[4] = 10

    for (i in A) {
        print(i.toString() + " ")
    }
    println()
}

fun method2() {
    val B = IntArray(5)
    B[0] = 10
    B[1] = 20
    B[2] = 30
    B[3] = 40
    B[4] = 50

    for (i in B) {
        print(i.toString() + " ")
    }
    println()
}

fun method3() {
    val C = DoubleArray(4)
    C[0] = 5.6
    C[1] = 9.9

    for (i in C) {
        print(i.toString() + " ")
    }
    println()
}

fun method4() {
    val D = arrayOfNulls<String>(3)
    D[0] = "Dog"
    D[2] = "Cat"

    for (s in D) {
        print("$s ")
    }
    println()
}

fun main(args: Array<String>) {
    method1()
    method2()
    method3()
    method4()
}