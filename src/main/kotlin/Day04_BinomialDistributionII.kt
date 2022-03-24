import java.io.PrintWriter
import kotlin.math.pow

/**
 * Tutorials > 10 Days of Statistics > Day 4: Binomial Distribution II
 *
 * https://www.hackerrank.com/challenges/s10-binomial-distribution-2/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.binomII()
    _writer.flush()
}

const val q = 0.88
const val p: Double = 0.12

fun PrintWriter.binomII() {
    var probability = 0.0
    var probability1 = 0.0
    var k = 0.0
    for (j in 10 downTo 2) {
        probability += combination(j) * p.pow(j.toDouble()) * q.pow((10 - j).toDouble())
    }
    k = combination(2) * p.pow(2.0) * q.pow(8.0)
    probability1 = k + 1 - probability
    println(String.format("%.3f", probability1))
    println(String.format("%.3f", probability))
}

fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}

fun combination(r: Int): Double {
    return (factorial(10) / (factorial(r) * factorial(10 - r))).toDouble()
}