import java.io.PrintWriter
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Tutorials > 10 Days of Statistics > Day 1: Standard Deviation
 *
 * https://www.hackerrank.com/challenges/s10-standard-deviation/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.day01Standard()
    _writer.flush()
}

fun PrintWriter.day01Standard() {
    val n = readInt()
    val values = readIntArray(n)
    stdDev(values)
}

fun stdDev(arr: IntArray) {
    var sum: Long = 0
    val mean: Long = getMean(arr)
    arr.forEach {
        sum = abs(sum + abs(it - mean).toDouble().pow(2).toLong())
    }
    println(String.format("%.1f", sqrt(sum / arr.size.toDouble())))
}

fun getMean(arr: IntArray): Long {
    var sum = 0.0
    arr.forEach {
        sum += it
    }
    return (sum/arr.size).toLong()
}