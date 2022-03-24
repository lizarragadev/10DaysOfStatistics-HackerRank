import java.io.PrintWriter
import kotlin.math.absoluteValue
import kotlin.math.exp
import kotlin.math.sqrt

/**
 * Tutorials > 10 Days of Statistics > Day 5: Normal Distribution II
 *
 * https://www.hackerrank.com/challenges/s10-normal-distribution-2/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.normalII()
    _writer.flush()
}

fun PrintWriter.normalII() {
    val mean = 70.0
    val standardDeviation = 10.0
    val probabilityOfScore80orLess = cdf2(mean, standardDeviation, 80.0)
    val probabilityOfScore60orLess = cdf2(mean, standardDeviation, 60.0)
    println("%.2f".format(100.0 * (1.0 - probabilityOfScore80orLess)))
    println("%.2f".format(100.0 * (1.0 - probabilityOfScore60orLess)))
    println("%.2f".format(100.0 * probabilityOfScore60orLess))
}

fun cdf2(mean: Double, sd: Double, x: Double) = 0.5 * (1.0 + erf2((x - mean) / (sd * sqrt(2.0))))

fun erf2(x: Double): Double {
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