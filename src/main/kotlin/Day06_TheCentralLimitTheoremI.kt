import kotlin.math.absoluteValue
import kotlin.math.exp
import kotlin.math.sqrt
import java.io.PrintWriter

/**
 * Tutorials > 10 Days of Statistics > Day 6: The Central Limit Theorem I
 *
 * https://www.hackerrank.com/challenges/s10-the-central-limit-theorem-1/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.limitI()
    _writer.flush()
}

fun PrintWriter.limitI() {
    val maxWeight = 9800.0
    val n = 49.0
    val mean = 205.0
    val standardDeviation = 15.0
    println("%.4f".format(cdf3(n * mean, sqrt(n) * standardDeviation, maxWeight)))
}

fun cdf3(mean: Double, sd: Double, x: Double) = 0.5 * (1.0 + erf3((x - mean) / (sd * sqrt(2.0))))

fun erf3(x: Double): Double {
    val a0 = 1.26551223
    val a1 = 1.00002368
    val a2 = 0.37409196
    val a3 = 0.09678418
    val a4 = -0.18628806
    val a5 = 0.27886807
    val a6 = -1.13520398
    val a7 = 1.48851587
    val a8 = -0.82215223
    val a9 = 0.17087277
    val t = 2.0 / (2.0 + x.absoluteValue)
    (1 - t * exp(-x * x - a0 + t * (a1 + t * (a2 + t * (a3 + t * (a4 + t * (a5 + t * (a6 + t * (a7 + t * (a8 + t * a9)))))))))).let {
        return if (x >= 0) it else -it
    }
}