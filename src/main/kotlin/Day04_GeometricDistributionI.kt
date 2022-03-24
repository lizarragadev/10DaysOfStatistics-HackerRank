import kotlin.math.pow
import java.io.PrintWriter

/**
 * Tutorials > 10 Days of Statistics > Day 4: Geometric Distribution I
 *
 * https://www.hackerrank.com/challenges/s10-geometric-distribution-1/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.geomI()
    _writer.flush()
}

fun PrintWriter.geomI() {
    val defectProbability = kotlin.io.readLine().orEmpty().split(' ').map(String::toDouble).zipWithNext { x, y -> x / y }.first()
    println(
        "%.3f".format(
            (1 - defectProbability).pow(
                kotlin.io.readLine().orEmpty().toInt() - 1
            ) * defectProbability
        )
    )
}