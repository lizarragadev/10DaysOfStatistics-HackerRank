import java.io.PrintWriter
import kotlin.math.pow

/**
 * Tutorials > 10 Days of Statistics > Day 4: Geometric Distribution II
 *
 * https://www.hackerrank.com/challenges/s10-geometric-distribution-2/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.geomII()
    _writer.flush()
}

fun PrintWriter.geomII() {
    val num = readDouble()
    val den = readDouble()
    val n = readInt()
    val p = num / den
    val q = 1 - p
    var sum = 0.0
    for (i in 1..n) {
        sum += geoMatDistr(i, p, q)
    }
    kotlin.io.println(String.format("%.3f", sum))
}

fun geoMatDistr(n: Int, p: Double, q: Double): Double {
    return q.pow((n - 1).toDouble()) * p
}