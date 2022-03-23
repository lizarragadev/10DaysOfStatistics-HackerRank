
/**
 * Tutorials > 10 Days of Statistics > Day 0: Weighted Mean
 *
 * https://www.hackerrank.com/challenges/s10-weighted-mean/
 * @author lizarragadev
 *
 */

fun main() {
    val n = readInt()
    val x = readInts(n)
    val w = readInts(n)
    weightMean(x, w)
}
fun weightMean(x: List<Int>, w: List<Int>) {
    var num = 0
    var den = 0
    x.forEachIndexed { index, element ->
        num += (element * w[index])
        den += w[index]
    }
    println(String.format("%.1f", (num/den.toDouble())))
}