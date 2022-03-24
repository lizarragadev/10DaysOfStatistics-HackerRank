import kotlin.math.pow
import java.io.PrintWriter

/**
 * Tutorials > 10 Days of Statistics > Day 5: Poisson Distribution II
 *
 * https://www.hackerrank.com/challenges/s10-poisson-distribution-2/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.poissonII()
    _writer.flush()
}

fun PrintWriter.poissonII() {
    val mA = 0.88
    val mB = 1.55
    println(String.format("%.3f", 160 + 40 * squaredPoissonProbability(mA)))
    println(String.format("%.3f", 128 + 40 * squaredPoissonProbability(mB)))
}

fun squaredPoissonProbability(mean: Double) = mean + mean.pow(2)

