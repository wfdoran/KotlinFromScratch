fun main(args : Array<String>) {
    val x = 1
    if (x > 0) {
        println("x is positive")
    } else {
        println("not!")
    }

    val y = 4
    when {
        x > 0 -> println("x is pos")
        x < 0 -> println("x is neg")
        y > 0 -> println("y is pos")
        else -> println("give up")
    }

    for (i in 1..5) {
        println("i is $i")
    }

    for (j in 1 until 10 step 3) {
        println("j is $j")
    }

    loop1@ for (i in 1..6) {
        loop2@ for (j in 1..6) {
            print("$i,$j ")
            if (i == j) break@loop2
            if (i * j == 20) break@loop1
        }
        println()
    }
    println()
}