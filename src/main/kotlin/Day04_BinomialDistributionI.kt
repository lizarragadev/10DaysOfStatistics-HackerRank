import java.io.PrintWriter
import kotlin.math.pow

/**
 * Tutorials > 10 Days of Statistics > Day 4: Binomial Distribution I
 *
 * https://www.hackerrank.com/challenges/s10-binomial-distribution-1//
 * @author lizarragadev
 *
 */

fun main() {
    _writer.day04BinomI()
    _writer.flush()
}

fun PrintWriter.day04BinomI() {
    val r = readDouble()
    val c = readDouble()
    val b = r / (r + c)
    val x = 6
    var prob = 0.0
    for(i in 3..x) {
        prob+= b.pow(i.toDouble()) * (1 - b).pow(x - i.toDouble()) / (f(i) * f(x - i))
    }
    println(String.format("%.3f", f(x) * prob))
}

fun f(n: Int): Int {
    return if(n == 0) 1 else n * f(n - 1)
}