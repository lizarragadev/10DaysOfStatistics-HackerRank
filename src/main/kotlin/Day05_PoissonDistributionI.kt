import kotlin.math.pow

import java.io.PrintWriter

/**
 * Tutorials > 10 Days of Statistics > Day 5: Poisson Distribution I
 *
 * https://www.hackerrank.com/challenges/s10-poisson-distribution-1/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.poissonI()
    _writer.flush()
}

fun PrintWriter.poissonI() {
    val lambda = readDouble()
    val k = readInt()
    println(poisson(k, lambda))
}

fun poisson(k: Int, lambda: Double): Double {
    return lambda.pow(k.toDouble()) * Math.E.pow(-1 * lambda) / factorial2(k)!!
}

fun factorial2(n: Int): Long? {
    var n = n
    if (n < 0) {
        return null
    }
    var result: Long = 1
    while (n > 0) {
        result *= n--.toLong()
    }
    return result
}